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

public class Spamalot implements ActionListener {
	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
						return new javax.mail.PasswordAuthentication(
								FAKE_USERNAME, FAKE_PASSWORD);
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

	static final String FAKE_USERNAME = "lofaprogrammertest@gmail.com";
	static final String FAKE_PASSWORD = "lofa1234";
	JButton bad = new JButton("BAD");
	JButton good = new JButton("GOOD");
	JTextField text = new JTextField(20);

	public Spamalot() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.setVisible(true);
		panel.add(text);
		frame.add(panel);
		panel.add(bad);
		panel.add(good);
		frame.pack();
		bad.addActionListener(this);
		good.addActionListener(this);
	}

	public static void main(String[] args) {
		Spamalot spam = new Spamalot();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String recipient = text.getText();
		if (arg0.getSource() == good) {
			this.sendSpam(recipient, "READ FOR MORE", "YOU ARE AMAZING");
		} else {
			this.sendSpam(recipient, "YOU VERY BAD PERSON",
					"BOOOOOOO YOU!!! YOU ARE BAD!!!");
		}
	}
}
