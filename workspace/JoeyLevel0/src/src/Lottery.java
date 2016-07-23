package src;
import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Lottery {
	public static void main( String[] args) {
		for (int i = 0; i < 5; i++) {
			int random = new Random().nextInt(6);
			System.out.println(random);
		}

	}
}