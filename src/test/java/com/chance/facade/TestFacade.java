package com.chance.facade;

import com.chance.facade.example01.Facade;
import com.chance.facade.example02.SmartAppliancesFacade;
import org.junit.Test;

public class TestFacade {
    @Test
    public void test01() {
        Facade facade = new Facade();
        facade.method();
    }

    @Test
    public void test02() {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("oasdkopenlaskjd");
    }
}


