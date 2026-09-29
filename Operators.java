public class Operators{
    public static void main(String[] args){
        //Arithmentic Operators
        int x = 10;
        int y = 5;
        int sum = x + y; // Addition
        int difference = x - y; // Subtraction
        int product = x * y; // Multiplication
        int quotient = x / y; // Division
        int remainder = x % y; // Modulus

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        //Assignment Operators
        int a = 10;
        a += 5; // a = a + 5
        System.out.println("a after += 5: " + a);

        a -= 3; // a = a - 3
        System.out.println("a after -= 3: " + a);

        a *= 2; // a = a * 2
        System.out.println("a after *= 2: " + a);
        
        a /= 4; // a = a / 4
        System.out.println("a after /= 4: " + a);

        a %= 3; // a = a % 3
        System.out.println("a after %= 3: " + a);

        //Comparison Operators
        int b = 10;
        int c = 20;
        System.out.println("b == c: " + (b == c)); // Equal to
        System.out.println("b != c: " + (b != c)); // Not equal
        System.out.println("b > c: " + (b > c)); // Greater than
        System.out.println("b < c: " + (b < c)); // Less than
        System.out.println("b >= c: " + (b >= c)); // Greater than or equal to
        System.out.println("b <= c: " + (b <= c)); // Less than or equal to

        //Logical Operators
        boolean d = true;
        boolean e = false;
        System.out.println("d && e: " + (d && e)); // Logical AND
        System.out.println("d || e: " + (d || e)); // Logical OR
        System.out.println("!d: " + (!d)); // Logical NOT

        //Bitwise Operators
        int f = 5; // 0101 in binary
        int g = 3; // 0011 in binary
        System.out.println("f & g: " + (f & g)); // Bitwise AND
        System.out.println("f | g: " + (f | g)); // Bitwise OR
        System.out.println("f ^ g: " + (f ^ g)); // Bitwise XOR
        System.out.println("~f: " + (~f)); // Bitwise NOT
        System.out.println("f << 1: " + (f << 1)); // Left shift
        System.out.println("f >> 1: " + (f >> 1)); // Right shift

    }
}