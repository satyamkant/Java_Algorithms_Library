package Oops;

class otp{
    private int x; // encapsulating/hiding x so that no direct access is given to public

    int getX(){
        return x;
    }

    void setX(int x){
        if(x>10 && x<100) // we can add condition for setting x
            this.x =x;
    }

}
public class Encapsulation {
    // access modifiers are used to hide data
}
