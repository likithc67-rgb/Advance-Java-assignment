package lab2;
/* 2 a. Develop a java program for performing various string operations with different string handling
functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison,
String Searching, Substring Operations, String Modification, Whitespace Handling,
String Concatenation, String Splitting, StringBuilder Demo, String Formatting,
Validate Email with contains(), startsWith() and endsWith() */


public class StringOperationsDemo {
 public static void main(String[] args) {
     // 1. String Creation and Basic Operations
     String str1 = "Hello";
     String str2 = "World";
     System.out.println("String 1: " + str1);
     System.out.println("String 2: " + str2);

     // 2. Length and Character Access
     System.out.println("Length of str1: " + str1.length());
     System.out.println("Character at index 1 of str1: " + str1.charAt(1));

     // 3. String Comparison
     System.out.println("str1 equals str2? " + str1.equals(str2));
     System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

     // 4. String Searching
     String mainStr = "Hello World, Welcome to Java!";
     System.out.println("Index of 'World': " + mainStr.indexOf("World"));
     System.out.println("Contains 'Java'? " + mainStr.contains("Java"));

     // 5. Substring Operations
     System.out.println("Substring (0,5): " + mainStr.substring(0, 5));

     // 6. String Modification
     String replaced = mainStr.replace("Java", "Programming");
     System.out.println("After replace: " + replaced);

     // 7. Whitespace Handling
     String spaced = "   Trim me   ";
     System.out.println("Before trim: '" + spaced + "'");
     System.out.println("After trim: '" + spaced.trim() + "'");

     // 8. String Concatenation
     String concat = str1 + " " + str2;
     System.out.println("Concatenated: " + concat);

     // 9. String Splitting
     String csv = "apple,banana,cherry";
     String[] fruits = csv.split(",");
     System.out.println("Split result:");
     for (String fruit : fruits) {
         System.out.println(fruit);
     }

     // 10. StringBuilder Demo
     StringBuilder sb = new StringBuilder("Start");
     sb.append(" -> Middle");
     sb.append(" -> End");
     System.out.println("StringBuilder result: " + sb.toString());

     // 11. String Formatting
     String name = "Thanish";
     int age = 22;
     double score = 95.6789;
     String formatted = String.format("Name: %s, Age: %d, Score: %.2f", name, age, score);
     System.out.println("Formatted string: " + formatted);

     // 12. Validate Email
     String email = "student@example.com";
     boolean valid = email.contains("@") && email.startsWith("student") && email.endsWith(".com");
     System.out.println("Email valid? " + valid);
 }
}