from cgi import print_exception
from venv import create


print('Hello world')
print("Вычислим, сколько дней, минут и секунд вы живете.")
name = input("имя: ")
print("Введите свой возраст")
age = int(input("возраст: "))
days = age * 365
minutes = age * 525948     
seconds = age * 31556926
print(name, "прожил(а)", days, "дней", minutes, "минут и", seconds, "секунд!")