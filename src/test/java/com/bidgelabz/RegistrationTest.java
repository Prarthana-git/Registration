package com.bidgelabz;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RegistrationTest {
    @Test
    public void firstnameShouldbeasspecify()
    {
        Registration reg=new Registration();
        String name="Prarthana";
        Assert.assertEquals(true,reg.checkFirstName(name));

    }
    @Test
    public void lastnameShouldbeasspecify()
    {
        Registration reg=new Registration();
        String name="Chaudhari";
        Assert.assertEquals(true,reg.checkLastName(name));
    }
    @Test
    public void emailShouldbeasspecify()
    {
        Registration reg=new Registration();
        String mail="abc.xyz@bl.co.in";
        Assert.assertEquals(true,reg.checkEmail(mail));
    }
    @Test
    public void phoneShouldbeasspecify()
    {
        Registration reg=new Registration();
        String no="91 9754856458";
        Assert.assertEquals(true,reg.checkPhoneNumber(no));
    }
    @Test
    public void passwordShouldBespecify()
    {
        Registration reg=new Registration();
        String pass="praRthana@95";
        Assert.assertEquals(true,reg.checkPassword(pass));
    }
}

