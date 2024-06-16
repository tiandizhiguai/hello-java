import requests
import json

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json',
        'Authorization': 'Bearer 8adb8285b697473ca6c340a93054b55a'
    }
    
    params = {'chatGroupId': "1794613946936127490", 'question': "如何防止触电问题的发生"}
    url = 'http://localhost:9098/app-api/member/chat/createChatLogQuestion'
    r = requests.post(url, headers = headers, data=json.dumps(params))
    print(r.json())
    
    headers['content-type'] = 'text/event-stream'
    url = 'http://localhost:9098/app-api/member/chat/getSseAnswer'
    params = {'type': 1, 'chatId': r.json().get('data')}
    r = requests.get(url, headers = headers, params=params, stream=True)
    for line in r.iter_lines():
        if line:
            decoded_line = line.decode('utf-8')
            print(decoded_line)
