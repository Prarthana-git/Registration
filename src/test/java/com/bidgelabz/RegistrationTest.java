package com.bidgelabz;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class RegistrationTest {
    /**
     * Rigorous Test :-)
     */
    public void firstnameshouldstartwithCapitalLetter() {
        Registration reg = new Registration();
        String name = "Prarthana";
        reg.checkFirstName(name);
        Assert.assertEquals(true, reg.checkFirstName(name));
    }
    public void LastnameshouldstartwithCapitalLetter() {
        Registration reg = new Registration();
        String name = "Chaudhari";
        reg.checkLastName(name);
        Assert.assertEquals(true, reg.checkLastName(name));
    }

    @Test
    public void emailShouldbespecifictype() {
        Registration reg = new Registration();
        String mail = "abc.xyz@bl.co.in";
        reg.checkEmail(mail);
        Assert.assertEquals(true, reg.checkEmail(mail));
    }
}