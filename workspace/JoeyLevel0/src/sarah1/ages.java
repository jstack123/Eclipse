package sarah1;

import java.io.IOException;

public class ages {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		for (int i = 10; i > 0; i--) {
			
			System.out.println(i);
		Runtime.getRuntime().exec("say "+i);
			Thread.sleep(1000);
			
			
		}
		
		System.out.println("Blastoff!!!");
		Runtime.getRuntime().exec("say "+"Blastoff!!!");
			Thread.sleep(100);
			
			for (int i = 0; i < args.length; i++) {
				
			}
			
			
		}
		
	}

