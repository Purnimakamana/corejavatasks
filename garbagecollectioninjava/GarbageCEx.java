package garbagecollectioninjava;

public class GarbageCEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCEx g=new GarbageCEx();
		GarbageCEx g1=new GarbageCEx();
		g=null;//nulling the reference
		g=g1;//assigning Reference
		new GarbageCEx();//Annonymous object
		System.gc();

	}
	public void finalize() {
		System.out.println("Garbage Collector called");
	}

}
