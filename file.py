print('Hello world')

n, d = int(input()), {}
for _ in range(n):
    password = input()
    if password not in d:
        print('Password is available')
        d[password] = 1
    else:
        print(f'Choose another password, for example: {password + str(d[password])}')
        d[password] += 1
