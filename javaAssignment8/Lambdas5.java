import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer; 
class ConsumerInterfaceExample1 {  
	static StringBuffer sb=new StringBuffer();
    static StringBuffer printMessage(String name){  
          return sb.append(name.charAt(0));
    } 
}
public class Lambdas5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer1 = ConsumerInterfaceExample1::printMessage;  
	    List<String> l=new ArrayList<String>();
	    l.add("Ram");
	    l.add("Sita");
	    l.add("Ravi");
	    l.add("Gita");
	    for(String l1:l) {
		consumer1.accept(l1);
	    }
	    System.out.print("Output String: ");
	    System.out.println(ConsumerInterfaceExample1.sb);
	}

}
