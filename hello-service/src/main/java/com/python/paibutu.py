import requests
import json

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json',
        'Authorization': 'Bearer c2eb45f6fb7a44eca912168ea5747d0c'
    }
    params = {
        "projectId": "2235"
    }
    url = 'http://localhost:9098/app-api/sop/chat/calc'
    r = requests.post(url, headers=headers, data=json.dumps(params))
    print(r)
