package org.bps.testassertions;
import static com.google.common.truth.Truth.assertThat;

public class Assertions {
    public void assertText(String actual, String expected){
        assertThat(actual).isEqualTo(expected);
    }
}
