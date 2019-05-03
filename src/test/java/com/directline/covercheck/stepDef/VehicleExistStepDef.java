package com.directline.covercheck.stepDef;

import com.directline.covercheck.pageFactory.VehicleExist;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class VehicleExistStepDef {

    VehicleExist vehicleExist = new VehicleExist();

    @Given("^user is on homePage$")
    public void enterInhomepage(){
        Assert.assertTrue(vehicleExist.getTitle().equals("Dealer Portal"));
    }

    @When("^user input valid vehicle registration as \"([^\"]*)\"$")
    public void enterVehicleReg(String Reg) {
        vehicleExist.findVehicle(Reg);
    }

    @Then("^user should see outcome as \"([^\"]*)\"$")
    public void seeResult(String Result){
        String actualResult=vehicleExist.getResult();
        Assert.assertEquals(Result, actualResult);
    }
}


