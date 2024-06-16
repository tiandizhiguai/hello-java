import requests
import json

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json'
    }
    
    #1.登记
    url = 'http://localhost:9098/app-api/member/auth/send-sms-code'
    params = {
        "mobile": "15267144901",
        "scene": 5
    }
    r = requests.post(url, headers = headers, data=json.dumps(params))
    print(r.text)