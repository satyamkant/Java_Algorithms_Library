package Oops;


class poly{
    int x;

    poly(){
        x = 0;
    }
    poly(int x){
        this();
    }

    /////////Method overloading////////////////
    int Multiply(int m){
        return m*x;
    }
        /// compile time polymorphism ///
    double Multiply(int m1,int m2){
        return x*m1*m2;
    }
    /////////////////////////////////////////

    void print(){
        System.out.println("printed from parent class!");
    }
}

class childPoly extends poly{

    /////// method overriding /////////
    @Override
    void print() {
        System.out.println("printed from child class!");
    }
    //// runtime polymorphism /////////
}
public class Polymorphism {
    // multiple methods with the same name but with different number or type of argument
    // Runtime and compile time polymorphism
}
