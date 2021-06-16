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
    public void firstnameshouldstartwithCapitalLetter()

    {   Registration reg=new Registration();
        String name ="Prarthana";
        reg.checkFirstName(name);
        Assert.assertEquals(true,reg.checkFirstName(name));
    }
    @Test
    public void LastnameshouldstartwithCapitalLetter(){
    Registration reg=new Registration();
    String name ="Chaudhari";
        reg.checkLastName(name);
        Assert.assertEquals(true,reg.checkLastName(name));
}
}
