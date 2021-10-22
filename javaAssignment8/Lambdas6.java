import java.util.ArrayList;
import java.util.function.UnaryOperator;
class Op implements UnaryOperator<String> {
   public String apply(String str) {
      return str.toUpperCase();
   }
}
public class Lambdas6 {
   public static void main(String[] args) throws CloneNotSupportedException {
      ArrayList<String> list = new ArrayList<>();
      list.add("Ram");
      list.add("Ravi");
      list.add("Sita");
      list.add("Gita");
      list.add("Raju");
      System.out.println("List: "+list);
      list.replaceAll(new Op());
      System.out.println("\nList after replacing: \n"+list);
   }}