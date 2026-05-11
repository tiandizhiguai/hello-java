import requests
import json

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json',
        'tenant-id': '300',
        'Authorization': 'Bearer d98189bf3ff748a1b7e0fb08c7a89e39'
    }
    params = {
        "id": 192,
        # 0：系统生成，1：用户数据生成
        #"diagramDataSource": 0,
        # "diagramTypes": [1],
        #"ossFile": "upload/101/1219/image/vnd.dxf%3B%20format%3Dascii/20260413/%E9%A1%B9%E7%9B%AE%23%20%25%20%26%20%5E%20%28%20%29%20%5B%20%5D%20%7B%20%7D%20%21%20%40%20%2B%20%3D%20%3B%20%2C%20%E7%A9%BA%E6%A0%BC%20%E4%B8%AD%E6%96%87%E5%85%A8%E8%A7%92%E7%AC%A6%E5%8F%B7.iwz9435e.dxf",
        #"targetFileType": "dwg"
    }
    url = 'http://localhost:9098/app-api/project/draw'
    #url = 'http://localhost:9099/app-api/project/scheme/diagram/generate'
    #url = 'http://localhost:8088/maxcad/server/file/cad2Mxweb'
    r = requests.post(url, headers=headers, data=json.dumps(params), verify=False)
    print(r.text)
