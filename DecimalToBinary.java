import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Welcome to decimal to binary");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number need to be converted to binary ");
        int number=input.nextInt();

        String binary="";
        if(number==0){
            binary="0";
        }
        else {
            while (number>0){
                int remainder=number%2;
                binary=remainder+binary;
                number=number/2;
            }
        }
        System.out.println("Binary Representation  "+ binary) ;
    }

}
