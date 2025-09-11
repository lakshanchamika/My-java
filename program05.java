import java.util.Scanner;

public class program05
{
    public static void main(String[] args)
    {
        double no1,no2,sum,sub,mul,div,mod;

        Scanner no = new Scanner(System.in);
        
        System.out.println("Enter your First number");
        no1 = no.nextDouble();

        System.out.println("Enter your second number");
        no2 = no.nextDouble();

        sum = no1+no2;
        System.out.println("sum is" +sum);

        sub = no2-no1;
        System.out.println("Subtraction is" +sub);

        mul = no1*no2;
        System.out.println("Multipication is:" +mul);

        div = no2/no1;
        System.out.println("Division is:" +div);

        mod = no2%no1;
        System.out.println("Modulo is:" +mod);

    
    }
}