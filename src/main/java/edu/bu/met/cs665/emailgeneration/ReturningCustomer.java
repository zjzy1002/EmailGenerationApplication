package edu.bu.met.cs665.emailgeneration;

/**
 * ReturningCustomer is a concrete implementation of the EmailTemplate abstract class,
 * designed to generate email content tailored for returning customers. This class provides
 * specific implementations for the methods to create the subject line and body content.
 * The structure allowing for customization of the email's subject and body and adhere the structure.
 */

public class ReturningCustomer extends EmailTemplate {
    public ReturningCustomer() {
        super("Returning Customer");
    }
    @Override
    public String createSubject() {
        return "Welcome Back!";
    }

    @Override
    public String createBody() {
        return "Thanks for choosing us again.";
    }
}
