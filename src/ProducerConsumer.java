
public class ProducerConsumer {
	
	public static void main(String[] args){
	
		ProducerConsumerMonitor pcMonitor = new ProducerConsumerMonitor();
		
		for(int k = 1; k < 3; k++)
			(new Thread(new Producer (k, pcMonitor))).start();	

		for(int k = 1; k < 4; k++)
			(new Thread(new Consumer (k, pcMonitor))).start();
	}

	
}

class ProducerConsumerMonitor {

	int label = 1;
	int contain[] = new int [10], in = 0, out = 0, count = 0;

	public synchronized int put(){

		return 0;
	}

	public synchronized int get(){

		return -1;
	}
}

class Producer implements Runnable {
	int ID; ProducerConsumerMonitor mtr;
	public Producer(int id, ProducerConsumerMonitor pcMonitor){
		ID = id; this.mtr = pcMonitor;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("Producer %d is making an item.\n", ID);
		try{}
		catch(Exception e){}

	}

}

class Consumer implements Runnable {
	
	int ID; ProducerConsumerMonitor mtr;
	
	public Consumer(int id, ProducerConsumerMonitor pcMonitor){
		ID = id; this.mtr = pcMonitor;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("Consumer %d is making an item.\n", ID);
		try{}
		catch(Exception e){}

	}

}
