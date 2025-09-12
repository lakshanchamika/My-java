import java.util.Scanner;
public class program07 {

    public static void main(String[] args){
        System.out.println("Enter your numbrer:");
        Scanner A = new Scanner(System.in);
        int day = A.nextInt();

        A.close();

        if(day>0 && day<8){
            switch(day){
                case 1:
                    System.out.println("Today is Monday");
                    break;
                case 2:
                    System.out.println("Today is Thuesday");
                    break;
                case 3:
                    System.out.println("Today is Wednesday");
                    break;
                case 4:
                    System.out.println("Today is Thursday");
                    break;
                case 5:
                    System.out.println("Today is Friday");
                    break;
                case 6:
                    System.out.println("Today is Saturday");
                    break;
                default:
                    System.out.println("Today is Sunday");
                    break;
            }
        }else{
            System.out.println("Your Enter number is invalide");
        }
    }
    
}
