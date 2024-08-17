package Test1;

public  class Assessment1_Fibonacciseries {

	public static void main(String[] args) {
		System.out.println("values");
		int a=0,b=1,c,n=1000;
		System.out.print(a+"\n"+b+"\n");
		for(int i=2;i<=n;i++) {
			c=a+b;
			if(c<=n) {
			System.out.print(c+"\n");
			a=b;
			b=c;
		}
		
	}

}}
