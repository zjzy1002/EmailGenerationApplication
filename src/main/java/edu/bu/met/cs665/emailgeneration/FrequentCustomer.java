package edu.bu.met.cs665.emailgeneration;

/**
 * FrequentCustomer is a concrete implementation of the EmailTemplate abstract class,
 * designed to generate email content tailored for frequent customers. This class provides
 * specific implementations for the methods to create the subject line and body content.
 * The structure allowing for customization of the email's subject and body and adhere the structure.
 */

public class FrequentCustomer extends EmailTemplate {

    public FrequentCustomer() {
        super("Frequent Customer");
    }

    @Override
    public String createSubject() {
        return "Great deals special for you!";
    }

    @Override
    public String createBody() {
        return "Visit our website for limited deals!";
    }
}
