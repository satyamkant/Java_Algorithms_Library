package Oops;

abstract class shape{   // we can not create instances of abstract class
                        // we can only crate subclasses of it
                        // can have constructor
                        // uninitialized variable allowed
    int color;
    shape(int x){ // abstract class can have constructors
        color = x;
    }
    abstract int area();
    void print(){
        System.out.println("we do not need to implement this method in derived class");
    }
}

class square extends shape{
    int l,b;

    square(int x,int l,int b){
        super(x);
        this.l = l;
        this.b = b;
    }

    int area(){ // this method is mandatory to implement
                // as it is abstract method in the parent class
       return l*b;
    }
}


interface people{
    // cannot have constructor
    // public static final instance variable
    // all methods are public
    // multiple implementation and inheritance
    // an abstract class can implement an interface
    // no constructor
    // uninitialized variable not allowed

    void run();
    void speak();
}

interface car{
    default void hehe(){
        System.out.println("default");
    }
    void engineStart();
    void gearSystem();
    void breakSystem();
    void tyre();
}



/// multiple inheritance is achieved through interface
class multipleInheritance extends shape implements car,people{

    multipleInheritance(){
        super(10);
    }
    @Override
    int area() {
        return 0;
    }

    @Override
    public void run() {

    }

    @Override
    public void speak() {

    }

    @Override
    public void engineStart() {

    }

    @Override
    public void breakSystem() {

    }

    @Override
    public void tyre() {

    }

    @Override
    public void gearSystem() {

    }


}

public class  Abstraction {
    // can be achieved using abstract class or interface

}
