/**
 * Main
 */

 class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name);
        System.out.println(age);
    }
 }

 class Child extends Person{
    double salary;
    double exp;

    public Child(double salary, double exp, String name, int age){
        super(name, age);
        this.salary = salary;
        this.exp = exp;
    }

    @Override
    public void show(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.salary);
        System.out.println(this.exp);
    }

 }

public class Main {

    public static void main(String [] args){
        Child c = new Child(10000, 4, "Rushikesh", 10);
        c.show();
    }
}