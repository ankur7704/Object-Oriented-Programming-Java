    class Animal{
        String color;   //data member
        String name;

        void nonveg(){     //data function
            System.out.println("Eating non-vegetarian food...");
        }

        void veg(){
            System.out.println("Eat only vegetarian food.");
        }
    }

class Objects{
    public static void main(String[] args){

        //Class:- 
        //1.It is a collection of data member and data function.
        //2.It is not real world entity. Ex. Car, Bike, Animal etc.

        //Object:-
        //1.It is a real world entity, we can see via naked eye.
        //2.It is an instance of class.

        //How to Creating Object
        //Steps:ClassName ObjectName = new ClassName();

        Animal dog = new Animal();
        dog.name = "Tommy";
        dog.color = "Brown";    
        System.out.println("Dog Name: " + dog.name);
        System.out.println("Dog Color: " + dog.color);  
        dog.nonveg();  
        
        Animal cow = new Animal();
        cow.name = "Kitty";
        cow.color = "White";
        System.out.println("cow Name: " + cow.name);
        System.out.println("cow Color: " + cow.color);  
        cow.veg();



    }
}