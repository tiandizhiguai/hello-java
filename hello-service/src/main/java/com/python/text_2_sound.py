import requests
import json
import base64

if __name__ == "__main__":
    
    headers = {
        'content-type': 'application/json',
        'Authorization': 'Bearer b268c9e1e34c4857a05c80fe0b34d510'
    }
    
    url = 'http://localhost:9098/app-api/member/voice/sseSound'
    params = {
        "text": "二十五年等效利用小时数，计算结果如下：\n\n|        | 等效利用小时                       |\n| ------ | -------------------------------- |\n| 第1年  | 1030.2  |\n| 第2年  | 1026.04  |\n| 第3年  | 1021.88  |\n| 第4年  | 1017.71  |\n| 第5年  | 1013.55  |\n| 第6年  | 1009.39  |\n| 第7年  | 1005.23  |\n| 第8年  | 1001.06  |\n| 第9年  | 996.9  |\n| 第10年 | 992.74 |\n| 第11年 | 988.58 |\n| 第12年 | 984.41 |\n| 第13年 | 980.25 |\n| 第14年 | 976.09 |\n| 第15年 | 971.93 |\n| 第16年 | 967.76 |\n| 第17年 | 963.6 |\n| 第18年 | 959.44 |\n| 第19年 | 955.28 |\n| 第20年 | 951.11 |\n| 第21年 | 946.95 |\n| 第22年 | 942.79 |\n| 第23年 | 938.63 |\n| 第24年 | 934.47 |\n| 第25年 | 930.3 |\n计算公式:$等效小时数 = 辐射值 \\times 发电效率 \\times 衰减系数$，其中辐射值为1284.7，发电效率为 0.81",
        "speaker": "manchaozn_meet_24k@newscast"
    }
    r = requests.post(url, headers = headers, data=json.dumps(params), stream=True)
    for line in r.iter_lines():
        if line:
            decoded_line = line.decode('utf-8')
            print(decoded_line)
