package com.smartron.loginvalidations;

import android.widget.Toast;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void isValidEmailId(){
        String email = "xyz@gmail.com";
        if(emailPattern.matches(email)){
            System.out.println("email");
        }else{
            System.out.println("not email");

        }
    }
}