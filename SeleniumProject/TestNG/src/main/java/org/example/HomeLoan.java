package org.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {

    @Parameters({"URL","APIKey/username"})
    @Test
    public void WebloginHomeLoan(String urlname,String apikey){
        System.out.println("Web Home");
        System.out.println(apikey);
        System.out.println(urlname);
    }
    @Test
    public void MobileLoginHomeLoan(){
        System.out.println("Mobile Home");
    }
    @Test
    public void LoginApiHomelogin(){
        System.out.println("API Home");
    }
}

