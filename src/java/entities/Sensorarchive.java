/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import entities.Status;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ccastillo
 */
@Entity
@Table(name = "sensorarchive")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sensorarchive.findAll", query = "SELECT s FROM Sensorarchive s"),
    @NamedQuery(name = "Sensorarchive.findBySaTimestamp", query = "SELECT s FROM Sensorarchive s WHERE s.saTimestamp = :saTimestamp"),
    @NamedQuery(name = "Sensorarchive.findBySaGMTOffset", query = "SELECT s FROM Sensorarchive s WHERE s.saGMTOffset = :saGMTOffset"),
    @NamedQuery(name = "Sensorarchive.findBySaValue", query = "SELECT s FROM Sensorarchive s WHERE s.saValue = :saValue"),
    @NamedQuery(name = "Sensorarchive.findBySensorarchiveId", query = "SELECT s FROM Sensorarchive s WHERE s.sensorarchiveId = :sensorarchiveId")})
public class Sensorarchive implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "saTimestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date saTimestamp;
    @Column(name = "saGMTOffset")
    private Integer saGMTOffset;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "saValue")
    private Double saValue;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "sensorarchive_id")
    private Float sensorarchiveId;
    @JoinColumn(name = "saStatus", referencedColumnName = "stId")
    @ManyToOne
    private Status saStatus;
    @JoinColumn(name = "saSensorId", referencedColumnName = "slId")
    @ManyToOne(optional = false)
    private Sensorlist saSensorId;

    public Sensorarchive() {
    }

    public Sensorarchive(Float sensorarchiveId) {
        this.sensorarchiveId = sensorarchiveId;
    }

    public Date getSaTimestamp() {
        return saTimestamp;
    }

    public void setSaTimestamp(Date saTimestamp) {
        this.saTimestamp = saTimestamp;
    }

    public Integer getSaGMTOffset() {
        return saGMTOffset;
    }

    public void setSaGMTOffset(Integer saGMTOffset) {
        this.saGMTOffset = saGMTOffset;
    }

    public Double getSaValue() {
        return saValue;
    }

    public void setSaValue(Double saValue) {
        this.saValue = saValue;
    }

    public Float getSensorarchiveId() {
        return sensorarchiveId;
    }

    public void setSensorarchiveId(Float sensorarchiveId) {
        this.sensorarchiveId = sensorarchiveId;
    }

    public Status getSaStatus() {
        return saStatus;
    }

    public void setSaStatus(Status saStatus) {
        this.saStatus = saStatus;
    }

    public Sensorlist getSaSensorId() {
        return saSensorId;
    }

    public void setSaSensorId(Sensorlist saSensorId) {
        this.saSensorId = saSensorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sensorarchiveId != null ? sensorarchiveId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sensorarchive)) {
            return false;
        }
        Sensorarchive other = (Sensorarchive) object;
        if ((this.sensorarchiveId == null && other.sensorarchiveId != null) || (this.sensorarchiveId != null && !this.sensorarchiveId.equals(other.sensorarchiveId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Factories.Sensorarchive[ sensorarchiveId=" + sensorarchiveId + " ]";
    }
    
}
