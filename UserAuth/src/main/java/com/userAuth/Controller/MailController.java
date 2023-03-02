package com.userAuth.Controller;

import com.userAuth.model.User;
import com.userAuth.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class MailController {

	@Autowired
	private MailService notificationService;

	@Autowired
	private User user;

	@RequestMapping("send-mail")
	public String send() {

		user.setFirstName("Rohit");
		user.setLastName("Manshani");
		user.setEmailAddress("rohitmanshani2@gmail.com"); //Receiver's email address

		try {
			notificationService.sendEmail(user);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Congratulations! Your mail has been send to the user.";
	}

	@RequestMapping("send-mail-attachment")
	public String sendWithAttachment() throws MessagingException {

		user.setFirstName("Rohit");
		user.setLastName("Manshani");
		user.setEmailAddress("rohitmanshani2@gmail.com"); //Receiver's email address

		try {
			notificationService.sendEmailWithAttachment(user);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Congratulations! Your mail has been send to the user.";
	}
}
