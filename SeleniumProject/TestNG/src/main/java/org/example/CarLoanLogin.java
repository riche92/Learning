package org.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoanLogin {
    @Test(groups={"Smoke"})
    public void WebloginCarLoan(){
        System.out.println("Web Car");
    }
    @Test
    public void MobileLogincarLoan(){
        System.out.println("Mobile Car");
    }
    @Test
    public void LoginApiCarlogin(){
        System.out.println("API Car");
    }
    @Parameters({"URL"})
    @Test
    public void MobilePasswordCar(String urlname){
        System.out.println("API Car");
        System.out.println(urlname);
    }
}
