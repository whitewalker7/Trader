package org.user;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LengthTest {
    Length length1;
    Length length2;
    Length length3;
    Length length4;


    @Before
    public void setup() {
        length1 = new Length(10.0, 30.0);
        length2 = new Length(15.0, 25.0);
        length3 = new Length(-50.0, 25.0);
        length4 = new Length(10.0, 30.0);
    }

    @Test
    public void shouldAddLengthToExisting() {

        Length testLength = length1.addLength(length2);
        assertEquals(25.55, testLength.getLengthInMetres(), 0.05);

    }

    @Test(expected = NegativeLengthException.class)
    public void shouldNotAddNegatives() {
        length1.addLength(length3);
    }

    @Test
    public void shouldGetLength() {
        assertEquals(10.3, length1.getLengthInMetres(), 0.05);
    }

    @Test
    public void shouldCheckIfLengthsAreEqual(){
        assertEquals(length1,length4);
    }
    @Test
    public void
}
