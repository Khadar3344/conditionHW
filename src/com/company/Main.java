package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        // 1
       /* System.out.println("test Data");
        System.out.println("input number: ");
        int t = in.nextInt();
        if(t >= 0)
            System.out.println("number is positive");
        else
            System.out.println("number is negative");*/

        // 2
       /* System.out.println("Test data");
        System.out.println("input the 1st number: ");
        int a = in.nextInt();
        System.out.println("input the 2nd number: ");
        int b = in.nextInt();
        System.out.println("input the 3rd number: ");
        int c = in.nextInt();
        if(a > b && a > c)
            System.out.println("the greatest: "+ a);
        else if(b > a && b > c)
            System.out.println("the greatest: "+ b);
        else if(c > a && c > b)
            System.out.println("the greatest: "+ c);*/

        // 3
        /*System.out.print("Input a number: ");
        float v = in.nextFloat();
        if(v > 0){
            System.out.println("Positive number");

        }
        else if(v == 0){
            System.out.println("Zero number");
        }
        else if(v < 1){
            System.out.println("Small");
        }
        else if(v > 1000000){
            System.out.println("Large");*/


        // 4
        /*System.out.print("input number: ");
        int d = in.nextInt();
        switch (d){
            case 1:
                System.out.println("Friday"); break;
            case 2:
                System.out.println("Saturday"); break;
            case 3:
                System.out.println("Sunday"); break;
            case 4:
                System.out.println("Monday"); break;
            case 5:
                System.out.println("Tuesday"); break;
            case 6:
                System.out.println("wednesday"); break;
            case 7:
                System.out.println("Thursday"); break;
        }*/

        // 5
        /*System.out.println("Input floating-point number");
        float f = in.nextFloat();
        System.out.println("Input floating-point another number");
        float b = in.nextFloat();
        if(f == b)
            System.out.println("they are same");
        else if(f != b)
            System.out.println("they are different");*/

        // 6
        /*System.out.println("Input a month number: ");
        int m = in.nextInt();
        System.out.println("Input a year number: ");
        int y = in.nextInt();
        switch(m){
            case 1:
                System.out.println("January "+ y +" has 31 days");break;
            case 2:
                System.out.println("February "+ y +" has 28 days");break;
                case 3:
                    System.out.println("March "+ y +" has 31 days");break;
            case 4:
                System.out.println("April "+ y +" has 30 days");break;
                    case 5:
                        System.out.println("May "+ y +" has 31 days");break;
            case 6:
                System.out.println("January "+ y +" has 30 days");break;
                        case 7:
                            System.out.println("July "+ y +" has 31 days");break;
                            case 8:
                                System.out.println("Augustus "+ y +" has 31 days");break;
            case 9:
                System.out.println("September "+ y +" has 30 days");break;
                                case 10:
                                    System.out.println("October "+ y +" has 31 days");break;
            case 11:
                System.out.println("November "+ y +" has 30 days");break;
                                    case 12:
                                        System.out.println("December "+ y +" has 31 days");break;
            default:
                System.out.println("Error number");
        }*/

        // 7
        /*System.out.println("input year:");
        int y = in.nextInt();
        if(y % 4 == 0 && y / 100 != 0)
            System.out.println(y+ " is a leap year");
        else
            System.out.println(y+ " is not a leap year");*/

        // 8
       /* int n = 10;
        System.out.println("the first "+n+" natural numbers");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }*/

        //9
        /*int sum = 0;
        System.out.println("input the 5 numbers");
        for (int i = 0; i < 5; i++) {
        int m = in.nextInt();
        sum += m;
        }
        double avg = sum / 5;
        System.out.println("the sum of 5 no is : "+sum);
        System.out.println("the Average  is : "+avg);*/

        //10
        System.out.println("Input number of terms: ");
        int h = in.nextInt();

            for (int i = 1; i <= h; i++){
                int cube = i * i * i;
            System.out.println("Number is : "+i+" and cube of "+i+" is : " +cube );
        }


    }
}
