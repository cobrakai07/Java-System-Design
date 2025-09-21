package ConcurrencyAndMultithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Callable interface can return values, can throw exceptions and it works with future objects.
    // Callable interface works with the ExectorService framework rather than directly extending Thread.
    class MyCallable implements Callable<String>{

        private final String name;

        public MyCallable(String name){
            this.name = name;
        }

        @Override
        public String call() throws Exception{
            StringBuilder result = new StringBuilder();
            for (int i=0;i<20;i++){
                result.append("Callable Interface: ").append(name).append(" "+i).append("\n");
                Thread.sleep(500);
            }
            return result.toString();
        }
    }

public class CallableVsRunnable {
        public static void main(String[] args) {
        Thread thread = new Thread(()->System.out.println("This is runnable thread"));
        thread.start();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        
        Callable <String>callable1 = new MyCallable("Task 1");
        Callable <String>callable2 = new MyCallable("Task 2");

         try { 
            // Submit Callable tasks to the executor and get Future objects 
            Future<String> future1 = executorService.submit(callable1); 
            Future<String> future2 = executorService.submit(callable2); 
             
            // Get results from Future objects 
            System.out.println("Result from first task:"); 
            System.out.println(future1.get()); // Blocks until the task completes 
             
            System.out.println("Result from second task:"); 
            System.out.println(future2.get()); // Blocks until the task completes 
             
        } catch (InterruptedException | ExecutionException e) { 
            System.out.println("Task execution interrupted: " + e.getMessage()); 
        } finally { 
            // Shutdown the executor 
            executorService.shutdown(); 
        } 
    }
}
