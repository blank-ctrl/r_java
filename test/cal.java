import java.util.Scanner;

public class cal {
    public static void main(String [] args){
        Scanner inpt = new Scanner(System.in);
        double sum, diff, mul, div;
        String num1, num2;

        System.out.println("Enter the first number: ");
        num1 = inpt.nextLine();
        System.out.println("Enter the second number: ");
        num2 = inpt.nextLine();

        double num3 = Double.valueOf(num1);
        double num4 = Double.valueOf(num2);
        
        sum = num3 + num4;
        diff = num3 - num4;
        mul = num3 * num4;
        div = num3 / num4;

        System.out.println("Sum: " + sum + "\n" +
                            "Diff: " + diff + "\n" +
                            "Mul: " + mul + "\n" +
                            "Div: " + div + "\n");
    }
    
}