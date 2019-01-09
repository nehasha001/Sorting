package Assignment6;

import java.util.Scanner;

public class TwoDimensionalMultiplicationTable {
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter an Integer to print its multiplication table");
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        System.out.println("Multiplication table of " +a+"is: ");
        for(b=1;b<=10;b++)
            System.out.println(a+"*"+b+"="+(a*b));

    }
}


