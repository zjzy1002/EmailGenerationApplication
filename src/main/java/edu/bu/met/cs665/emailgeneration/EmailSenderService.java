package edu.bu.met.cs665.emailgeneration;

/**
 * The EmailSenderService class is for sending email messages to recipients.
 * It acts as a service layer between the email content generation (using EmailTemplate instances) and the actual email sending mechanism.
 */

public class EmailSenderService {
    /**
     * This method extracts the subject and body from the EmailTemplate and uses them to send the email to the intended recipients.
     * @param email The EmailTemplate object containing the email content to be sent.
     */
    public void sendEmail(EmailTemplate email) {
        System.out.println("Sending emails to a " + email.getType() + ": "+ email.createSubject() + email.createBody());
    }
}
