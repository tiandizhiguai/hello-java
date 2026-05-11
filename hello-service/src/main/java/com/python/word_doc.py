import requests
import json

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json',
        'tenant-id': '0',
        'Authorization': 'Bearer 83749385dc5d41ad996f34b37b0a705e'
    }
    
    url = 'http://127.0.0.1:9098/app-api/sop/chat/calc'
    params = {
        'projectId': 4196,
    }
    r = requests.post(url, headers = headers, data=json.dumps(params))
    print(r.text)
