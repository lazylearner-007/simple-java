import java.util.*;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
        System.out.println("Enter Numbers :");
        Scanner inp= new Scanner(System.in);
        int number1,number2;
        number1 = inp.nextInt();
        number2 = inp.nextInt();

        System.out.println("Enter 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();

        switch (choose)
        {
            case 1 -> System.out.println(add(number1, number2));
            case 2 -> System.out.println(sub(number1, number2));
            case 3 -> System.out.println(mult(number1, number2));
            case 4 -> System.out.println(div(number1, number2));
        }


    }
    public static int add(int x, int y)
    {
        return x + y;
    }
    public static int sub(int x, int y)
    {
        return x-y;
    }
    public static int mult(int x, int y)
    {
        return x*y;
    }
    public static int div(int x, int y)
    {
        return x/y;
    }

}
