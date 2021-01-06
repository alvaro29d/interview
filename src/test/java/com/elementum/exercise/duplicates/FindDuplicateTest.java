package com.elementum.exercise.duplicates;

import static com.elementum.exercise.duplicates.FindDuplicate.hasDuplicates;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FindDuplicateTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void hasDuplicates_NullArray_False()
    {
        assertFalse(hasDuplicates(null) );
    }
}
