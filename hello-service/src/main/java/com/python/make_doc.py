import requests
import json

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json',
        'tenant-id': '244',
        'Authorization': 'Bearer 65ce555f94fc4f008eb4dfa6b6124c75'
    }
    params = {
        "schemeId": "2371",
        "debug" : False
    }
    url = 'http://localhost:9098/app-api/project/scheme/fsr/make'
    r = requests.post(url, headers=headers, data=json.dumps(params))
    print(r.text)
