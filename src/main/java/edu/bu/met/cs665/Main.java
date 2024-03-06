/**
 * Name: Shenxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;
import edu.bu.met.cs665.emailgeneration.*;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    Main app = new Main();
    app.doIt();
  }

  /**
   * This method generating a list of objects customerEmails. When looping through the list, the customized emails will be sent.
   */
  private void doIt() {

    EmailGenerationFactory[] factories = {
            new NewCustomerEmail(),
            new BusinessCustomerEmail(),
            new VipCustomerEmail(),
            new FrequentCustomerEmail(),
            new ReturningCustomerEmail()
    };

    EmailSenderService sender = new EmailSenderService();

    for (EmailGenerationFactory factory : factories) {
      EmailTemplate email = factory.createEmailTemplate();
      sender.sendEmail(email);
    }

  }

}
