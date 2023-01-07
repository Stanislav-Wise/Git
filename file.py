print('Hello world')

## Поиск первой пары подряд положительных, либо отрицательных чисел
array = [2, -32, -1, -1, 41, -5, -7, 6]
ind = 1
while ind < len(array):
    if (array[ind] * array[ind - 1]) > 0:
        print(array[ind - 1], array[ind])
        break
    ind += 1