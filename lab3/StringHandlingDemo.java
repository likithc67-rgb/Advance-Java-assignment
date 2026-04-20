package lab3;


public class StringHandlingDemo {
    public static void main(String[] args) {

        // Basic String Creation
        System.out.println("=== String Creation and Basic Operations ===");
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");

        System.out.println("Original strings:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Length and Character Access
        System.out.println("\n=== Length and Character Access ===");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 4 in str1: " + str1.charAt(4));

        // String Comparison
        System.out.println("\n=== String Comparison ===");
        String str3 = "hello, world!";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("Ignore case: " + str1.equalsIgnoreCase(str3));
        System.out.println("compareTo: " + str1.compareTo(str3));

        // Searching in Strings
        System.out.println("\n=== String Searching ===");
        System.out.println("Index of 'World': " + str1.indexOf("World"));
        System.out.println("Last index of 'o': " + str1.lastIndexOf('o'));
        System.out.println("Contains 'Hello': " + str1.contains("Hello"));

        // Substring Operations
        System.out.println("\n=== Substring Operations ===");
        System.out.println("Substring (7 to end): " + str1.substring(7));
        System.out.println("Substring (0 to 5): " + str1.substring(0, 5));

        // String Modification
        System.out.println("\n=== String Modification ===");
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Replace: " + str1.replace("World", "Java"));

        // Whitespace Handling
        System.out.println("\n=== Whitespace Handling ===");
        String spacedString = " Trimming Example ";
        System.out.println("Original: '" + spacedString + "'");
        System.out.println("After trim: '" + spacedString.trim() + "'");

        // String Concatenation
        System.out.println("\n=== String Concatenation ===");
        String concat1 = "Hello";
        String concat2 = "World";
        System.out.println("Using +: " + concat1 + " " + concat2);
        System.out.println("Using concat(): " + concat1.concat(" ").concat(concat2));

        // String Splitting
        System.out.println("\n=== String Splitting ===");
        String csvText = "Java,Python,C++,JavaScript";
        String[] languages = csvText.split(",");

        for (int i = 0; i < languages.length; i++) {
            System.out.println("Language " + (i + 1) + ": " + languages[i]);
        }

        // StringBuilder Demo
        System.out.println("\n=== StringBuilder Demo ===");
        StringBuilder builder = new StringBuilder();
        builder.append("Learning ");
        builder.append("Java ");
        builder.append("Programming");

        System.out.println("Result: " + builder.toString());

        builder.insert(9, "Core ");
        System.out.println("After insert: " + builder.toString());

        builder.reverse();
        System.out.println("After reverse: " + builder.toString());

        // String Formatting
        System.out.println("\n=== String Formatting ===");
        String formatted = String.format("Name: %s, Age: %d, Height: %.2f", "John", 25, 1.75);
        System.out.println("Formatted: " + formatted);

        // String Properties
        System.out.println("\n=== String Properties ===");
        String testString = "Java123";
        System.out.println("Is empty: " + testString.isEmpty());
        System.out.println("Starts with 'Ja': " + testString.startsWith("Ja"));
        System.out.println("Ends with '123': " + testString.endsWith("123"));

        // Email Validation
        System.out.println("\n=== Email Validation ===");
        String email = "user@example.com";
        boolean isValidEmail = validateEmail(email);

        System.out.println("Email: " + email);
        System.out.println("Is valid: " + isValidEmail);
    }

    // Helper method
    private static boolean validateEmail(String email) {
        return email != null &&
               email.contains("@") &&
               email.contains(".") &&
               email.indexOf("@") < email.lastIndexOf(".") &&
               !email.startsWith("@") &&
               !email.endsWith(".") &&
               email.length() >= 5;
    }
}

