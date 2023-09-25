package sent.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import jakarta.mail.MessagingException;
import sent.email.service.MailService;

@SpringBootApplication
public class SentEmailApplication {

	@Autowired
	private MailService mailService;
	public static void main(String[] args) {
		SpringApplication.run(SentEmailApplication.class, args);
	}
    @EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException
	{
		mailService.sendMail("pravee1247@gmail.com", "Hii,I'm Sending message from spring boot","Hello");
	    mailService.sendMailWithAttachment("pravee1247@gmail.com","Hii,I'm Sending attachment","Have a nice day","C:\\Users\\HP\\Desktop\\Hello.jpeg");
	}
	
}
