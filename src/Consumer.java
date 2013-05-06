
public class Consumer implements Runnable {
	
	int ID; ProducerConsumerMonitor mtr;
	
	public Consumer(int id, ProducerConsumerMonitor pcMonitor){
		ID = id; this.mtr = pcMonitor;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
