class SharedResource {
    boolean isDataReady = false;

    synchronized void produceData() {
        System.out.println("Waiting from producer.....");
        try {
            Thread.sleep(2000); // Simulate data production time
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        isDataReady = true;
        System.out.println("Waiting over Producer has produced the data.");
        notify(); // Notify the waiting consumer thread
    }

    synchronized void consumeData() {
        while (!isDataReady) {
            System.out.println("Customer is waiting for data...");
            try {
                wait(); // Wait until producer notifies
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Customer has recieved the data.");
    }

	public void increment() {
		// TODO Auto-generated method stub
		
	}

	public String getCount() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class SleepWaitDemo {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(() -> {
            sharedResource.produceData();
        });

        Thread consumerThread = new Thread(() -> {
            sharedResource.consumeData();
        });

        producerThread.start();
        consumerThread.start();
    }
}
