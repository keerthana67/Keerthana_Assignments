import java.util.ArrayList;
import java.util.List;

public class Lambdas4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<String>();
		l.add("Animal");
		l.add("Plant");
		l.add("Human");
		l.add("Environment");
		l.add("Air");
		System.out.println("Original list: "+l+"\n");
		l.removeIf(s -> (s.length() % 2 != 0));
		  System.out.println("Strings after removing oddlength words:  "+l);
        
	}
}
