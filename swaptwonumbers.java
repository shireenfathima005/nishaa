package shireen;

public class swaptwonumbers {
	public static void main(String[] args) {
		float first = 2.50f,second=4.50f;
		System.out.println("__before swapping__");
		System.out.println("first number="+first);
		System.out.println("second number="+second);
		//value is assigned to temporary
		float temporary = first;
		//value of second is assigned to first
		first=second;
		//value of temporary (which containes the initial value of first)is assigned to second
		second=temporary;
		System.out.println("__after swap__");
		System.out.println("first number="+first);
		System.out.println("second number="+second);
	}

}
