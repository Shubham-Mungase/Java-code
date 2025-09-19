package threading;

public class Second implements Runnable {
	Thread t2=null;
	public Second()
	{
		t2=new Thread(this);
		t2.start();
	}

	@Override
	public void run() {

		for(int j=10;j<=1;j--)
		{
			try {
				Thread.sleep(500);
				System.out.println("Second="+j);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
