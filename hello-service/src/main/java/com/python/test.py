import requests
import json
import base64

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json',
        'Authorization': 'Bearer 9160e9727eab48888d22a80c9bd5ea2f'
    }
    
    params = {
        "projectId": "2268",
        "param": {
            "projectid": "2268",
            "项目名称": "我的项目",
            "项目位置": "",
            "屋顶类型": "彩钢瓦",
            "光伏组件功率": "",
            "光伏组件铺设方式": "平铺",
            "航拍图": "",
            "location": ""
        }
    }
    url = 'http://localhost:9098/app-api/sop/project/param/set'
    r = requests.post(url, headers=headers, data=json.dumps(params), stream=True)
    print(r.text)
