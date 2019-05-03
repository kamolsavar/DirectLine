package com.directline.covercheck.stepDef;

import com.directline.covercheck.drivers.DriversFactory;
import org.junit.Before;

public class Hooks{
    DriversFactory driversFactory= new DriversFactory();

    @cucumber.api.java.Before
    public void setUp(){
        driversFactory.openBrowser();
        driversFactory.navigate("https://covercheck.vwfsinsuranceportal.co.uk/");
        driversFactory.appplyImplicitWait();
        driversFactory.maximize();
    }

    public void tearDown(){
        driversFactory.openBrowser();
    }


}
