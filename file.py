import requests
print('Hello world')

result = requests.get('https://google.com')
print(result.headers)
