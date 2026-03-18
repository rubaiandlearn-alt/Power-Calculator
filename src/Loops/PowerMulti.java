package Loops;

import java.util.Scanner;

public class PowerMulti {
    public static void main(String[] args) {

        int num = 3;
        int pow = 4;

        int n = num;


        for (int i = 1; i < pow; i++) {

            n = num * n;
        }

        System.out.println(n);


        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number's Power Calculator-- ");
        System.out.print("Enter a Number: ");
        int number = input.nextInt();
        System.out.print("Enter that Number's Power: ");
        int power = input.nextInt();

        int Powercalculator = powercal(number,power);

        System.out.print("Calculated Number is: "+Powercalculator);


    }

    public static int powercal(int number, int power){

        if (power == 0){
            return 1;
        }

        if (power<0){
            System.out.println("Please Don't Enter Negative power");
            return 0;
        }

        int n = number;

        for (int i = 1; i < power; i++) {
            n = number * n;
        }


        return n;

    }
}
