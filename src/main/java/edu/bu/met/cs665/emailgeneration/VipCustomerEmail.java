package edu.bu.met.cs665.emailgeneration;

/**
 * The VipCustomerEmail concrete class implement EmailGenerationFactory interface for vip customer emailTemplate.
 * It calls the createEmailTemplate method to instantiate a new EmailTemplate object.
 */
public class VipCustomerEmail implements EmailGenerationFactory {
    @Override
    public EmailTemplate createEmailTemplate() {
        return new VipCustomer();
    }
}
