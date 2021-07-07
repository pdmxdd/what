package com.company.incomplete;

import com.company.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JobTests {
    @Test
    public void testSettingJobId() {
        Job testJobOne = new Job();
        Job testJobTwo = new Job();
        Assertions.assertFalse(testJobOne.getId() == testJobTwo.getId());
        Assertions.assertTrue(testJobTwo.getId() - testJobOne.getId() == 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assertions.assertEquals("Product tester", testJob.getName());
        Assertions.assertTrue(testJob.getEmployer() instanceof Employer);
        Assertions.assertEquals("ACME", testJob.getEmployer().getValue());
        Assertions.assertTrue(testJob.getLocation() instanceof Location);
        Assertions.assertEquals("Desert", testJob.getLocation().getValue());
        Assertions.assertTrue(testJob.getPositionType() instanceof PositionType);
        Assertions.assertEquals("Quality control", testJob.getPositionType().getValue());
        Assertions.assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        Assertions.assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    }
}
