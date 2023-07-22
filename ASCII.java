package shireen;

public class ASCII {
	public static void main(String[] args) {
		char ch ='H';
		int ascii =ch;
		//you can also cast char to int 
		int castAscii =(int)ch;
		System.out.println("the ASCII value of "+ch+"is:"+ascii);
		System.out.println("the ASCII value of"+ch+"is:"+castAscii);
	}

}