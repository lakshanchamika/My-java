public class program11 {
    public static void main(String[] args) {

        //2D array

        
        double[][] C={
            {21.20,12.02},
            {13.50,45.26},
            {85.36,25.36}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j]+ ",");
            }
            System.out.println();
        }
    }
}

