#Напишите программу, которая принимает на вход вещественное число и показывает сумму его цифр. Учтите, что числа могут быть отрицательными
#67.82 -> 23

#n = float(input('Введите число:'))
#n=n*1000
#b=0
#while 1<n:
 #   c=n%10
  #  b=b+c
   # n=n/10
#print(int(b))

#Напишите программу, которая принимает на вход число N и выдает набор произведений (набор - это список) чисел от 1 до N.
#Не используйте функцию math.factorial.
# пусть N = 4, тогда [ 1, 2, 6, 24 ] #(1, 1*2, 1*2*3, 1*2*3*4)

#n=int(input('Задайте число:'))
#b=0
#c=1
#while b<n:
 #   b=b+1
  #  c=c*b
   # print(c)

#Дан массив размера N. После каждого отрицательного элемента массива вставьте элемент с нулевым значением.
# пусть N = 4, тогда [28, -46, 14, -14] => [28, -46, 0, 14, -14, 0]

import random
n=random.randrange(3,11)
a=[random.randrange(-5,6) for i in range(n)]
print("n - ", n)
print("Array:\n",a)
m=0
for x in a:
    if x<0:
        m+=1
a.extend([0]*m)
j=0
for i in range(n-1,-1,-1):
    if a[i]<0:
        a[(n+m-1)-j]=0
        j+=1
print("Modified Array 2:\n",a)
print("Length:\n",len(a))

