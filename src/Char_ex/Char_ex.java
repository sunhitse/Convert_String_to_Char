package Char_ex;

import java.util.*;
  
// Class
public class Char_ex {
  
    // Main driver method
    public static void main(String args[])
    {
  
        // Custom input string
        String str = "SUNIL";
  
        // Creating array of string length
        // using length() method
        char[] ch = new char[str.length()];
  
        // Copying character by character into array
        // using for each loop
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
  
        // Printing the elements of array
        // using for each loop
        for (char c : ch) {
            System.out.println(c);
        }
    }
}
