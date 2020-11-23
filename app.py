from flask import Flask, render_template

app = Flask(__name__)


@app.route("/")
def index():
    return render_template("index.html")


@app.route("/contact")
def contact():
    msg = "you are now on the contact us page"
    return render_template("contact.html", msg=msg)


if __name__ == '__main__':
    app.run()
