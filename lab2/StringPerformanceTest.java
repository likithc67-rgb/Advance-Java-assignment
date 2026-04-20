package lab2;
/* 2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder
for appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder.
Justify your answer which one is better. */


public class StringPerformanceTest {
 public static void main(String[] args) {
     int iterations = 10000;
     String text = "AIET";

     // Test StringBuffer
     long startTimeBuffer = System.nanoTime();
     StringBuffer sbuffer = new StringBuffer();
     for (int i = 0; i < iterations; i++) {
         sbuffer.append(text);
     }
     long endTimeBuffer = System.nanoTime();
     long durationBuffer = endTimeBuffer - startTimeBuffer;
     System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");

     // Test StringBuilder
     long startTimeBuilder = System.nanoTime();
     StringBuilder sbuilder = new StringBuilder();
     for (int i = 0; i < iterations; i++) {
         sbuilder.append(text);
     }
     long endTimeBuilder = System.nanoTime();
     long durationBuilder = endTimeBuilder - startTimeBuilder;
     System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

     // Comparison
     if (durationBuffer > durationBuilder) {
         System.out.println("StringBuilder is faster than StringBuffer.");
     } else {
         System.out.println("StringBuffer is faster than StringBuilder.");
     }
 }
}
