package edu.bu.met.cs665.emailgeneration;

/**
 * The ReturningCustomerEmail concrete class implement EmailGenerationFactory interface for returning customer emailTemplate.
 * It calls the createEmailTemplate method to instantiate a new EmailTemplate object.
 */
public class ReturningCustomerEmail implements EmailGenerationFactory {
    @Override
    public EmailTemplate createEmailTemplate() {
        return new ReturningCustomer();
    }
}
