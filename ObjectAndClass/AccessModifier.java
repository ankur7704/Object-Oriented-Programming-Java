
 class PrivateClass {

    //1. private access modifier
    private String name="Ankur";

    //2. public method to access private member
    
    public void display(){
        System.out.println("Hello "+name);
    }

    //3. default access modifier

    int salary = 50000; 

    //4. protected access modifier
    protected String dept = "IT";
}

public class AccessModifier {
    public static void main(String[] args) {
        System.out.println("Access Modifier Example");

        PrivateClass obj = new PrivateClass();
        System.out.println(obj.name);
        obj.display();  
    }
}
