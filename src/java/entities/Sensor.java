/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;
import java.util.Date;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author usuario
 */
@Entity
@XmlRootElement

public class Sensor implements Serializable {
   
    
    @Id
    private int slId;
    private String slName1;
    private String slName2;
    private String slName3;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date slActualTimestamp;
    private double slActualValue;
    private String sensor_tag;
    private int id_sensor_catalog;
    private String sensor_type;
    public Sensor() {
    }

    public Sensor(int slId) {
        this.slId = slId;
    }

    public Sensor(int slId, String slName1, String slName2,
            String slName3, Date slActualTimestamp, double slActualValue,
            String sensor_tag, int id_sensor_catalog, String sensor_type) {
        this.slId = slId;
        this.slName1 = slName1;
        this.slName2 = slName2;
        this.slName3 = slName3;
        this.slActualTimestamp = slActualTimestamp;
        this.slActualValue = slActualValue;
        this.sensor_tag = sensor_tag;
        this.id_sensor_catalog = id_sensor_catalog;
        this.sensor_type = sensor_type;
    }

    public int getSlId() {
        return slId;
    }

    public void setSlId(int slId) {
        this.slId = slId;
    }

    public String getSlName1() {
        return slName1;
    }

    public void setSlName1(String slName1) {
        this.slName1 = slName1;
    }

    public String getSlName2() {
        return slName2;
    }

    public void setSlName2(String slName2) {
        this.slName2 = slName2;
    }

    public String getSlName3() {
        return slName3;
    }

    public void setSlName3(String slName3) {
        this.slName3 = slName3;
    }

    public Date getSlActualTimestamp() {
        return slActualTimestamp;
    }

    public void setSlActualTimestamp(Date slActualTimestamp) {
        this.slActualTimestamp = slActualTimestamp;
    }

    public double getSlActualValue() {
        return slActualValue;
    }

    public void setSlActualValue(double slActualValue) {
        this.slActualValue = slActualValue;
    }

    public String getSensor_tag() {
        return sensor_tag;
    }

    public void setSensor_tag(String sensor_tag) {
        this.sensor_tag = sensor_tag;
    }

    public int getId_sensor_catalog() {
        return id_sensor_catalog;
    }

    public void setId_sensor_catalog(int id_sensor_catalog) {
        this.id_sensor_catalog = id_sensor_catalog;
    }

    public String getSensor_type() {
        return sensor_type;
    }

    public void setSensor_type(String sensor_type) {
        this.sensor_type = sensor_type;
    }

      
}
