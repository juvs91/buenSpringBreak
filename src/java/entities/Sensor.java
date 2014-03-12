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
import java.sql.*;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author usuario
 */
@Entity
@XmlRootElement

public class Sensor implements Serializable {
   
    
    @Id
    private Long slId;

    @Column(name ="slName1")
    private String slName1;
    
    @Column(name ="slName2")
    private String slName2;
    
    @Column(name ="slName3")
    private String slName3;
    
    @Column(name ="slActualTimestamp")
    private Timestamp slActualTimestamp;
    
    @Column(name ="slActualValue")
    private double slActualValue;
    
    @Column(name ="sensor_tag")
    private String sensor_tag;
    
    @Column(name ="sensor_id")
    private int sensor_id;
    
    @Column(name ="id_sensor_catalog")
    private int id_sensor_catalog;
    
    @Column(name ="sensor_type")
    private String sensor_type;

    
    
    public Long getSlId() {
        return slId;
    }

    public void setSlId(Long slId) {
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

    public Timestamp getSlActualTimestamp() {
        return slActualTimestamp;
    }

    public void setSlActualTimestamp(Timestamp slActualTimestamp) {
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

    public int getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(int sensor_id) {
        this.sensor_id = sensor_id;
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
