import java.util.Random;

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

	public synchronized int put(int data){

		return 0;
	}

	public synchronized int get(){

		return -1;
	}
}

class Producer implements Runnable {
	int ID; 
	ProducerConsumerMonitor mtr;
	private final static Random generator=new Random();
	
	public Producer(int id, ProducerConsumerMonitor pcMonitor){
		ID = id; this.mtr = pcMonitor;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("Producer %d is making an item.\n", ID);
				
			for( int count=1; count<=10; count++ )
			{
				try
				{
					Thread.sleep(generator.nextInt(3000 ) );
					mtr.put(count);
					System.out.printf("\t%2d\n", count );
				}			
				catch(InterruptedException exception )
				{
					exception.printStackTrace();
				}
			}
		
		System.out.println(
		"Producerdoneproducing\nTerminatingProducer" );

	}

}

class Consumer implements Runnable {
	
	int ID; 
	ProducerConsumerMonitor mtr;
	private final static Random generator=new Random();
	
	public Consumer(int id, ProducerConsumerMonitor pcMonitor){
		ID = id; this.mtr = pcMonitor;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("Consumer %d is making an item.\n", ID);
		int item = 0;
		for( int count=1; count<=10; count++ )
		{
			try
			{
				Thread.sleep(generator.nextInt(3000 ) );
				item = mtr.get();
				System.out.printf("\t%2d\n", item );
			}			
			catch(InterruptedException exception )
			{
				exception.printStackTrace();
			}
		}
	
	System.out.println(
	"Producerdoneproducing\nTerminatingProducer" );

}

}


