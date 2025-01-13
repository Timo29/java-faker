package com.github.javafaker;

import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class SimpleNetworkServerCompsTest extends AbstractFakerTest {

    @Test
    public void testComponents() {
        assertThat(faker.simpleNetworkServerComps().components(), matchesRegularExpression("([A-Za-z]+ ?){1,2}"));
    }

    @Test
    public void testManufacturers() {
        assertThat(faker.simpleNetworkServerComps().manufacturers(), matchesRegularExpression("([A-Za-z/-]+ ?){1,2}"));
    }

    @Test
    public void testModels() {
        assertThat(faker.simpleNetworkServerComps().models(), matchesRegularExpression("([\\w-+]+ ?){1,4}"));
    }

    @Test
    public void testSoftware() {
        assertThat(faker.simpleNetworkServerComps().software(), matchesRegularExpression("([\\w-]+ ?){1,3}"));
    }

    @Test
    public void testUps_models() {
        assertThat(faker.simpleNetworkServerComps().ups_models(), matchesRegularExpression("([\\w-]+ ?){1,3}"));
    }
}