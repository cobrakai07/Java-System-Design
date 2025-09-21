package ConcurrencyAndMultithreading;

// https://codewitharyan.com/tech-blogs/threads-thread-class-and-runnable-interface
class MyThreadOne extends Thread {
    public void run() {
        int i = 1;
        while (i < 20) {
            System.out.println(i + " From thread one...!");
            i++;
        }
    }
}

class MyThreadTwo implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (i < 20) {
            System.out.println(i + " From thread two...!");
            i++;
        }
    }
}

public class LecOne {
    public static void main(String[] args) {
        MyThreadOne myThreadOne = new MyThreadOne();

        // Thread thread = new Thread(new MyThreadTwo());

        // Thread thread = new Thread() {
        //     @Override
        //     public void run() {
        //         System.out.println("Thread running using Anonymous class extending Thread");
        //     }
        // };

        // Thread thread = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         System.out.println("Thread running using Anonymous class implementing Runnable");
        //     }
        // });

        Thread thread = new Thread(() -> {
            int i = 1;
            while (i < 20) {
                System.out.println(i + " From thread two...!");
                i++;
            }
        });

        myThreadOne.start();
        thread.start();
    }

}
