import requests
import json
import base64

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json',
        'Authorization': 'Bearer 9160e9727eab48888d22a80c9bd5ea2f'
    }
    
    params = {
        "projectId": "1419",
        "imageUrl": "https://zjlc-public.oss-cn-hangzhou.aliyuncs.com/chat/images/dcafd9db2da19f4e0309f688881f650c-航拍图.jpg",
        "width": 750,
        "height": 500,
        "areas": [
            {
                "areaName": "场地 1",
                "points": [
                    {
                        "x": 190,
                        "y": 124
                    },
                    {
                        "x": 184,
                        "y": 331
                    },
                    {
                        "x": 365,
                        "y": 337
                    },
                    {
                        "x": 376,
                        "y": 144
                    }
                ]
            },
            {
                "areaName": "场地 2",
                "points": [
                    {
                        "x": 439,
                        "y": 152
                    },
                    {
                        "x": 554,
                        "y": 159
                    },
                    {
                        "x": 539,
                        "y": 361
                    },
                    {
                        "x": 401,
                        "y": 346
                    }
                ]
            }
        ],
        "blocks": [
            {
                "type": "屋脊线",
                "height": 0,
                "points": [
                    {
                        "x": 181,
                        "y": 215
                    },
                    {
                        "x": 379,
                        "y": 229
                    }
                ]
            },
            {
                "type": "屋脊线",
                "height": 0,
                "points": [
                    {
                        "x": 436,
                        "y": 238
                    },
                    {
                        "x": 536,
                        "y": 249
                    }
                ]
            },
            {
                "type": "气楼",
                "height": 1000,
                "points": [
                    {
                        "x": 280,
                        "y": 246
                    },
                    {
                        "x": 278,
                        "y": 301
                    },
                    {
                        "x": 341,
                        "y": 302
                    },
                    {
                        "x": 341,
                        "y": 247
                    }
                ]
            }
        ],
        "northArrow": 0,
        "scale": 14468
    }
    url = 'http://localhost:9098/app-api/sop/chat/aerial-image-dimensions-save'
    r = requests.post(url, headers=headers, data=json.dumps(params), stream=True)
    print(r.text)
