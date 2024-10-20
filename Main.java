/**
 * Main
 */

 interface Animal{
    public abstract void sound();
    public abstract void sum(int a, int b);
 }

 class Lion implements Animal{
    public void sound(){
        System.err.println("Ok OOk");
    }
    public void sum(int a, int b){
        System.out.println(a+b);
    }
 }
public class Main {

    public static void main(String [] args){
        Animal l = new Lion();
        l.sound();
        l.sum(10, 20);
    }
}