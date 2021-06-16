package com.bidgelabz;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class RegistrationTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void firstnameshouldstartwithCapitalLetter()

    {   Registration reg=new Registration();
        String name ="Prarthana";
        reg.checkFirstName(name);
        Assert.assertEquals(true,reg.checkFirstName(name));
    }
   
}
