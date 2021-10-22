import java.util.*;

public class ThirdQue {
	public static void main(String[] args) {
		String s= "A quick brown fox jumps over the lazy dog";
		List<String> list= Arrays.asList(s.split(" "));
		String[] strArray= list.toArray(String[]::new);
		System.out.println(Arrays.toString(strArray));
	}
}