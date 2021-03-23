package testing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {


    // Maximum number of threads in thread pool
    static final int MAX_T = 3;

    public static void main(String[] args)
    {
//
//        for(int i=0;i<1000;i++)
//        {
//            Thread t1=new Thread(new Task("Task "+i));
//            t1.start();
//        }


        //ExecutorService service=Executors.newFixedThreadPool(1000);
        ExecutorService service=Executors.newCachedThreadPool();
        for(int i=0;i<1000;i++)
        {
            service.execute(new Task("Task "+i));
        }




//        // creates five tasks
//        Runnable r1 = new Task("Task 1");
//        Runnable r2 = new Task("Task 2");
//        Runnable r3 = new Task("Task 3");
//        Runnable r4 = new Task("Task 4");
//        Runnable r5 = new Task("Task 5");
//        Runnable r6 = new Task("Task 6");
//        Runnable r7 = new Task("Task 7");
//        Runnable r8 = new Task("Task 8");
//        Runnable r9 = new Task("Task 9");
//        Runnable r10 = new Task("Task 10");
//        Runnable r11 = new Task("Task 11");
//        Runnable r12 = new Task("Task 12");
//        Runnable r13 = new Task("Task 13");
//
//        // creates a thread pool with MAX_T no. of
//        // threads as the fixed pool size(Step 2)
//        ExecutorService pool = Executors.newFixedThreadPool(1);
//
//        // passes the Task objects to the pool to execute (Step 3)
//        pool.execute(r1);
//        pool.execute(r2);
//        pool.execute(r3);
//        pool.execute(r4);
//        pool.execute(r5);
//        pool.execute(r6);
//        pool.execute(r7);
//        pool.execute(r8);
//        pool.execute(r9);
//        pool.execute(r10);
//        pool.execute(r11);
//        pool.execute(r12);
//        pool.execute(r13);
//
//        // pool shutdown ( Step 4)
//        pool.shutdown();
    }
}
