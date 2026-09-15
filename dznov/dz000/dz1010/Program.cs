// See https://aka.ms/new-console-template for more information
//Задача 54: Задайте двумерный массив. Напишите программу, которая упорядочит по убыванию элементы каждой строки двумерного массива.


//Console.Clear();
//Console.WriteLine("massiw");
//int[ , ] array = {{2, 6, 3},
  //                {5, 1, 7}};  
 //for (int i = 0; i < array.GetLength(0); i++)
// {
  //for (int j = 0; j < array.GetLength(1); j++)
    //{
      //for (int k = 0; k < array.GetLength(1) - 1; k++)
        //{
          //if (array[i, k] < array[i, k + 1])
            //{
              //int temp = array[i, k + 1];
                //array[i, k + 1] = array[i, k];
                //array[i, k] = temp;
      //}
    //}
  //}
//}
//for (int i = 0; i < array.GetLength(0); i++)
  //{
    //for (int j = 0; j < array.GetLength(1); j++)
      //{
        //Console.Write($"{array[i, j]} ");
  // }
    //Console.WriteLine();
   //}
  // Задача 56: Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку с наименьшей суммой элементов.
//Программа считает сумму элементов в каждой строке и выдаёт номер строки с наименьшей суммой элементов: 1 строка
//Console.WriteLine("Введите размер массива ");
//int m = InputNumbers("Введите m: ");
//int n = InputNumbers("Введите n: ");
//int range = InputNumbers("Введите диапазон: от 1 до ");
//int[,] array = new int[m, n];
//CreateArray(array);
//WriteArray(array);
//int minSumLine = 0;
//int sumLine = SumLineElements(array, 0);
//for (int i = 1; i < array.GetLength(0); i++)
//{
  //int tempSumLine = SumLineElements(array, i);
  //if (sumLine > tempSumLine)
  //{
//  sumLine = tempSumLine;
//    minSumLine = i;
  //}
//}
//Console.WriteLine($"\n{minSumLine+1} - строкa с наименьшей суммой ({sumLine}) элементов ");
//int SumLineElements(int[,] array, int i)
//{
  //int sumLine = array[i,0];
  //for (int j = 1; j < array.GetLength(1); j++)
  //{
    //sumLine += array[i,j];
  //}
 // return sumLine;
//}
//int InputNumbers(string input)
//{
  //Console.Write(input);
  //int output = Convert.ToInt32(Console.ReadLine());
//  return output;
//}
//  for (int i = 0; i < array.GetLength(0); i++)
  //{
    //for (int j = 0; j < array.GetLength(1); j++)
    //{
      //array[i, j] = new Random().Next(range);
    //}
  //}
//  for (int i = 0; i < array.GetLength(0); i++)
  //{
    //for (int j = 0; j < array.GetLength(1); j++)
    //{
      //Console.Write(array[i,j] + " ");
    //}
    //Console.WriteLine();
  //}

//Задача 58: Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.
Console.WriteLine("Введите размеры матриц и диапазон случайных значений:");
int m = InputNumbers("Введите число строк 1-й матрицы: ");
int n = InputNumbers("Введите число столбцов 1-й матрицы (и строк 2-й): ");
int p = InputNumbers("Введите число столбцов 2-й матрицы: ");
int range = InputNumbers("Введите диапазон случайных чисел: от 1 до ");

int[,] firstMartrix = new int[m, n];
CreateArray(firstMartrix);
Console.WriteLine($"Первая матрица:");
WriteArray(firstMartrix);

int[,] secomdMartrix = new int[n, p];
CreateArray(secomdMartrix);
Console.WriteLine($"Вторая матрица:");
WriteArray(secomdMartrix);

int[,] resultMatrix = new int[m,p];

MultiplyMatrix(firstMartrix, secomdMartrix, resultMatrix);
Console.WriteLine($"Произведение первой и второй матриц:");
WriteArray(resultMatrix);

void MultiplyMatrix(int[,] firstMartrix, int[,] secomdMartrix, int[,] resultMatrix)
{
  for (int i = 0; i < resultMatrix.GetLength(0); i++)
  {
    for (int j = 0; j < resultMatrix.GetLength(1); j++)
    {
      int sum = 0;
      for (int k = 0; k < firstMartrix.GetLength(1); k++)
      {
        sum += firstMartrix[i,k] * secomdMartrix[k,j];
      }
      resultMatrix[i,j] = sum;
    }
  }
}

int InputNumbers(string input)
{
  Console.Write(input);
  int output = Convert.ToInt32(Console.ReadLine());
  return output;
}

void CreateArray(int[,] array)
{
  for (int i = 0; i < array.GetLength(0); i++)
  {
    for (int j = 0; j < array.GetLength(1); j++)
    {
      array[i, j] = new Random().Next(range);
    }
  }
}

void WriteArray (int[,] array)
{
  for (int i = 0; i < array.GetLength(0); i++)
  {
    for (int j = 0; j < array.GetLength(1); j++)
    {
      Console.Write(array[i,j] + " ");
    }
    Console.WriteLine();
  }
}
