package edu.bu.met.cs665.emailgeneration;

/**
 * NewCustomerEmail is a concrete implementation of the EmailTemplate abstract class,
 * designed to generate email content tailored for new customers. This class provides
 * specific implementations for the methods to create the subject line and body content.
 * The structure allowing for customization of the email's subject and body and adhere the structure.
 */
public class NewCustomer extends EmailTemplate {

    public NewCustomer() {
        super("New Customer");
    }

    @Override
    public String createSubject() {
        return "Welcome, our new customer!";
    }

    @Override
    public String createBody() {
        return "We're glad you're here:)";
    }
}
