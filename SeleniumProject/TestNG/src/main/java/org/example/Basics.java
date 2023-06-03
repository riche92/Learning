package org.example;

import org.testng.annotations.*;

import java.util.Iterator;

public class Basics {
    @BeforeClass
    public void beforeClass(){
        System.out.println("This is before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("This is after class");
    }
    @AfterTest
    public void lastTestExecution(){
        System.out.println("Last execute");
    }
    @AfterSuite(timeOut = 4000)//Gives us a 40 second timeout
    public void lastSuiteExecution(){
        System.out.println("Last Execution of XML");
    }
    @Test(enabled = false)
    public void Zebra(){

        System.out.println("Zeebra");
    }
    @Parameters({"URL"})
    @Test
    public void Demo(String urlname){

        System.out.println("Hello");
        System.out.println(urlname);
        System.out.println("Testing GitHub");
    }
    @BeforeMethod
    public void beforeEvery(){
        System.out.println("Execute before every test method in basics");
    }
    @AfterMethod
    public void AfterEvery(){
        System.out.println("Execute After every test method in basics");
    }
    @Test(dependsOnMethods = {"regularTest"})
    public void secondTest(){
        System.out.println("Bye");
    }

    @Test
    public void regularTest(){
        System.out.println("I am a regular test");
    }

    @BeforeTest(groups={"Smoke"})
    public void WebsiteLogin() {
        System.out.println("I want to go to website");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I happen before suite");
    }

    @Test(dataProvider = "getData")
    public void mobileLogout(String username, String password){
        System.out.println(username);
        System.out.println(password);

    }

    @DataProvider
    public Object[][] getData(){
        //1st combination - user name password - good credit history
        //2nd username password - no credit history
        //3rd username password - fradulent credit history
        Object[][] data = new Object[3][2];
        data [0][0] = "firstusername";
        data[0][1] = "firstpassword";
        //columns in the row are nothing but values for that particular combination(row)

        data[1][0] = "secondusername";
        data[1][1] = "secondpassword";

        data[2][0] = "thirdusername";
        data[2][1] = "thirdpassword";

        return data;
    }
}
