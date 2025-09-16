public class program16 {
    String name;
    program16(){
        name = "kamal";
        System.out.println("Welcome");
    }

    void meth1() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        program16 test1 = new program16();
        System.out.println(test1.name);
        test1.meth1();
        
        
    }
}
