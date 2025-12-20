// package com.oicl.portal;


// import com.sendgrid.*;

// import com.sendgrid.helpers.mail.Mail;
// import com.sendgrid.helpers.mail.objects.Content;
// import com.sendgrid.helpers.mail.objects.Email;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// import java.io.IOException;

// @SpringBootApplication
// public class EmailExample implements CommandLineRunner {

//     @Value("${sendgrid.api-key}")
//     private String sendGridApiKey;

//     public static void main(String[] args) {
//         SpringApplication.run(EmailExample.class, args);
//     }

//     @Override
//     public void run(String... args) throws Exception {
//         Email from = new Email();
//         String subject = "Sending with SendGrid is Fun and Testing for oicl";
//         Email to = new Email("shlok.tomar@dgliger.com");
//         Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
//         Mail mail = new Mail(from, subject, to, content);

//         SendGrid sg = new SendGrid(sendGridApiKey);
//         Request request = new Request();
//         try {
//             request.setMethod(Method.POST);
//             request.setEndpoint("mail/send");
//             request.setBody(mail.build());
//             Response response = sg.api(request);
//             System.out.println(response.getStatusCode());
//             System.out.println(response.getBody());
//             System.out.println(response.getHeaders());
//         } catch (IOException ex) {
//             throw ex;
//         }
//     }
// }
