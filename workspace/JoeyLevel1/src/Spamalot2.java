import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot2 implements ActionListener {
	static final String FAKE_USERNAME = "therealstephcurryishere@gmail.com";
	static final String FAKE_PASSWORD = "iamcurry";
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField(25);
	JButton bad = new JButton("BAD");
	JButton good = new JButton("GOOD");

	public Spamalot2() {
		frame.add(panel);
		panel.add(text);
		panel.add(bad);
		panel.add(good);
		frame.setVisible(true);
		frame.pack();
	}

	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static void main(String[] args) {
		Spamalot2 spam = new Spamalot2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean check = true;
		if (e.getSource() == good) {
			check = this.sendSpam("sherlincruzP361@gmail.com", "I am the real Steph Curry.",
					"I am the real Steph Curry. Nice to meet you. I make three's all day long because it is too easy for me. You should be excited because you have just been talking to the real Steph Curry. Isn't that amazing?! Talking to me, the one and only Steph Curry! You should be proud and amazed because of this moment. ");
		} else {
			check = this.sendSpam("sherlincruzP361@gmail.com", "The Real Steph Curry is mad!",
					"I am the real Steph Curry but I am very mad at you because you said that I suck at basketball. Also, you teased me when we lost the NBA championship and told me to go home. ");
		}
		if (check == true) {
			text.setBackground(Color.GREEN);
		} else {
			text.setBackground(Color.RED);
		}
	}
}
