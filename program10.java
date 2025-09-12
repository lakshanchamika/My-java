public class program10 {
    public static void main(String[] args) {
        //1D array

        //01...........
        int[] A={10,20,30,40,50,60};
        
        A[3] = 35;

        System.out.println(A[3]);


        //02...........
        String[] B= new String[5];
        B[0]="Amal";
        B[1]="Kamal";

        System.out.println(A[0]);
        System.out.println(A[3]);

        B[3]="Nimal";
        System.out.println(A[3]);


        //2D array

        //01..........
        double[][] C={
            {21.20,12.02},
            {13.50,45.26},
            {85.36,25.36}
        };

        System.out.println(C[2][1]);

        


    }
}
