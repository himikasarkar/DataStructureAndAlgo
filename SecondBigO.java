import java.util.*;

public class SecondBigO {

	public static void main(String[] args) {

		List<Integer> boxes = new ArrayList<Integer>();
		boxes.add(1);
		boxes.add(2);
		boxes.add(3);
		boxes.add(4);
		boxes.add(5);
		boxes.forEach(var1 -> {
			boxes.forEach(var2 ->{
				System.out.println(var1 +" : "+ var2);
			});
		}
				);
	}

}