package threading;

public class First implements Runnable{
	
	Thread t1=null;
	public First()
	{
		t1=new Thread(this);
		t1.start();
	}

	@Override
	public void run() {

		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(500);
				System.out.println("First="+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
