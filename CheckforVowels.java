import java.util.Scanner;

public class CheckforVowels {
    public static void main(String[] args) {
        System.out.println("Enter the value  to be checked");
        Scanner input= new Scanner(System.in);
        System.out.println("The Enter the value  to be checked ");
        char value= input.next().toLowerCase().charAt(0);
        System.out.println("The value is --->" + value);

        if(isVowel(value)){
            System.out.println("The given  value is vowel ");
        }
        else {
            System.out.println("The given value is constant");
        }

    }

    public  static  boolean isVowel(char  value){
        return value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u';
    }

}
