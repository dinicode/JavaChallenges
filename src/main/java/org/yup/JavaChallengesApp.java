package org.yup;

public class JavaChallengesApp {
Challenges challenges = new Challenges();



    public static void main (String[] args) {


          //create a new instance of the challenges class so we can use the challenges in our application
          Challenges challenges = new Challenges();

          //this runs the greeting method from our challenges and returns a string greeting and
          //stores it in the greeting varible we created
          String greeting = challenges.greeting("Bobby",22);
            System.out.println(greeting);

            String greetingWithUserInput= challenges.greetingWithUserInput();

            System.out.println(greetingWithUserInput);
            int sum = challenges.subtractTwoNumbers();

           System.out.println(sum);
    }

}








