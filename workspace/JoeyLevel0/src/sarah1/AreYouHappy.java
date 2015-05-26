package sarah1;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	
	String happy=JOptionPane.showInputDialog(null, "Are You Happy?");
	if (happy.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Then Just keep doing what ever you were doing.");
		
	} else {
	String want=JOptionPane.showInputDialog(null, "Do you want to be happy?");
	
	if (want.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Then Change Something.");
		
	} else {
JOptionPane.showMessageDialog(null, "Then just keep doing whatever you were doing");
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
