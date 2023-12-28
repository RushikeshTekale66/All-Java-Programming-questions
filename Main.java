class Test{
    public void add(int a , int b){
        System.out.println("Test 1 " + (a+b));
    }
}

class Test2 extends Test{
    public void add(int a , int b){
        System.out.println("Test 2 " + (a+b));
    }
}

//Method overriding / run time polymorphism
//same method with same paramether with different class

class Main{
    public static void main(String [] args){
        Test T = new Test();
        T.add(3,4);

        Test2 T2 = new Test2();
        T2.add(10, 20);
    }
}