/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.sql.Timestamp;



/**
 *
 * @author usuario
 */
public interface InterfaceDataPoint {
 
    
    public void setTimeStamp();
    public Timestamp getTimeStamp();
    public void setValue();
    public float getValue();
    public void setTag();
    public int getTag();
    public void setUnit();
    public String getUnit();

  
    
}
