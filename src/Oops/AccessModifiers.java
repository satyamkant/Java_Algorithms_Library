package Oops;

class Access{
    protected int pro; // can be access withing the class or outside the package through inheritance (child class)
    public int pub; // can be accessed from anywhere
    int def; // default can be access from within class and withing the same package
    private int prv; // can only be access inside this class

    public int getPub() {
        return pub;
    }
}
public class AccessModifiers {
}

