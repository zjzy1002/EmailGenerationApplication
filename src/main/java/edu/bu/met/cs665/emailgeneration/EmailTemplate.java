package edu.bu.met.cs665.emailgeneration;

/**
 * This is the abstract class EmailTemplate serves as Product in factory pattern. It template for an email message with subject and body.
 */
public abstract class EmailTemplate {
    private String type;

    /**
     * Gets the type of the email template.
     * @return The type of the email template.
     */
    public EmailTemplate(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /**
     * Creates the subject line for the email.
     * This method will be implemented by subclasses to define a subject line specific for each customer type.
     * @return The subject line of the email.
     */
    public abstract String createSubject();

    /**
     * Creates the body content for the email.
     * This method will be implemented by subclasses to define the body content specific for each customer type.
     * @return The body content of the email.
     */
    public abstract String createBody();
}
