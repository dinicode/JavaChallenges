package org.yup;

import java.util.Scanner;

public class Challenges {
    public String greeting(String name, int age) {
        if (age >= 21) {
            return "Hello " + name + ", come to the party!";
        } else {
            return "Sorry " + name + ", you are not old enough to attend the party.";
        }
    }

    public String greetingWithUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String inputName = scanner.nextLine();
        System.out.println("Enter your age:");
        int inputAge = scanner.nextInt();
        if (inputAge >= 21) {
            return "Hello " + inputName + ", welcome to the party!";
        }else{
            return "Hello " + inputName + ", I am sorry but we cannot let you into the party.";
        }
    }




    public int addTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        return sum;

     }


    public int subtractTwoNumbers() {
        Scanner theScanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = theScanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = theScanner.nextInt();
        int difference = num1 - num2;
        return difference;
    }
}
