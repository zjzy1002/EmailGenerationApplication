package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import edu.bu.met.cs665.emailgeneration.*;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class CustomerEmailTest {

    @Test
    public void testNewCustomerEmail() {
        EmailTemplate email1 = new NewCustomer();
        assertEquals("Welcome, our new customer!", email1.createSubject());
        assertEquals("We're glad you're here:)", email1.createBody());
    }


    @Test
    public void testBusinessCustomerEmail() {
        EmailTemplate email2 = new BusinessCustomer();
        assertEquals("Your Business matters to us!", email2.createSubject());
        assertEquals("We value our business customers.", email2.createBody());
    }


    @Test
    public void testFrequentCustomerEmail() {
        EmailTemplate email3 = new FrequentCustomer();
        assertEquals("Great deals special for you!", email3.createSubject());
        assertEquals("Visit our website for limited deals!", email3.createBody());

    }


    @Test
    public void testReturningCustomerEmail() {
        EmailTemplate email4 = new ReturningCustomer();
        assertEquals("Welcome Back!", email4.createSubject());
        assertEquals("Thanks for choosing us again.", email4.createBody());
    }


    @Test
    public void testVipCustomerEmail() {
        EmailTemplate email5 = new VipCustomer();
        assertEquals("Exclusive VIP Benefits for you!", email5.createSubject());
        assertEquals("You have access to our exclusive VIP benefits.", email5.createBody());
    }
}
