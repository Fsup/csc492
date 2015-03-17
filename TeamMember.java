
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oravecjp
 */
public class TeamMember {
    
    private String name;
    private CampusBuilding building;
    private ArrayList<TeamMember> otherMembers = new ArrayList<TeamMember>();
    private final float RADIUS_OF_EARTH = 6378100; // in meters
    private float distance = 0;
    //private ArrayList<float> distanceToMembers = new ArrayList<float>();
    
    public TeamMember(String name, CampusBuilding building)
    {
        this.name = name;
        this.building = building;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public void setDistance(float d, TeamMember m)
    {
        distance = d;
    }
    
    public void setBuilding(CampusBuilding b)
    {
        building = b;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float geDistance()
    {
        return distance;
    }
    
    public CampusBuilding getBuilding()
    {
        return building;
    }
    
    public void AddMember(TeamMember t)
    {
        this.otherMembers.add(t);
        //t.AddMember(this.teamMember);
    }
    
    public void getOtherMembers(){
          System.out.println("Other Members for: " + this.name); 
        for(TeamMember m: otherMembers){
        System.out.println("\tName: " + m.name); 
        }
    }
    
    public void distanceFrom(TeamMember m){
        
        
        for(TeamMember o : otherMembers)
        {
//            if(distance between m and o isn't -1)
//            {
//                  skip else do below
//            }
            calculateDistances(o.getBuilding().getLatitude(), m.getBuilding().getLatitude(), o.getBuilding().getLongitude(), m.getBuilding().getLongitude());
            o.setDistance(distance, m);
            m.setDistance(distance, o);
        }
        
    }
    
    public float calculateDistances(float lat1, float lat2, float lon1, float lon2) {


        double distance;
        float finalResult = 0;

        if (lat1 == lat2 && lon1 == lon2) {
            distance = 0;
        } else {
            distance = Math.acos(Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1) * Math.cos(lon2)
                    + Math.cos(lat1) * Math.sin(lat2) * Math.cos(lon1) * Math.sin(lon2) + Math.sin(lat1) * Math.sin(lon1))
                    / 360 * 2 * Math.PI * RADIUS_OF_EARTH;

            finalResult = (float) distance;
        }

        return finalResult;
    }
    
}
