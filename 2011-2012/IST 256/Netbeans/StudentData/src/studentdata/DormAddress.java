/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdata;

/**
 *
 * @author BlaineKillen
 */
public class DormAddress {
    
    public String dormName, dormRoom;
    
    public DormAddress(String dormNames,String dormRooms)
    {
        
        dormName = dormNames;
        dormRoom = dormRooms;
        
    }        
    
    @Override
    public String toString()
    {
        String address;
        
        address = dormRoom + " " + dormName;
        
        return address;
    }        
    
}
