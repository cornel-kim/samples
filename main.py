from flask import Flask, render_template, request

app = Flask(__name__)
app.config.from_object(__name__)


@app.route('/', methods=['POST', 'GET'])
def welcome():
    username = request.form.post("username")#capture username from the form
    firstname = request.form.post("firstname")
    email = request.form.post("email")
    tel_number = request.form.post("tel_number")
    return render_template('index.html')


@app.route('/calc')
def calc():
    return render_template('calc.html')


@app.route('/result', methods=['POST'])
def result():
    var_1 = request.form.get("var_1", type=int)
    var_2 = request.form.get("var_2", type=int)
    operation = request.form.get("operation")
    if operation == 'Addition':
        result = var_1 + var_2
    elif operation == 'Subtraction':
        result = var_1 - var_2
    elif operation == 'Multiplication':
        result = var_1 * var_2
    elif operation == 'Division':
        result = var_1 / var_2
    else:
        result = 'INVALID CHOICE'
    entry = result
    return render_template('result.html', entry=entry)


if __name__ == '__main__':
    app.debug = True
    app.run()
