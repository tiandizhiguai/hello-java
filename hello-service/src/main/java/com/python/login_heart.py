import requests
import json
import threading

def do_post():
    r = requests.get(url, headers=headers)
    print(r.text)

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json',
        'Authorization': 'Bearer 9160e9727eab48888d22a80c9bd5ea2f',
        'Tenant-Id': "1"
    }
    url = 'https://aiserver.seec.cn/app-api/member/auth/mini-app-login-heart?tempUid=2028139208'
    params = {
        "tempUid": 2028139208
    }
    
    for i in range(10):
        t = threading.Thread(target=do_post)
        t.start()
