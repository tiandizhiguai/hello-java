import requests
import json
import base64
from astropy.units import fL

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json',
        'Authorization': 'Bearer a73254108ca747d89cf60f184785123c',
        'tenant-id': '257'
    }
    
    params = {
        "id": "1534",
        "width": 2560,
        "height": 1524,
        "scale": 4889,
        "northArrow": 0,
        "areas": [
            {
                "areaName": "场地",
                "areaType": "彩钢瓦",
                "layoutType": "平铺",
                "height": 1000,
                "optimumTiltAngle": 0,
                "points": [
                    {
                        "x": 276.555984556,
                        "y": 214.7722007722
                    },
                    {
                        "x": 1035.6138996139,
                        "y": 238.3088803089
                    },
                    {
                        "x": 829.667953668,
                        "y": 826.7258687259
                    },
                    {
                        "x": 108.8571428571,
                        "y": 832.61003861
                    }
                ],
                "parapet": {
                    "full": False,
                    "height": 0,
                    "items": []
                },
                "groundingPoints": [
                    {
                        "id": "8ed9e886-fb99-418e-95e5-3470982328b3",
                        "no": "",
                        "proportionOfCapacity": 1,
                        "point": {
                            "x": 861.5460009803,
                            "y": 735.6457335478
                        }
                    }
                ],
                "blocks": [],
                "layout": {
                    "matrixSize": [
                        6,
                        20
                    ],
                    "matrixSpace": 600,
                    "pvSpace": 20,
                    "inspectGallerySpace": 600,
                    "safeMargin": 1500,
                    "gutterWidth": 500,
                    "expansionJointWidth": 500,
                    "obstacleSpace": 600,
                    "gutterSpace": 500,
                    "cutLineSpace": 200,
                    "ridgeLineSpace": 300,
                    "expansionJointSpace": 300
                },
                "subList": [
                    {
                        "index": 0,
                        "angle": -0.47
                    }
                ]
            },
            {
                "areaName": "场地 2",
                "areaType": "彩钢瓦",
                "layoutType": "平铺",
                "height": 1000,
                "optimumTiltAngle": 0,
                "points": [
                    {
                        "x": 1209.1969111969,
                        "y": 238.3088803089
                    },
                    {
                        "x": 1209.1969111969,
                        "y": 850.2625482625
                    },
                    {
                        "x": 1838.8030888031,
                        "y": 850.2625482625
                    },
                    {
                        "x": 1838.8030888031,
                        "y": 238.3088803089
                    }
                ],
                "parapet": {
                    "full": False,
                    "height": 0,
                    "items": []
                },
                "groundingPoints": [
                    {
                        "id": "06e75a1e-0d3a-4a15-a6e7-d72f5aaf4fb7",
                        "no": "",
                        "proportionOfCapacity": 1,
                        "point": {
                            "x": 1838.8030888031,
                            "y": 750.2316602317
                        }
                    }
                ],
                "blocks": [],
                "layout": {
                    "matrixSize": [
                        6,
                        20
                    ],
                    "matrixSpace": 600,
                    "pvSpace": 20,
                    "inspectGallerySpace": 600,
                    "safeMargin": 1500,
                    "gutterWidth": 500,
                    "expansionJointWidth": 500,
                    "obstacleSpace": 600,
                    "gutterSpace": 500,
                    "cutLineSpace": 200,
                    "ridgeLineSpace": 300,
                    "expansionJointSpace": 300
                },
                "subList": [
                    {
                        "index": 0,
                        "angle": 0
                    }
                ]
            },
            {
                "areaName": "场地 3",
                "areaType": "彩钢瓦",
                "layoutType": "平铺",
                "height": 1000,
                "optimumTiltAngle": 0,
                "points": [
                    {
                        "x": 579.5907335907,
                        "y": 891.4517374517
                    },
                    {
                        "x": 1315.111969112,
                        "y": 894.3938223938
                    },
                    {
                        "x": 1265.0965250965,
                        "y": 1509.2895752896
                    },
                    {
                        "x": 491.3281853282,
                        "y": 1491.6370656371
                    }
                ],
                "parapet": {
                    "full": False,
                    "height": 0,
                    "items": []
                },
                "groundingPoints": [
                    {
                        "id": "3a907660-bdeb-472c-be16-d7e9c5ff0d50",
                        "no": "",
                        "proportionOfCapacity": 1,
                        "point": {
                            "x": 1273.1601931116,
                            "y": 1410.1538920447
                        }
                    }
                ],
                "blocks": [],
                "layout": {
                    "matrixSize": [
                        6,
                        20
                    ],
                    "matrixSpace": 600,
                    "pvSpace": 20,
                    "inspectGallerySpace": 600,
                    "safeMargin": 1500,
                    "gutterWidth": 500,
                    "expansionJointWidth": 500,
                    "obstacleSpace": 600,
                    "gutterSpace": 500,
                    "cutLineSpace": 200,
                    "ridgeLineSpace": 300,
                    "expansionJointSpace": 300
                },
                "subList": [
                    {
                        "index": 0,
                        "angle": 0.23
                    }
                ]
            }
        ],
        "blocks": [],
        "connectionPoints": [],
        "switchyards": [],
        "svgs": [],
        "transformers": [],
        "stamp": 14
    }
    url = 'http://localhost:9098/app-api/project/scheme/image-dimensions/update'
    r = requests.put(url, headers=headers, data=json.dumps(params), stream=True)
    print(r.text)
