package Oops;

import org.w3c.dom.ls.LSOutput;

class BaseClass{
    int x;

    BaseClass(){
        x = 0;
    }
    BaseClass(int x){
        this.x = x;
    }

    void Print(){
        System.out.println("Hello Inheritance");
    }
}

class DerivedClass extends BaseClass{
    DerivedClass(){
        // calling the constructor of parent class
        super();
        // calling Print method of parent class
        super.Print();

        x = 10; // Derived class also have x
    }
}
public class Inheritance {
    // BaseClass is parent of DerivedClass
    public void test(){
        BaseClass bsc = new BaseClass();
        DerivedClass dvc = new DerivedClass();

        System.out.println(bsc.x); // bsc x value is 0
        System.out.println(dvc.x); // dvc x value is 10
    }
}
