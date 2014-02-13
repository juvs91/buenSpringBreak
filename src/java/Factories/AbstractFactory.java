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
public interface AbstractFactory {
    public DataPointGas createDataPointGas();
    public DataPointTemperature createDataPointTemperature();
    
}
