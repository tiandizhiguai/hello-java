import requests
import json

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json'
    }
    
    #1.登记
    url = 'http://localhost:9098/app-api/member/user/register'
    params = {
        "mobile": "15267144901",
        "code": "6789",
        "realName": "张三",
        "enterpriseName": "金口良策",
        "position": "产品经理"
    }
    r = requests.post(url, headers = headers, data=json.dumps(params))
    print(r.text)
    
    #2.查询
    url = 'http://localhost:9098/app-api/member/user/get-registration'
    params = {
        'mobile': "15267144901"
    }
    r = requests.get(url, params)
    print(r.text)
