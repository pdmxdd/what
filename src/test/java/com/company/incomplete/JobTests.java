package com.company.incomplete;

import com.company.Job;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JobTests {
    @Test
    public void testSettingJobId() {
        Job testJobOne = new Job();
        Job testJobTwo = new Job();
        Assertions.assertEquals(1, testJobOne.getId());
        Assertions.assertEquals(2, testJobTwo.getId());
        Assertions.assertFalse(testJobOne.getId() == testJobTwo.getId());
        Assertions.assertTrue(testJobTwo.getId() - testJobOne.getId() == 1);
    }
}
