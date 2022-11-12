package test.com.sendmail;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class TestSendEmail {
	private static final Logger logger = LoggerFactory.getLogger(TestSendEmail.class);

	@Autowired
	JavaMailSender javaMailSender;
	
	public void sendEmail(EmailVO vo) throws MessagingException {
		logger.info("sendEmail");
		logger.info("{}",vo);
		
		MimeMessage msg = javaMailSender.createMimeMessage();
//		msg.addFrom(new InternetAddress[] {new InternetAddress("aaa@gmail.com")});
		msg.setSubject(vo.getSubject());
		msg.setText(vo.getContent());
		msg.setRecipient(RecipientType.TO, new InternetAddress(vo.getReciver()));
		
		javaMailSender.send(msg);
		
	}

}
