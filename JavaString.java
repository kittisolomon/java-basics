public class JavaString {
    public static void main(String[] args) {
        
        String firstName = "Kay";
        String lastName = "Codes";
        String fullName = firstName + " " + lastName;
        String myFullName = lastName.concat(firstName); // Concatenates lastName and firstName
        System.out.println(fullName);
        System.out.println(myFullName);

        //String methods
        String myString = "Hello World";
        System.out.println("Length of myString: " + myString.length()); // Length of the string
        System.out.println("Uppercase: " + myString.toUpperCase()); // Convert to uppercase
        System.out.println("Lowercase: " + myString.toLowerCase()); // Convert to lowercase
        System.out.println("Character at index 0: " + myString.charAt(0)); // Character at index 0
        System.out.println("Substring from index 0 to 5: " + myString.substring(0, 5)); // Substring from index 0 to 5
        System.out.println("Index of 'World': " + myString.indexOf("World")); // Index of "World"
        System.out.println("Last index of 'l': " + myString.lastIndexOf("l")); // Last index of "l"

        //String comparison
        String str1 = "Hello";  
        String str2 = "Hello";
        String str3 = new String("Hello");  

        System.out.println("str1 == str2: " + (str1 == str2)); // true, because they refer to the same object in memory
        System.out.println("str1 == str3: " + (str1 == str3)); // false, because str3 is a new object
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true, because they have the same content

        //Removing whitespace
        String strWithWhitespace = "   Hello World   ";
        System.out.println("Before trim: '" + strWithWhitespace + "'");
        System.out.println("After trim: '" + strWithWhitespace.trim() + "'"); // Removes whitespace from both ends of the string

        
    }

}