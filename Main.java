/**
 * Main
 */

 class Parent{
    int id = 10;
    String name = "Rushikesh";

    public void display(){
        System.out.println(id);
        System.out.println(name);
    }
 }

 class Child extends Parent{
    String city = "Pune";

    public void display2(){
        System.out.println(city);
    }
 }

 class Child2 extends Parent{
    String city = "Dharashiv";

    public void display3(){
        System.out.println(city);
    }
 }
public class Main {
    public static void main(String [] args){
        Child c = new Child();
        c.display();
        c.display2();

        Child2 c2 = new Child2();
        c2.display();
        c2.display3();
    }
}