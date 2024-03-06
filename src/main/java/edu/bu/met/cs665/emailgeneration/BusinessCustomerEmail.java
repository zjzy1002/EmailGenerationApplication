package edu.bu.met.cs665.emailgeneration;

/**
 * The BusinessCustomerEmail concrete class implement EmailGenerationFactory interface for business customer emailTemplate.
 * It calls the createEmailTemplate method to instantiate a new EmailTemplate object.
 */
public class BusinessCustomerEmail implements EmailGenerationFactory {
    @Override
    public EmailTemplate createEmailTemplate() {
        return new BusinessCustomer();
    }
}
