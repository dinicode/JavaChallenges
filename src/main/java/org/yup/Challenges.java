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
        } else {
            return "Hello " + inputName + ", I am sorry but we cannot let you into the party.";
        }
    }


    public int addTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int potato = scanner.nextInt();

        return num1 + potato;
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


    public int multiplyTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int potato = scanner.nextInt();
        int potato2 = num1 * potato;
        return potato2;
    }


    public int interactiveCalculator() {

        Scanner theScanner = new Scanner(System.in);
        System.out.println("Welcome to the calculator");
        System.out.println("Press 1 to add numbers");
        System.out.println("Press 2 to subtract numbers");
        System.out.println("Press 3 to multiply numbers");
        System.out.println("Enter your selection and press ENTER");
        int userSelection = theScanner.nextInt();

        int result = 0;

        switch (userSelection) {
            case 1:
                result = this.addTwoNumbers();
                // Call add method here and store the result
                break;
            case 2:
                result = this.subtractTwoNumbers();
                // Call subtract method here and store the result
                break;
            case 3:
                result = this.multiplyTwoNumbers();
                // Call multiply method here and store the result
                break;
            default:
                System.out.println("The user chose an invalid option.");
                return 0;
        }

        return result;
    }


    public String CoinFlip() {

        //attempt to flip coin
        //return heads or tails

        if (Math.random() > .5) {
            //here is where we return heads if the number generated was > 0.5
            return "heads";
        } else {
            //otherwise, we return tails
            return "tails";
        }


    }


    public String findTheBiggestNumber() {

        Scanner theScanner = new Scanner(System.in);
        //this the scanner that lets us take input from user
        System.out.println("give me the first number please: ");
        //this where we capture that input and store it in a variable called firstNumber
        int firstNumber = theScanner.nextInt();

        //this the scanner that lets us take input from user
        System.out.println("give me the first number please: ");
        //this where we capture that input and store it in a variable called firstNumber
        int secondNumber = theScanner.nextInt();

        int theBiggestNumber = Math.max(firstNumber, secondNumber);

        return "The biggest number between" + firstNumber + " and " + secondNumber + "is" + theBiggestNumber;

    }


    public int findtheDifferenceBetweenTwoNumbers() {
        Scanner theScanner = new Scanner(System.in);

        System.out.println("Give me the first number to subtract ");
        int num1 = theScanner.nextInt();

        System.out.println("Give me the second number to subtract ");
        int num2 = theScanner.nextInt();

        int difference = Math.abs(num1 - num2);

        return difference;
    }

    public int findTheSmallestNumber() {
        Scanner theScanner = new Scanner(System.in);

        System.out.println("Give me the first number ");
        int num1 = theScanner.nextInt();

        System.out.println("Give me the second number ");
        int num2 = theScanner.nextInt();

        int smallestNumber = Math.min(num1, num2);

        return smallestNumber;
    }


    public String convertToUppercase() {

        //this is scanner that lets us take input from the user
        Scanner theScanner = new Scanner(System.in);

        System.out.println("Provide a word to convert all Uppercase");
        String theWord = theScanner.nextLine();

        return "You provided" + theWord + "and we converted to: " + theWord.toUpperCase();

    }

    public String changeToLowercase() {

        //this is scanner that lets us take input from the user
        Scanner theScan = new Scanner(System.in);

        System.out.println("Provide a word to convert all lowercase:");
        String Word = theScan.nextLine();

        return "You provided " + Word + " and we converted to: " + Word.toLowerCase();
    }

    public String lengthOfTheWord() {

        Scanner scan = new Scanner(System.in);
        String Word = scan.nextLine();

        return "The Word" + Word + " is " + Word.length() + "letters long";
    }

}






