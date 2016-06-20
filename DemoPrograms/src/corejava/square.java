package corejava;

public class square {

	static int a=10;
	public static void main(String[] args) {
	
		int c = square.square(a);
	
	System.out.println(c);
	}

static int square(int a)
{
	int c=a*a;
	return c;
}

}