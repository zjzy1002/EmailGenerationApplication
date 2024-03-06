package edu.bu.met.cs665.emailgeneration;

/**
 * VipCustomer is a concrete implementation of the EmailTemplate abstract class,
 * designed to generate email content tailored for VIP customers. This class provides
 * specific implementations for the methods to create the subject line and body content.
 * The structure allowing for customization of the email's subject and body and adhere the structure.
 */

public class VipCustomer extends EmailTemplate {
    public VipCustomer() {
        super("VIP Customer");
    }
    @Override
    public String createSubject() {

        return "Exclusive VIP Benefits for you!";
    }

    @Override
    public String createBody() {
        return "You have access to our exclusive VIP benefits.";
    }
}
