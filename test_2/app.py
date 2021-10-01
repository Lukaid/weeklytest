from flask import Flask, render_template, jsonify, request
app = Flask(__name__)

from pymongo import MongoClient
client = MongoClient('localhost', 27017)
db = client.weekly_2


import datetime


## HTML을 주는 부분
@app.route('/')
def home():
   return render_template('index.html')


@app.route('/memo', methods=['GET'])
def listing():
    memo = list(db.weekly_2.find({}, {'_id': False}))
    return jsonify({'all_memo':memo})


## API 역할을 하는 부분
@app.route('/memo', methods=['POST'])
def saving():
    name_receive = request.form['name_give']
    comment_receive = request.form['comment_give']
    now = str(datetime.datetime.now())[:-7]
    print(name_receive, comment_receive, now)

    doc = {
        'name':name_receive,
        'comment':comment_receive,
        'time':now
    }

    db.weekly_2.insert_one(doc)

    return jsonify({'msg': '저장이 완료되었습니다.'})


if __name__ == '__main__':
   app.run('0.0.0.0',port=5000,debug=True)