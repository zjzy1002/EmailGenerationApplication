package edu.bu.met.cs665.emailgeneration;

/**
 * The EmailGenerationFactory interface defines a method for creating EmailTemplate objects, serves as the creator in factory design pattern.
 * - Implement this interface in a concrete factory class for each specific type of EmailTemplate.
 */

public interface EmailGenerationFactory {
    EmailTemplate createEmailTemplate();
}
