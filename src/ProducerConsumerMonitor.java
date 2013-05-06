
public class ProducerConsumerMonitor {

	int label = 1;
	int contain[] = new int [10], in = 0, out = 0, count = 0;

	public synchronized int put(){

		return 0;
	}

	public synchronized int get(){

		return -1;
	}
}
