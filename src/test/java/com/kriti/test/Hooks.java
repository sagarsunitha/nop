package com.kriti.test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.FileNotFoundException;

/**
 * Created by Asus on 04/05/2016.
 */
public class Hooks {
    @Before
    public void setup() throws FileNotFoundException {
        new DriveManager().openBrowser();

    }
    @After
    public void teardown(){
        new DriveManager().closeBrowser();

    }
}
