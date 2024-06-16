import requests
import json
import base64

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json',
        'Authorization': 'Bearer 9160e9727eab48888d22a80c9bd5ea2f'
    }
    
    url = 'http://localhost:9098/app-api/member/voice/sseSound'
    params = {'text': "欢迎来到中机良策AI", 'speaker': "manchaozn_meet_24k@newscast"}
    r = requests.post(url, headers = headers, data=json.dumps(params), stream=True)
    for line in r.iter_lines():
        if line:
            decoded_line = line.decode('utf-8')
            print(decoded_line)
