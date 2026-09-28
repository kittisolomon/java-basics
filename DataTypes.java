public class DataTypes{
    public static void main(String[] args){
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        /*
        Primitive data types - includes byte, short, int, long, float, double, boolean and char
        Non-primitive data types - such as String, Arrays and Classes 
        */

       // var is use to define variables that allow the compiler to auto detect their types.
       // var must always have a value
       var myGrade = "A";

       System.out.println("My grade in Biology is " + myGrade);
    }
}