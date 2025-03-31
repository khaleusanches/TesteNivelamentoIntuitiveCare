from flask import Flask, jsonify, request

app = Flask(__name__)

livros = [
    {
        'id': 1,
        'titulo': "Harry Potter"
    },
    {
        'id': 2,
        'titulo': "Harry Potter 2"
    }
]

@app.route('/livros')
def obter_livros():
    return jsonify(livros)

app.run(port=5000, host='localhost', debug=True)