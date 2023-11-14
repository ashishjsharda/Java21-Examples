package org.example;

public class VirtualThread {
    public static void main(String[] args) throws InterruptedException {
       Thread.Builder builder=Thread.ofVirtual().name("Virtual Thread");
       Runnable task=()->{
           System.out.println("Hello from Virtual Thread");
       };
       Thread thread=builder.start(task);
       System.out.println(thread.getName());
       thread.join();
    }
}
