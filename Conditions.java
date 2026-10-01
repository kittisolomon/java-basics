public class Conditions{
    public static void main(String[] args) {
        /*
        Java has the following conditional statements:
        Use if to specify a block of code to be executed, if a specified condition is true
        Use else to specify a block of code to be executed, if the same condition is false
        Use else if to specify a new condition to test, if the first condition is false
        Use switch to specify many alternative blocks of code to be executed
        */
        
        // If statement: Every if statement needs a condition that results in true or false.

     boolean isPassed = true;

     if(isPassed) {
        System.out.println("You passed the course!");
     }

     int a = 40;
     int b = 10;

     if(a > b) {
        System.out.println("A is greater than B");
     }

    // else statement runs a block of code if the condition from the if statement is false
    int voteAge = 18;
    int voterAge = 18;

    if (voterAge >= voteAge) {
        System.out.println("You are eligible to vote");
    } else {
        System.out.println("You are not eligible to vote!!!");
    }

    /*
    else if statement
    Use the else if statement to specify a new condition to test if the first condition is false.
    */

   int walletBalance = 1200;
   int topUpAmount = 300;

   if (walletBalance >= topUpAmount){
     System.out.println("You have enough balance to Top Up!");
   } else if (topUpAmount > walletBalance) {
     System.out.println("Insufficient Wallet Balance!");
   } else {
      System.out.println("Just enjoy, money dey!");
   }

   /*
    Ternary operator is a shortcut for the if statement. It has three operands: a condition followed by a question mark (?), 
    then an expression to execute if the condition is true followed by a colon (:), and finally the expression to execute 
    if the condition is false.
    */

    int age = 18;
    String eligibility = (age >= 18) ? "You fit vote" : "You nor go fit vote";
    System.out.println(eligibility);

    // nested ternary
    int time = 22;

    String greeting = (time < 12) ? "Good Morning" : (time < 18) ? "Good Afternoon" : "Good Evening";
    System.out.println(greeting);

    // nested if 
    int myAge = 20;
    boolean isCitizen = false;

    if(myAge >= 18){
        System.out.println("Old enough to vote");
        if(isCitizen) {
            System.out.println("You are also a Citizen, so you can vote");
        } else {
            System.out.println("You cant Vote, since you are not a citizen");
        }
    } else {
        System.out.println("You're not eligible to vote");
    }

    }  
}