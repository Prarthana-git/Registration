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
    public void emailShouldbespecifictype() {
        Registration reg = new Registration();
        String mail = "abc.xyz@bl.co.in";
        reg.checkEmail(mail);
        Assert.assertEquals(true, reg.checkEmail(mail));
    } @Test
    public void numberShouldbespecifictype() {
        Registration reg = new Registration();
        String no = "91 8627546852";
        reg.checkPhoneNumber(no);
        Assert.assertEquals(true, reg.checkPhoneNumber(no));
    }
}