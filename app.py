from flask import Flask, render_template, jsonify
app = Flask(__name__)

from pymongo import MongoClient
client = MongoClient('localhost', 27017)
db = client.dbStock

@app.route('/')
def home():
    return render_template('index.html')

# 주문 목록보기(Read) API
@app.route('/kos', methods=['POST'])
def view_orders():
    kos = list(db.dbStock.find({}, {'_id': False}))
    return jsonify({'kos': kos})


if __name__ == '__main__':
    app.run('0.0.0.0', port=5000, debug=True)