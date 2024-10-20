/**
 * Main
 */

 abstract class Animal{
    public abstract void sound();
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public abstract void sum(int a, int b);
 }

 class Lion extends Animal{
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
        l.add(10, 10);
        l.sum(10, 20);
    }
}