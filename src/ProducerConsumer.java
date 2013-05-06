
public class ProducerConsumer {
	
	public static void main(String[] args){
	
		ProducerConsumerMonitor pcMonitor = new ProducerConsumerMonitor();
		
		for(int k = 1; k < 3; k++)
			(new Thread(new Producer (k, pcMonitor))).start();	

		for(int k = 1; k < 4; k++)
			(new Thread(new Consumer (k, pcMonitor))).start();
	}

	
}
