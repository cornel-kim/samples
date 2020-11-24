from flask import Flask, render_template, request, session
import pymysql

app = Flask(__name__)
app.secret_key = '123sdj'


@app.route("/")
def index():
    return render_template("index.html")


@app.route("/contact", methods=["POST", "GET"])
def contact():
    if request.method == 'POST':
        name = request.form['name']
        email = request.form['email']
        message = request.form['message']

        conn = pymysql.connect("localhost", "root", "", "studentmgmt")
        cur = conn.cursor()
        sql = "INSERT INTO contatus (name, email, message) VALUES (%s, %s, %s) "
        cur.execute(sql, (name, email, message))
        conn.commit()
        msg = "records inserted successfully"
        return render_template("contact.html", msg=msg)
    else:
        msg = "no database found"
        return render_template("contact.html", msg=msg)


@app.route("/register", methods=["POST", "GET"])
def register():
    if request.method == "POST":
        username = request.form["username"]
        email = request.form['email']
        gender = request.form['gender']
        county = request.form['county']
        password = request.form['password']

        conn = pymysql.connect("localhost", "root", "", "studentmgmt")
        cur = conn.cursor()
        register_query = "INSERT INTO register(username, email, gender, county, password)" \
                         "VALUES(%s, %s, %s, %s, %s)"
        result = cur.execute(register_query,(username, email, gender, county, password))
        if result:
            conn.commit()
            return render_template("login.html")
        else:
            msg = "Registration failed, try again"
            return render_template("register.html", msg=msg)
    else:
        return render_template("register.html")


@app.route("/login", methods=["POST", "GET"])
def login():
    if request.method == 'POST' and 'username' in request.form and 'password' in request.form:
        username = request.form['username']
        password = request.form['password']

        conn = pymysql.connect("localhost", "root", "", "studentmgmt")
        cur = conn.cursor()
        cur.execute('SELECT * FROM register where username = %s and password = %s',
                    (username,password))
        result = cur.fetchone()
        if result:
            session['logged'] = True
            session['username'] = result[0]
            msg="logged in successfully"

            return render_template("home.html", msg=msg)
        else:
            return render_template("login.html")

    else:
        return render_template("login.html")


@app.route("/home")
def home():
    if 'logged' in session:
        return render_template("home.html")
    else:
        return render_template("index.html")


@app.route("/viewprofile")
def viewprofile():
    if 'logged' in session:
        conn = pymysql.connect("localhost", "root", "", "studentmgmt")
        cur = conn.cursor()
        cur.execute('SELECT * FROM register where username = %s',(session['username']))
        result = cur.fetchone()
        return render_template("viewprofile.html", result=result)
    else:
        return render_template("login.html")


@app.route("/viewusers")
def viewuser():
    if 'logged' in session:
        conn = pymysql.connect("localhost", "root", "", "studentmgmt")
        cur = conn.cursor()
        cur.execute('SELECT * FROM register ')
        result = cur.fetchall()
        return render_template("viewusers.html", result=result)
    else:
        return render_template("login.html")


if __name__ == '__main__':
    app.debug = True
    app.run()
