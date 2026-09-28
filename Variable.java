public class Variable {
    public static void main(String[] args) {
        /*
         Java variable types:
           1. int - stores integers (whole numbers), without decimals, such as 123
            2. double (float) - stores floating point numbers, with decimals, such as 19.99 or 3.14515
            3. char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
            4. String - stores text, such as "Hello World". String values are surrounded by double quotes
            5. boolean - stores values with two states: true or false
         */
        /*
        Use the 'final' to define constants, and they are defined in block letters by convention
        e.g. final int BIRTHYEAR = 1980;
         */

        String myFirstname = "Kay ";
        String myLastName = "Codes";
        String myFullname = myFirstname + myLastName;
        int myAge = 29;

        System.out.println("My name is " + myFullname + " and I am " + myAge + " years old.");
    }
}