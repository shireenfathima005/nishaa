package smartbook;

public class primitivetypeexample {
	public static void main(String[] args) {
		//decalartion and initialization of primitive numbers
		int intvalue=10;
		long longvalue=1000L;
		float floatvalue=3.14f;
		double doublevalue=3.14159;
		char charvalue='A';
		boolean booleanvalue=true;
		byte bytevalue=100;
		short shortvalue=1000;
		
		longvalue=intvalue;
		doublevalue=floatvalue;
		doublevalue=intvalue;
		
		intvalue=(int)longvalue;
		floatvalue=(float)doublevalue;
		charvalue=(char)intvalue;
		bytevalue=(byte)shortvalue;
		shortvalue=(short)intvalue;
		
		
				System.out.println("default boolean value:"+booleanvalue);
				System.out.println("default byte value:"+bytevalue);
				System.out.println("default short value:"+shortvalue);
				System.out.println("default int value :"+intvalue);
				System.out.println("default long value:"+longvalue);
				System.out.println("default float value:"+floatvalue);
				System.out.println("default double value:"+doublevalue);
				System.out.println("default char value:"+charvalue);
		
		
		
	}

}


