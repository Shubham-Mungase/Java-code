package Assignment5;

public class InstrumentMain {
	public static void main(String[] args) {
		Instrument[] ins=new Instrument[10];
		ins[0]=new Piano();
		ins[1]=new Flute();
		ins[2]=new Guitar();
		ins[3]=new Piano();
		ins[4]=new Flute();
		ins[5]=new Guitar();
		ins[6]=new Piano();
		ins[7]=new Flute();
		ins[8]=new Guitar();
		ins[9]=new Piano();
		for(int i=0;i<ins.length;i++)
		{
			ins[i].play();
			
			if (ins[i] instanceof Piano) {
	            System.out.println("Instrument at index " + i + " is a Piano.");
	        } else if (ins[i] instanceof Flute) {
	            System.out.println("Instrument at index " + i + " is a Flute.");
	        } else if (ins[i] instanceof Guitar) {
	            System.out.println("Instrument at index " + i + " is a Guitar.");
	        }
		}
		
		
		
	}

}
