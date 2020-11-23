from flask import Flask, render_template, request
import pymysql

app = Flask(__name__)


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


@app.route("/register")
def register():
    return render_template("register.html")

@app.route("/login")
def login():
    return render_template("login.html")


if __name__ == '__main__':
    app.run()
