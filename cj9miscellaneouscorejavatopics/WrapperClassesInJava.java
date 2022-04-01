package cj9miscellaneouscorejavatopics;

public class WrapperClassesInJava {
	public static void main(String[] args) {
		byte b = 10;
		short s=20;
		int i =30;
		long l=40;
		float f=50.0F;
		double d=60.0D;
		char c='p';
		boolean b2=true;
		//Autoboxing Converting primitives into objects
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		//printing objects
		System.out.println("....Printing object values....");
		System.out.println("Byte object:"+byteobj);
		System.out.println("Short object:"+shortobj);
		System.out.println("Integer object:"+intobj);
		System.out.println("Long object:"+longobj);
		System.out.println("Float object:"+floatobj);
		System.out.println("Double object:"+doubleobj);
		System.out.println("Character object:"+charobj);
		System.out.println("Boolean object:"+boolobj);
		//Unboxing converting Objects to primitives
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean boolvalue=boolobj;
		// printing primitives
		System.out.println("....Printing Primitives....");
		System.out.println("byte value:"+bytevalue);
		System.out.println("short value:"+shortvalue);
		System.out.println("int vlaue:"+intvalue);
		System.out.println("long value:"+longvalue);
		System.out.println("float value:"+floatvalue);
		System.out.println("char value:"+charvalue);
		System.out.println("bool value:"+boolvalue);
		
	}

}
