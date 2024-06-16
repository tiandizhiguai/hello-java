import requests
import json

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json'
    }
    
    # url = 'http://192.168.31.17:9098/app-api/medical/image/diagnose'
    # params = {
    #     'medicalType': 1,
    # }
    # filePath = 'D:\guling.jpg'
    # r = requests.post(url, data=params, files={'file': open(filePath, 'rb')})
    
    url = 'https://u211091-9210-89a1a92e.yza1.seetacloud.com:8443/api/uploads_json/'
    params = {
        "file_url": "https://igaoai-bone-age-image.oss-cn-hangzhou.aliyuncs.com/2024/4/30/777be4b4-b0b8-479b-aecf-30000e1d5815.jpg",
        "gender": "1"
    }
    r = requests.post(url, headers = headers, data=json.dumps(params))
    print(r.text)
