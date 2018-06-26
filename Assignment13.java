Que:1 W.A.P of Multi-Threading with synchronized method?
Ans:1
package multithreading;
public class MultiThreading extends Thread{

    public synchronized void run()
    {
        for(int i=1;i<=1004;i++)
        {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        Thread thread1 =new MultiThreading();
        Thread thread2=new MultiThreading();
        thread1.start();
        thread2.start();
      //  thread1.run();
       // thread2.run();
        
   
}
}

    
    

