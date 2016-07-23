package src;
import java.io.IOException;

public class Badger {
	public static void main(String[] args) {
		try {

			for (int r = 0; r < 5; r++) {
				if (r % 5 == 4) {
					Runtime.getRuntime().exec("say It's a ");
					Thread.sleep(500);
				}
				for (int i = 0; i < 10; i++) {

					Runtime.getRuntime().exec("say Badger");
					Thread.sleep(400);
				}
				if (r % 5 == 0 || r % 5 == 1 || r % 5 == 4) {

					for (int i = 0; i < 2; i++) {
						Runtime.getRuntime().exec("say Mushroom");
						Thread.sleep(500);
					}
				}
				if (r % 5 == 2) {
					Runtime.getRuntime().exec("say mush-mushroom");
					Thread.sleep(500);
				}
				if (r % 5 == 3) {
					Runtime.getRuntime()
							.exec("say Argh! Snake, a snake! Snaaaaake! A snaaaaaake, oooh, it's a snake!");
					Thread.sleep(8000);

				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
