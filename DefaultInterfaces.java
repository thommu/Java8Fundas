
interface A{
    void display();
    //Must declare method with body as default or it shows compile error
    default void show(){
        System.out.println("Show A");
    }
}

interface B{
    default void show(){
        System.out.println("Show B");
    }
}

class C{
    // default methods not allowed in classes
    public void show(){
        System.out.println("Show C");
    }
}


class ImplementAandB implements A,B {
    //The type ImplementAandB must implement the inherited abstract method A.display() > Else compiler error
    //This is the soln for diamond problem
    public void show(){
        System.out.println("Show A or B");
    }

    public void display(){    }
}

class ImplementAandC extends C implements A {

    public void display(){    }

   
}

public class DefaultInterfaces{
    public static void main(String args[]){
        System.out.println("test");
    }
}