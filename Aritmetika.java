public class Aritmetika {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=45,n2=7,n3=32,n4=78,b;
		double c,d;
		System.out.println("Sartutako zenbakiak: "+n1+" "+n2+" "+n3+" "+n4);
		System.out.println("a) Batura: "+(n1+n2+n3+n4));
		b=n1*10000;
		System.out.println("b) n1 x 10000: "+b);
		c= (double)n2/3;
		d=(double)n3/n4;
		System.out.println("c) Zatidura erreala(n2/3): "+c);
		System.out.println("d)n3/n4 "+d+"; Zati osoa: "+(int)d);
		System.out.println("e) Hondarra(n1/n2): "+(n1%n2));
	}
}

