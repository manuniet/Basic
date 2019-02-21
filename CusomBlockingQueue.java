package logic.misc;

import java.util.LinkedList;
import java.util.Queue;


//public class CusomBlockingQueue {
//
//	
//}


interface BlockingQueue<Integer>{
	
	void add(Integer i) throws InterruptedException;
	Integer take() throws InterruptedException;
	
}

class CusomBlockingQueue implements BlockingQueue<Integer>{
	
	@Override
	public String toString() {
		return "CusomBlockingQueue [maxSize=" + maxSize + ", bq=" + bq + "]";
	}

	int maxSize=0;
	Queue<Integer> bq = null;
	CusomBlockingQueue(int maxSize){
		bq=new LinkedList<>();
		this.maxSize=maxSize;
	}
	@Override
	public synchronized void add(Integer e) {
		// TODO Auto-generated method stub
		if(maxSize == bq.size()) {
			try {
				this.wait();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		bq.add(e);
		this.notifyAll();
	}
	
	@Override
	public synchronized Integer take() {
		// TODO Auto-generated method stub
		if(bq.size()<1) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.notifyAll();
		return bq.poll();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CusomBlockingQueue cs = new CusomBlockingQueue(4);
		cs.add(1);
		cs.add(2);
		cs.add(3);
		cs.add(4);
		System.out.println(cs);
		cs.add(5);
		Integer i= cs.take();
		System.out.println(i);
		cs.add(6);
		
	}

}

