package com.directline.covercheck.pageFactory;

import com.directline.covercheck.drivers.DriversFactory;
import org.openqa.selenium.By;

public class VehicleExist extends DriversFactory {

    public void findVehicle(String Reg){
        driver.findElement(By.id("vehicleReg")).sendKeys(Reg);
        driver.findElement(By.name("btnfind")).click();
    }

    public String getResult() {
        return driver.findElement(By.className("result")).getText();
    }
}
