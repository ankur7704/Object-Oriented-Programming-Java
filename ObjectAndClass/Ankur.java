class Pen{
    String colour;
    String name;
    void write(){
        System .out.println("Write a word");
    }
}


class Ankur{
    public static void main(String args[]){
        //CLASS NAME CLASS OBJECT 
        Pen link = new Pen();
        link.colour = "Blue";
        link.name = "link gylicer";
       link.write();
      

    }
}
