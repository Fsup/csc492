/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oravecjp
 */
public class CampusBuilding {
    
    private String name;
    private float latitude;
    private float longitude;
    private float distanceTo;
    
    public CampusBuilding (String name, float latitude, float longitude)
    {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public void setLatitude(float lat)
    {
        latitude = lat;
    }
    
    public void setLongitude(float lon)
    {
        longitude = lon;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getLatitude()
    {
        return latitude;
    }
    
    public float getLongitude()
    {
        return longitude;
    }
    
}
