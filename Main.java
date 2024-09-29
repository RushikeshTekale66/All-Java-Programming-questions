
class Main{
    public Main(){
        System.out.println("Constructor");
    }
    static{
        System.out.println("Static block");
    }
    public void msg2(){
        System.out.println("Instance block");
    }
    {
        System.out.println("Block");
    }
    public static void main(String[] args) {
       Main m = new Main();

       m.msg2();
    }
}