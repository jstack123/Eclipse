package src;
import java.util.Random;

public class LotteryNumbers {
	public static void main(String[] args) {
		int max = 10;
		Random r = new Random();
		int n1 = r.nextInt(max)+1;
		System.out.println(n1);

		int n2 = r.nextInt(max)+1;
		while (n1 == n2) {
			n2 = r.nextInt(max)+1;
		}
		System.out.println(n2);

		int n3 = r.nextInt(max)+1;
		while (n1 == n3 || n2 == n3) {
			n3 = r.nextInt(max)+1;
		}
		System.out.println(n3);

		int n4 = r.nextInt(max)+1;
		while (n1 == n4 || n2 == n4 || n3 == n4) {
			n4 = r.nextInt(max)+1;
		}
		System.out.println(n4);

		int n5 = r.nextInt(max)+1;
		while (n1 == n5 || n2 == n5 || n3 == n5 || n4 == n5) {
			n5 = r.nextInt(max)+1;
		}
		System.out.println(n5);

	}
}
