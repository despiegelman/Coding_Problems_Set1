import java.util.*;
import java.lang.Math;
public class binaryConverter {
    public static void main (String[]args){
        int number;
        boolean negative;
        int binaryDigit;
        int greatest_exp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = input.nextInt();
        input.close();
        if (number < 0){
            number *= -1;
            negative = true;
        }
        binaryDigit = 0;
        while (number > 0); {
            greatest_exp = (int) (Math.log(number)/Math.log(2));
            binaryDigit += Math.pow(10, greatest_exp);
            number -= Math.pow(2, greatest_exp);
        }
        if (negative = true){
            binaryDigit *= -1;
        }
        System.out.println("Your number in binary is: " + binaryDigit);
    }
}
