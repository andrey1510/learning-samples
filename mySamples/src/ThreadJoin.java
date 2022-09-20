import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

public class ThreadJoin extends Thread {


    public static void checkThreads() {
        Set<Thread> threads = Thread.getAllStackTraces().keySet();
        System.out.println("");
        System.out.printf("\n%-15s \t %-15s \t %-15s \t %-15s \t %s\n", "Name", "State", "isAlive", "isInterrupted", "isDaemon");
        for (Thread t : threads) {
            System.out.printf("%-15s \t %-15s \t %-15s \t %-15s \t %s\n", t.getName(), t.getState(), t.isAlive(), t.isInterrupted(), t.isDaemon());
        }
        System.out.println("");
    }

    public static void main(String[] args) throws InterruptedException {
        final Object obj = new Object();

        checkThreads();

        ThreadJoin thread1=new ThreadJoin() {
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    //do some processing
                }
            };

            Timer timer = new Timer();
           // timer.schedule(task, 0l, 1000l);
        };
        thread1.start();
        System.out.println("Waiting to join.");
        thread1.join();
        checkThreads();
        ThreadJoin thread2=new ThreadJoin();
        checkThreads();

        thread2.start();
        checkThreads();



//        System.out.println(activeCount());
//        System.out.println("The current thread name is: " + Thread.currentThread().getName());

//        ThreadJoin thread2=new ThreadJoin();
//        thread1.start();
//        thread2.start();
//        System.out.println(activeCount());
//
//
//
//        thread1.join(); {System.out.println("The current thread name is: " + Thread.currentThread().getName());}
//
//        System.out.println("The current thread name is: " + Thread.currentThread().getName());
//        System.out.println("thread1 is Alive: " + thread1.isAlive());
        //System.out.println("thread2 is Alive: " + thread2.isAlive());

       // thread2.join();
       // thread2.start();
       // System.out.println("The current thread name is: " + Thread.currentThread().getName());

       // System.out.println("thread1 is Alive: " + thread1.isAlive());
       // System.out.println("thread2 is Alive: " + thread2.isAlive());


    }


}
