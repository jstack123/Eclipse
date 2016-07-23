package src;
import java.io.IOException;
import java.util.Random;

public class Validation2 {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		for (int i = 0; i < 10; i++) {

			int randomNumber = new Random().nextInt(5);
			// 2. On paper, write all the numbers that get printed when you run
			// this
			// class
			System.out.println(randomNumber);

			// 3. Use the randomNumber to give the user a random compliment.
			try {
				if (randomNumber == 0) {

					Runtime.getRuntime().exec("say You have a cool shirt.");

				}
				if (randomNumber == 1) {

					Runtime.getRuntime().exec("say You have awesome jokes.");

				}
				if (randomNumber == 2) {

					Runtime.getRuntime().exec("say Nice Shoes.");

				}
				if (randomNumber == 3) {

					Runtime.getRuntime().exec(
							"say You are going to be a famous person.");

				}
				if (randomNumber == 4) {

					Runtime.getRuntime().exec("say You are very cool.");

				}
				Thread.sleep(3000);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// 5. Find someone to test out your program. They will like it :)
		}
	}
}
