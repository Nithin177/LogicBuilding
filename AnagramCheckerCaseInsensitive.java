import java.util.Scanner;

public class AnagramCheckerCaseInsensitive {
    public static void main(String[] args) {
        System.out.println("Welcome to Anagram Problem");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the String1-->");
        String input1= input.next();
        System.out.println("Enter the String2--->");
        String input2= input.next();
        boolean isAnagram=isAnagram(input1, input2);

        if(isAnagram){
            System.out.println("The Given String is Anagram ");
        }
        else {
            System.out.println("The Given String is not Anagram");
        }
    }

    public  static  boolean isAnagram(String input1, String input2){
        if(input1.length() !=input2.length()){
            return  false;
        }
        input1=input1.toLowerCase();
        input2=input2.toLowerCase();
         int charCount[]=new int[26];

        for (int i = 0; i < input1.length(); i++) {
            charCount[input1.charAt(i) - 'a']++;
            charCount[input1.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

}
