/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

import java.util.ArrayList;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)
    {
        char [] rev_s = new char[s.length()];
        rev_s = s.toCharArray();
        int length = s.length();
        int i,j;
        for(i= 0, j = length;i<length;i++,j--) {
            String temp = new String();
            temp = s;
            rev_s[i] = rev_s[j];
            rev_s[j] = rev_s[i];
        }

        return (s);

    }




    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {

        String name = new String(s);
        return(name.toUpperCase());

    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        String f = new String(s);
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s)
    {
        String s1 = new String();
        s1.toCharArray();
        System.out.println(s);

        return 0;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        StrriStudentID_MidTerm_ W2020_MidTerm_MAD3463ginalString;
        String f  = findString;
        String n = newString;
        char ch[] = s.toCharArray();
        char c[]= n.toCharArray();

         {
            if (s.length() == 0)

            else
                s.co
        }

        n = c.toString();

   }
}

