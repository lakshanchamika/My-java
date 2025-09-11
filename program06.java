import java.util.Scanner;
public class program06 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Your First Number:-");
        int A =num.nextInt();

        System.out.println("Enter Your Second Number:-");
        int B = num.nextInt();

        if(A>B){
            System.out.print("A is a bigger than B");
        }else{
            System.out.print("B is bigger than A");
        }

        
    }
}
