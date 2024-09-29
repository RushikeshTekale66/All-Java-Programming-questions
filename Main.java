class MyThread1 implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Thread 1 : index : " + i);
        }
    }
}

class MyThread2 implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Thread 2 : index : "+ i);
        }
    }
}

/**
 * Main
 */
public class Main {

    public static void main(String [] args){
        MyThread1 m = new MyThread1();
        Thread tt = new Thread(m);
        tt.setPriority(3);
        tt.start();


        MyThread2 m2 = new MyThread2();
        Thread tt2 = new Thread(m2); //Runnable interface dont support start() so convert that runnable thread into thread class
        tt2.start();
    }
}