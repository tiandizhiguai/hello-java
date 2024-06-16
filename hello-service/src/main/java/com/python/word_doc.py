import requests
import json

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json',
        'Authorization': 'Bearer a37973afeb584d208a11fdf733f6f60f'
    }
    
    url = 'http://localhost:9098/app-api/sop/chat/make'
    params = {
        'projectId': 1707,
    }
    r = requests.post(url, headers = headers, data=json.dumps(params))
    print(r.text)
