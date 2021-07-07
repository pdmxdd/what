package com.company.completed.passing;

import com.company.Employer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployerTests {

    private static final Employer oneArgEmployer = new Employer("Seaworld");

    @Test
    public void oneArgConstructorTest() {
        Assertions.assertEquals(1, oneArgEmployer.getId());
    }

    @Test
    public void testToString() {
        Assertions.assertEquals("Seaworld", oneArgEmployer.toString());
    }

}
