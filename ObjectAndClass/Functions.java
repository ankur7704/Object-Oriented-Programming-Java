public class Functions {

    //1.function /Method
    void add(int a, int b) {
        System.out.println("Sum by void: " + (a + b));
    }

    int subtract(int a, int b) {
        return (a - b);
    }
    public static void main(String[] args) {

        Functions obj =new Functions();
        obj.add(10,10);
        
        System.out.println("Subtract by int: " + obj.subtract(10,5));

    }
    
}
