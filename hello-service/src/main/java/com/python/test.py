import requests
import json

if __name__ == "__main__":
    
    headers = {
        'tenant-id': '300',
        'Authorization': 'Bearer 9a04c9b8e8434d60931f9de139792e46'
    }
    url = 'http://localhost:9098/admin-api/system/user/delete?userId='
    r = requests.get(url, headers=headers)
    print(r.text)
