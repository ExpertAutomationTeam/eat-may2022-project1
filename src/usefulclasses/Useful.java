package usefulclasses;

import java.util.Scanner;

public class Useful {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = sc.nextLine();

        System.out.println("what is your age: ");
        int age = sc.nextInt();

        System.out.println("Hi, "+name+" your age is: "+age);

    }
}
