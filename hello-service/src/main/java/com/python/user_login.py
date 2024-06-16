import requests
import json

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json'
    }
    
    #1.发送短信
    url = 'http://localhost:9098/app-api/member/auth/send-sms-code'
    params = {
        "mobile": "15267144901",
        "scene": 1
    }
    r = requests.post(url, headers = headers, data=json.dumps(params))
    
    #2.登录
    url = 'http://localhost:9098/app-api/member/auth/sms-login'
    params = {
        'mobile': "15267144901",
        'code': '6789'
    }
    r = requests.post(url, headers = headers, data=json.dumps(params))
    print(r.text)
