package edu.bu.met.cs665.emailgeneration;

/**
 * The FrequentCustomerEmail concrete class implement EmailGenerationFactory interface for frequent customer emailTemplate.
 * It calls the createEmailTemplate method to instantiate a new EmailTemplate object.
 */
public class FrequentCustomerEmail implements EmailGenerationFactory {
    @Override
    public EmailTemplate createEmailTemplate() {
        return new FrequentCustomer();
    }
}
