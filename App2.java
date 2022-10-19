public class App2 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread tread1 = new Thread(myRunnable);
        Thread tread2 = new Thread(myRunnable);
        Thread tread3 = new Thread(myRunnable);
        tread1.start();
        tread2.start();
        tread3.start();
        Thread[] threads = new Thread[3];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(myRunnable);
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();

        }

        for (long i = 0; i < 1111111111111l; i++) {

        }
    }
}

class MyTread extends Thread {
    public void run() {
        System.out.println("The work is done in thread " + this.getName());
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Run by " + Thread.currentThread().getName());

    }

}