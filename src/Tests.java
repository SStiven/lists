import java.util.LinkedList;
import java.util.Scanner;

public class Tests {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			String order = sc.next();
			if (order.equals("baja")) {
				numbers.poll();
			} else if (order.equals("sube")) {
				int cedula = sc.nextInt();
				numbers.addFirst(cedula);
			} else if (order.equals("terminamos")) {
				break;
			}
		}

		for(int i = numbers.size() - 1; i >= 0; i--) {
			System.out.println(numbers.get(i));
		}
		
	}

}
