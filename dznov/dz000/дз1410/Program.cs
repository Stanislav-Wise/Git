// See https://aka.ms/new-console-template for more information
//Задача 64: Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от N до 1. Выполнить с помощью рекурсии.
//N = 5 -> "5, 4, 3, 2, 1"
//N = 8 -> "8, 7, 6, 5, 4, 3, 2, 1"
//Console.WriteLine("Введите число больше 1:");
//int n = Convert.ToInt32(Console.ReadLine());
//void NumberRecurs (int n)
//{
  //  if (n == 0) return;
    //Console.WriteLine("{0,4}", n);
    //NumberRecurs (n - 1);
//}
//NumberRecurs(n);

//Задача 66: Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N.
//M = 1; N = 15 -> 120
//M = 4; N = 8. -> 30
Console.WriteLine("Введите число M:");
int M = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите число N:");
int N = Convert.ToInt32(Console.ReadLine());
void NumberSum (int M, int N, int sum)
{
    if (M > N) 
    {
        Console.WriteLine($"Сумма чисел в промежутке от M до N: {sum}"); 
        return;
    }
    sum = sum + (M++);
    NumberSum(M, N, sum);
}
NumberSum(M, N, 0);

