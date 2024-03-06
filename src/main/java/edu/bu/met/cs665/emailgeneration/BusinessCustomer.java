package edu.bu.met.cs665.emailgeneration;

/**
 * BusinessCustomer is a concrete implementation of the EmailTemplate abstract class,
 * designed to generate email content tailored for business customers. This class provides
 * specific implementations for the methods to create the subject line and body content.
 * The structure allowing for customization of the email's subject and body and adhere the structure.
 */
public class BusinessCustomer extends EmailTemplate {

    public BusinessCustomer() {

        super("Business Customer");
    }

    @Override
    public String createSubject(){
        return "Your Business matters to us!";
    }

    @Override
    public String createBody() {
        return "We value our business customers.";
    }
}

