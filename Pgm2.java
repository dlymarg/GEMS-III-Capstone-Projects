// Derek Margulies; COSC 236.003; This program assignment will cover histograms and arrays
import java.util.*;
import java.io.*;
public class Pgm2 {
   public static void main(String[] args) throws FileNotFoundException {
      histogram();
      // #2 is available on the file TestCountLastDigits.java
   }
   // #1
   public static void histogram() throws FileNotFoundException {
      File file = new File("midterm.txt");
      Scanner input = new Scanner(file);
      int max = 0;
      int min = 100;
      int count = 0;
      int sum = 0;
      double avg;
      int[] numGrades = new int[6];
      int[] scores = new int[101];
      int[] lineNum = new int[20];
      while (input.hasNextLine()) {
         lineNum[count] = input.nextInt();
         String name = input.next();
         scores[count] = input.nextInt();
         if (scores[count] < min) {
            min = scores[count]; }
         if (scores[count] > max) {
            max = scores[count]; }
         if (scores[count] <= 75 && scores[count] >= 71) {
            numGrades[0]++;
         } else if (scores[count] <= 80 && scores[count] >= 76) {
            numGrades[1]++;
         } else if (scores[count] <= 85 && scores[count] >= 81) {
            numGrades[2]++;
         } else if (scores[count] <= 90 && scores[count] >= 86) {
            numGrades[3]++;
         } else if (scores[count] <= 95 && scores[count] >= 91) {
            numGrades[4]++;
         } else if (scores[count] <= 100 && scores[count] >= 96) {
            numGrades[5]++; }
         sum += scores[count];
         count++;
      }
      avg = (double) sum / count;
      System.out.println("Midterm statistics:");
      System.out.println("71 - 75 : " + stars(numGrades[0]) + " (" + numGrades[0] + ")");
      System.out.println("76 - 80 : " + stars(numGrades[1]) + " (" + numGrades[1] + ")");
      System.out.println("81 - 85 : " + stars(numGrades[2]) + " (" + numGrades[2] + ")");
      System.out.println("86 - 90 : " + stars(numGrades[3]) + " (" + numGrades[3] + ")");
      System.out.println("91 - 95 : " + stars(numGrades[4]) + " (" + numGrades[4] + ")");
      System.out.println("96 - 100 : " + stars(numGrades[5]) + " (" + numGrades[5] + ")");
      System.out.println();
      System.out.printf("Avg : %.2f\n", avg);
      System.out.println("Max : " + max);
      System.out.println("Min : " + min);
   }
   public static String stars(int a) {
      String str = "";
      for (int i = 0; i < a; i++) {
         str += "*";
      }
      return str;
   }
}