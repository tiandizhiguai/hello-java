import requests
import json

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json',
        #'Authorization': 'Bearer 7fc76328a8874255b8d34e32103c0690'
        'Authorization': 'Bearer 8f3aa3acc32f4c7f9bff9356350dc9e1'
    }
    params = {
        "projectId": "3882"
    }
    url = 'http://localhost:9098/app-api/sop/chat/calc'
    r = requests.post(url, headers=headers, data=json.dumps(params))
    print(r.text)
