import java.util.HashSet;
import java.util.Scanner;

public class Solution {

   
    public static void printPermutations(String str, String newString){

        if (str.length() == 0) {
            System.out.println(newString);
        }

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);

            String newStr = str.substring(0, i)+ str.substring(i+1);
            printPermutations(newStr, newString+currChar);
        }
        
    }
    
    public static void main(String[] args){
       
        String str = "abc";

        printPermutations(str, "");

       
        
    }

    
}
