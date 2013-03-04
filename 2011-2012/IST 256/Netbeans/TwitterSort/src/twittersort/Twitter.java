/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twittersort;

/**
 *
 * @author BlaineKillen
 */

public class Twitter {

int userRetweet, userId;
String user, fullDate, text;    
    
    public Twitter (String u, int i, String d, String s)
    {
        
        user = u;
        userId = i;
        fullDate = d;
        text = s;
        
    }  
    
public String getUserName()
{
    return user;
}        

public String getDate()
{
    
    return fullDate;
}        

public int getID()
{
    
    return userId;
}        
    
public String toString()
{
  String stringInfo;
  
  stringInfo = "Username: " + user + " ID: " + String.valueOf(userId) + " Date: " + fullDate + " Tweet: " + text;
  
  return stringInfo;  
}        
    
}
