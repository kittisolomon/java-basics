public class Maths {
    public static void main(String[] args) {
        // Math class methods
        int a = 10;
        int b = 20;
        int randomNum = (int)(Math.random() * 101);

        System.out.println("Max of a and b: " + Math.max(a, b)); // Returns the maximum of a and b
        System.out.println("Min of a and b: " + Math.min(a, b)); // Returns the minimum of a and b
        System.out.println("Square root of a: " + Math.sqrt(a)); // Returns the square root of a
        System.out.println("Absolute value of -a: " + Math.abs(-a)); // Returns the absolute value of -a
        System.out.println("Random number between 0.0 and 1.0: " + Math.random()); // Returns a random number between 0.0 and 1.0
        System.out.println("Random num between 0 - 100 " + randomNum);

    }
}