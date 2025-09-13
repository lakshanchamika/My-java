public class program15 {
    String phone_No;
    String name;

    public void call(){
        System.out.println("take a call from:" +name);
    }

    public void internet(){
        System.out.println("Brouse Internet");
    }

    public static void main(String[] args) {
        program15 phone1 = new program15();
        
        phone1.phone_No="0705519449";
        phone1.name="Chamika Lakshan";
        phone1.call();
        phone1.internet();

        program15 phone2 = new program15();

        phone2.phone_No="0714329188";
        phone2.name="Rashmi Chaga";
        phone2.call();
        phone2.internet();

        program15 phone3 =new program15();

        phone3.phone_No="0773487947";
        phone3.name="Ahinsa Sandamini";
        phone3.call();
        phone3.internet();
        
    }

    
}
