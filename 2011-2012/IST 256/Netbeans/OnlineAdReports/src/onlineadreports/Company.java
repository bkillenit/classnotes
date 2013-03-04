/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineadreports;





/**
 *
 * @author BlaineKillen
 */
public class Company {
    
    
    public String companyname, campaign, searchengine;
    public int keyword, month1, month2, month3;  

    //the constructor
    public Company (String companynames, String campaigns, int keywords, String searchengines, int month1s, int month2s, int month3s)
    {
        companyname = companynames;
        campaign = campaigns;
        keyword = keywords;
        searchengine = searchengines;
        month1 = month1s;
        month2 = month2s;
        month3 = month3s;
        
    }
    
    //ads up the total clicks
    public int sumClicks()
    {
        int clicks = 0;
        
        clicks = month1 + month2 + month3;
        
        return clicks;
    }        
    
    
    // returns true of the company is premium
    public boolean isPremium(String campaign, int keywords, int totalclicks)
    {
        boolean premium = false;
        
        if (campaign.equals("national"))
         {
              if ((keywords < 300) && (totalclicks > 20000))
              {
                  premium = true;
              }    
         }
        else 
        {
            premium = false;
        }    
        
        if (campaign.equals("local"))
         {
              if ((keywords < 100) && (totalclicks > 1000))
              {
                  premium = true;
              }    
         }
        else 
        {
            premium = false;
        }  
        
        if (campaign.equals("local"))
         {
              if ((keywords < 100) && (totalclicks > 1000))
              {
                  premium = true;
              }    
         }
        else 
        {
            premium = false;
        } 
        
        return premium;
    }        
    
    //formats the company info into a string
    public String toString()
    {
        int clicks = 0;
        
        clicks = month1 +month2 + month3; 
        
        String result = companyname + " " + keyword +
                " " + String.valueOf(clicks);
        
        return result;
    }        
    
    
}
