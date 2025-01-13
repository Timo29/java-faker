package com.github.javafaker;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertThat;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
public class BossaNovaTest extends AbstractFakerTest {

    @Test
    public void testArtists() {
        assertThat(faker.bossaNova().artists(), matchesRegularExpression("([\\w']+\\.? ?){2,3}"));
    }

    @Test
    public void testSongs() {
        assertThat(faker.bossaNova().songs(), matchesRegularExpression("([\\p{L}'\\-\\?]+[!,]? ?){2,9}"));
    }
}