using System;
class Program
{
    static void Main(string[] args)
    {
        int change = 1000 - int.Parse(Console.ReadLine());
        int count = 0;
        int[] coinType = { 500, 100, 50, 10, 5, 1 };
        for (int i = 0; i < coinType.Length; i++) {
            count+= change/coinType[i];
            change = change%coinType[i];
            if (change == 0) break;
        }
        Console.WriteLine(count);
    }
}
