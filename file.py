print('Hello world')
import math
a = int(input ("Введите число:"))
even = 0
while a>0:
    if a%2==0: even +=1
    a=a//10
print ("Количество четных цифр:",even)
