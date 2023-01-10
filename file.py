print('Hello world')

def found():
    for i in range(1,15):
        if i>10:
            print("БОЛЬШЕ 10, ALERT")
        elif i == 10:
            print("Аккуратно скоро будет проблемы, наше значение равно 10")
        else:
            print("МЕНЬШЕ 10 ВСЕ В НОРМЕ")
found()