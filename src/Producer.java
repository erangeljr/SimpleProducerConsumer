
public class Producer implements Runnable {
	int ID; ProducerConsumerMonitor mtr;
	public Producer(int id, ProducerConsumerMonitor pcMonitor){
		ID = id; this.mtr = pcMonitor;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
