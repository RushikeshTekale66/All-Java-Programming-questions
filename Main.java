class Test{
    public void add(int a , int b){
        System.out.println(a+b);
    }
    public void add(double a, double b){
        System.out.println(a+b);
    }
}

//Method Overloading / Compile time polymorphism
//Same method with different parameter in same class

class Main{
    public static void main(String [] args){
        Test T = new Test();
        T.add(3,4);
        T.add(3.2, 4.4);
    }
}