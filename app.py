from flask import Flask, render_template, jsonify, request
app = Flask(__name__)

from pymongo import MongoClient
client = MongoClient('localhost', 27017)
db = client.dbStock

@app.route('/')
def home():
    return render_template('index.html')

@app.route('/', methods=['POST'])
def market_choose():
    market_receive = request.form['market_give']
    if market_receive == "1":
        market = 'market-1'
    else:
        market = 'market-2'
    print(market)
    return jsonify()

@app.route('/sector', methods=['POST'])
def sector_choose():
    sector_receive = request.form['market_give']
    if sector_receive == "1":
        sector = 'sector-1'
    elif sector_receive == "2":
        sector = 'sector-2'
    else:
        sector = 'sector-3'
    print(sector)
    return jsonify()


if __name__ == '__main__':
    app.run('0.0.0.0', port=5000, debug=True)