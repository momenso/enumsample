package enumsample;

import org.junit.Test;

import static org.junit.Assert.*;

public class LookupEnumTest {

    @Test
    public void lookupEnumValues() {
        assertEquals(LookupEnum.ENUM_1, LookupEnum.fromValue("A"));
        assertEquals(LookupEnum.ENUM_2, LookupEnum.fromValue("B"));
    }
}