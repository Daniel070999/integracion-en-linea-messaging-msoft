import json
from flask import Flask, jsonify, request, abort

app = Flask(__name__)

data = [{
    "codigo":1,
    "identificacion":"115065489",
    "nombre":"Daniel Patiño",
    "direccion":"Loja",
    "tipotransaccion":"digital"
},{
    "codigo":2,
    "identificacion":"115065489",
    "nombre":"Alexander Vásquez",
    "Direccion":"Loja casa",
    "tipotransaccion":"digital"

}]

@app.route('/persons', methods = ['GET'])
def returnpersonas():
    if(request.method == 'GET' ):
        return jsonify(data)
    
@app.route('/persons/<int:codigo>', methods = ['GET'])
def returnpersona(codigo):
    if(request.method == 'GET' ):
        for person in data:
            if(person.get("codigo") == codigo):
                return jsonify(person)
        abort(404)

@app.route('/persons', methods = ['POST'])
def addpersona():
    if(request.method == 'POST' ) and (request.headers.get('Content-Type')=='application/json'):
        person = request.json
        data.append(person)
        return 'OK'
    else:
        abort(440, "No válido")

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000, debug=True)
