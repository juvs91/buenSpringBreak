/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factories;

import graph.object.SensorGas;
import graph.object.SensorTemp;
import javax.ejb.Local;

/**
 *
 * @author ccastillo
 */

public interface AbstractFactory {
    
    public String entro();
    public SensorGas createSensorGas();
    public SensorTemp createSensorTemp();
}
