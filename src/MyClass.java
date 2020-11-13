/*
If the class extends the Thread class,
the thread can be run by creating an instance of the class and call its start() method.

Differences between "extending" and "implementing" Threads:
************************************************************
The major difference is that when a class extends the Thread class, you cannot extend any other class,
but by implementing the Runnable interface, it is possible to extend from another class as well,
like: class MyClass extends OtherClass implements Runnable.

*/

public class MyClass extends Thread {
    public static void main(String[] args) {
        MyClass thread= new MyClass();
        thread.start();

        int i;
        for (i=0; i<100; i++){
            System.out.println("Runner " + i + " is running outside the thread");
        }
    }
    public void run() {
        int i;
        for (i=0; i<100; i++){
            System.out.println("Runner " + i + " is running  in the thread");
        }
    }
}
