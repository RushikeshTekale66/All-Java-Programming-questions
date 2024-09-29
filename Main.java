class MyThread1 extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Thread 1 : index : " + i);
        }
    }
}

class MyThread2 extends Thread{
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
        m.start();
        System.out.println( "Class Name of thread 1 is : " + m.getName());
        System.out.println("Priority of thread 1 is : " + m.getPriority());
        System.out.println("State og thread 1 is : " + m.getState());

        MyThread2 m2 = new MyThread2();
        m2.start();
        System.out.println( "Class Name of thread 2 is : " + m2.getName());
        System.out.println("Priority of thread 2 is : " + m2.getPriority());
        System.out.println("State of thread 2 is : " + m2.getState());
    }
}