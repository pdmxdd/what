package com.company.incomplete;

import com.company.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

    @Test
    public void testJobsForEquality() {
        Job testJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assertions.assertFalse(testJobOne.equals(testJobTwo));
    }

    @Test
    public void testToStringContainsBlankLines() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String[] splitStringArray = testJob.toString().split("\n");
        System.out.println(Arrays.toString(splitStringArray));
        Assertions.assertEquals("", splitStringArray[0]);
        // hacky workaround:
        Assertions.assertEquals(" ", splitStringArray[splitStringArray.length - 1]);
    }

//    @Test
//    public void testToStringHasLabelsForEachField() {
//    }
//
//    @Test
//    public void testToStringDataNotAvailable() {
//    }
}
