// See https://aka.ms/new-console-template for more information

//Console.Write("введите число ");
//int[] array = new int[3];
//Console.WriteLine(array[2]);
//for (int i = 0; i < 4; i++)
//{
  //  Console.WriteLine($"{Math.Pow(array[i], 3)} !");
//};




//Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом.


//Console.WriteLine("Введите пятизначное число");
//string number = Console.ReadLine();

  //if (number[0]==number[4] || number[1]==number[3])
  //{
  //Console.WriteLine($"число: {number} - палиндром.");
  //}
 // else 
  //Console.WriteLine($"число: {number} - не палиндром.");

  // Задача 21: Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 3D пространстве.
// A (3,6,8); B (2,1,-7), -> 15.84
// A (7,-5, 0); B (1,-1,9) -> 11.53

//int x1 = Coordinate("x", "A");
//int y1 = Coordinate("y", "A");
//int z1 = Coordinate("z", "A");
//int x2 = Coordinate("x", "B");
//int y2 = Coordinate("y", "B");
//int z2 = Coordinate("z", "B");

//int Coordinate(string coorName, string pointName)
//{
  //  Console.Write($"Введите координату {coorName} точки {pointName}: ");
    //return Convert.ToInt16(Console.ReadLine());
//}
//double Decision(double x1, double x2, 
  //              double y1, double y2, 
    //            double z1, double z2){
  //return Math.Sqrt(Math.Pow((x2-x1), 2) + 
    //               Math.Pow((y2-y1), 2) + 
      //             Math.Pow((z2-z1), 2));
//}
//double segmentLength =  Math.Round (Decision(x1, x2, y1, y2, z1, z2), 2 );

//Console.WriteLine($"Длина отрезка  {segmentLength}");

//Задача 23: Напишите программу, которая принимает на вход число (N) и выдаёт таблицу кубов чисел от 1 до N.

Console.Write("Введите число ");
int N = Convert.ToInt32(Console.ReadLine());
int A = 1;
while (A <= N)
{
    int B = Convert.ToInt32(Math.Pow(A, 3));
    Console.WriteLine(B);
    A = A + 1;
};
