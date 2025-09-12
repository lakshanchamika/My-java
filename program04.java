import java.util.Scanner;
public class program04 
{
    public static void main(String[] arge)
    {
        Scanner txt = new Scanner(System.in);
        System.out.print("Input Text :- ");
        String Text = txt.nextLine();
        
        txt.close();

        
        System.out.println("Text is:" +Text);
    }
}