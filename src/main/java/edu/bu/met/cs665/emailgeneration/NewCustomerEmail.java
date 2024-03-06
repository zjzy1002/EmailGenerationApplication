package edu.bu.met.cs665.emailgeneration;

/**
 * The NewCustomerEmail concrete class implement EmailGenerationFactory interface for new customer emailTemplate.
 * It calls the createEmailTemplate method to instantiate a new EmailTemplate object.
 */
public class NewCustomerEmail implements EmailGenerationFactory {

    @Override
    public EmailTemplate createEmailTemplate() {
        return new NewCustomer();
    }
}
