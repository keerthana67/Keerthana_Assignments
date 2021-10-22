import java.awt.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambdas8 extends Thread{
	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Lambdas8 l=new Lambdas8();
		l.start();
		ArrayList<Integer> num=new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		Consumer<ArrayList<Integer>>print=list ->list.stream().forEach(a->System.out.println(a+""));
		print.accept(num);
			}
}