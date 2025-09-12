

public class program13 {
    
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            if(i%2==0 && i%3==0){
                System.out.println(i+ " is multiples of six");
                continue;
            }

            if(i==15){
                System.out.println("15 is program ended");
                break;
            }
        }
    }
}
