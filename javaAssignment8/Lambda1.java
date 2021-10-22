
public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithmetic add=(a,b)->a+b;
		System.out.println(add.operation(15,20));
		arithmetic sub=(a,b)->a-b;
		System.out.println(sub.operation(25,10));
		arithmetic mul=(a,b)->a*b;
		System.out.println(mul.operation(20,20));
		arithmetic div=(a,b)->a/b;
		System.out.println(div.operation(20,10));
		
	}
	interface arithmetic
	{
		int operation(int a,int b);
	}

}
