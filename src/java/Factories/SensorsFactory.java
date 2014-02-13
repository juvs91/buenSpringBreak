/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factories;

import entities.DataPointGas;
import entities.DataPointTemperature;

/**
 *
 * @author usuario
 */
public class SensorsFactory implements AbstractFactory {

    @Override
    public DataPointGas createDataPointGas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DataPointTemperature createDataPointTemperature() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
