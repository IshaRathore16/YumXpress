/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumexpress.utility;

import org.apache.commons.validator.routines.EmailValidator;



/**
 *
 * @author Isha Rathore
 */
public class Validator {
    public static boolean isValidEmail(String emailId){
        EmailValidator validator=EmailValidator.getInstance();
        return validator.isValid(emailId);
     
        
    }
    public static boolean isValidMobile(String mobNo){
        if(mobNo.length()!=10)
            return false;
        char[]mob=mobNo.toCharArray();
        for(char ch:mob){
            if(!Character.isDigit(ch))
                return false;
        }
        return true;
    }
}
