package com.github.javafaker;

import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class SubscriptionTest extends AbstractFakerTest {

    @Test
    public void plans() {
        assertThat(faker.subscription().plans(), matchesRegularExpression("([A-Za-z]+ ?){1,2}"));
    }

    @Test
    public void statuses() {
        assertThat(faker.subscription().statuses(), matchesRegularExpression("([A-Za-z]+)"));
    }

    @Test
    public void paymentMethods() {
        assertThat(faker.subscription().paymentMethods(), matchesRegularExpression("([A-Za-z]+ ?){1,2}"));
    }

    @Test
    public void subscriptionTerms() {
        assertThat(faker.subscription().subscriptionTerms(), matchesRegularExpression("([A-Za-z]+)"));
    }

    @Test
    public void paymentTerms() {
        assertThat(faker.subscription().paymentTerms(), matchesRegularExpression("([A-Za-z]+ ?){1,3}"));
    }
}