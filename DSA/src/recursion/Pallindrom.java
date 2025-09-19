package recursion;

public class Pallindrom {
	
	public static void main(String[] args) {
		char ch[]= {'M','A','D','D','A','M'};
		int i=0;
		int n=ch.length-1;
		boolean res=checkPall(ch,i,n);
		if(res==true)
		{
			System.out.println("It is Pallindrom");
		}
		else
			System.out.println("It is not pallindrom");
	}

	private static boolean checkPall(char[] ch, int i, int n) {
		
		if(i>=n)
			return true;
		if(ch[i]!=ch[n])
			return false;
		return checkPall(ch,i+1,n-1);	
	}

}
