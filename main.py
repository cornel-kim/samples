from flask import Flask, render_template, request

app = Flask(__name__)


# create flask routes
@app.route('/')
def index():

    return render_template('index.html')


@app.route('/results', methods=['POST'])
def results():
    num1 = request.form.get("num1", type=int)
    num2 = request.form.get("num2", type=int)
    operator = request.form.get('operator')
    if operator == 'Add':
        result = num1 + num2
    else:
        result = "input valid options"
    return render_template('result.html', result=result)


if __name__ == "__main__":
    app.debug = True
    app.run()

#kotlin