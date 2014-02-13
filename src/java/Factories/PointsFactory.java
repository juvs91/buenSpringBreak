/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factories;

import entities.DataPointGas;
import entities.DataPointTemperature;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author usuario
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "PointsFactory.createPointGas", query = "SELECT c FROM Company c"),
    @NamedQuery(name = "PointsFactory.createPointTemperature", query = "SELECT c FROM Company c")
})
public class PointsFactory implements AbstractFactory, Serializable {
   
    @Id
    private Integer idOutput;
    
    
    
    @Override
    public DataPointGas createDataPointGas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
    }

    @Override
    public DataPointTemperature createDataPointTemperature() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    }

    public Integer getIdOutput() {
        return idOutput;
    }

    public void setIdOutput(Integer idOutput) {
        this.idOutput = idOutput;
    }
    
}
