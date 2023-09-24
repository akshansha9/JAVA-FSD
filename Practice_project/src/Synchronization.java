public class Synchronization {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Create two threads that share the same sharedResource object
        Thread thread1 = new Thread(() -> {
            sharedResource.increment();
        });

        Thread thread2 = new Thread(() -> {
            sharedResource.increment();
        });

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Synchronization final Count: " + sharedResource.getCount());
    }
}
