import java.util.Scanner;
public class program06 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Your First Number:-");
        int A =num.nextInt();

        System.out.print("Enter Your Second Number:-");
        int B = num.nextInt();

        num.close();


        if(A>B){
            System.out.println("A is a bigger than B");
        }else if(B>A){
            System.out.println("B is bigger than A");
        }else{
            System.out.println("\'A\' and \'B\' in similer");
        }
        
        
        
    }
}
