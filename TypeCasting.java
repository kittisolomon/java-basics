public class TypeCasting {
    public static void main(String[] args) {
        /*
        Type casting is when you assign a value of one primitive data type to another type
        */
       /*
       Widening Casting (automatically) - converting a smaller type to a larger type size
       byte -> short -> char -> int -> long -> float -> double
        */
        double myDouble = 9.78d;   // d at the end is optional
        int myInt = (int) myDouble; // Manual casting: double to int

        /*
        Narrowing Casting (manually) - converting a larger type to a smaller type size
        double -> float -> long -> int -> char -> short -> byte
         */
        float myFloat = (float) myDouble; // Manual casting: double to float
        long myLong = (long) myFloat;    // Manual casting: float to long

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
        System.out.println(myFloat);    // Outputs 9.78
        System.out.println(myLong);     // Outputs 9
    }
}