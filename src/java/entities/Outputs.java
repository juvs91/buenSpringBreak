/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Priscila
 */
@Entity
@XmlRootElement
@NamedQueries({
    //@NamedQuery(name = "Outputs.findBysensorTag",query="SELECT o FROM Outputs o WHERE o.sensorTag = :sensorTag"),
    @NamedQuery(name = "Outputs.findAll", query = "SELECT o FROM Outputs o"),
    @NamedQuery(name = "Outputs.findByIdOutput", query = "SELECT o FROM Outputs o WHERE o.idOutput = :idOutput"),
    @NamedQuery(name = "Outputs.findByGenericTag", query = "SELECT o FROM Outputs o WHERE o.genericTag = :genericTag"),
    @NamedQuery(name = "Outputs.findByOutputValue", query = "SELECT o FROM Outputs o WHERE o.outputValue = :outputValue"),
    @NamedQuery(name = "Outputs.findByIsValid", query = "SELECT o FROM Outputs o WHERE o.isValid = :isValid"),
    @NamedQuery(name = "Outputs.findByInsertDate", query = "SELECT o FROM Outputs o WHERE o.insertDate = :insertDate")})
public class Outputs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_output")
    private Integer idOutput;
    @Size(max = 45)
    @Column(name = "generic_tag")
    private String genericTag;
    @Basic(optional = false)
    @NotNull
    @Column(name = "output_value")
    private float outputValue;
    @Column(name = "is_valid")
    private Boolean isValid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "insert_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date insertDate;
    @JoinColumn(name = "sensor_tag", referencedColumnName = "sensor_tag")
    @ManyToOne
    private SensorTags sensorTag;
    @JoinColumn(name = "id_output_origin_type", referencedColumnName = "id_output_origin_type")
    @ManyToOne(optional = false)
    private OutputOriginType idOutputOriginType;
    @JoinColumn(name = "id_outputs_type_value", referencedColumnName = "id_outputs_type_value")
    @ManyToOne
    private OutputsTypeValue idOutputsTypeValue;
    @JoinColumn(name = "id_measurement_unit", referencedColumnName = "id_measurement_unit")
    @ManyToOne
    private MeasurementUnits idMeasurementUnit;

    public Outputs() {
    }

    public Outputs(Integer idOutput) {
        this.idOutput = idOutput;
    }

    public Outputs(Integer idOutput, float outputValue, Date insertDate) {
        this.idOutput = idOutput;
        this.outputValue = outputValue;
        this.insertDate = insertDate;
    }

    public Integer getIdOutput() {
        return idOutput;
    }

    public void setIdOutput(Integer idOutput) {
        this.idOutput = idOutput;
    }

    public String getGenericTag() {
        return genericTag;
    }

    public void setGenericTag(String genericTag) {
        this.genericTag = genericTag;
    }

    public float getOutputValue() {
        return outputValue;
    }

    public void setOutputValue(float outputValue) {
        this.outputValue = outputValue;
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public SensorTags getSensorTag() {
        return sensorTag;
    }

    public void setSensorTag(SensorTags sensorTag) {
        this.sensorTag = sensorTag;
    }

    public OutputOriginType getIdOutputOriginType() {
        return idOutputOriginType;
    }

    public void setIdOutputOriginType(OutputOriginType idOutputOriginType) {
        this.idOutputOriginType = idOutputOriginType;
    }

    public OutputsTypeValue getIdOutputsTypeValue() {
        return idOutputsTypeValue;
    }

    public void setIdOutputsTypeValue(OutputsTypeValue idOutputsTypeValue) {
        this.idOutputsTypeValue = idOutputsTypeValue;
    }

    public MeasurementUnits getIdMeasurementUnit() {
        return idMeasurementUnit;
    }

    public void setIdMeasurementUnit(MeasurementUnits idMeasurementUnit) {
        this.idMeasurementUnit = idMeasurementUnit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOutput != null ? idOutput.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Outputs)) {
            return false;
        }
        Outputs other = (Outputs) object;
        if ((this.idOutput == null && other.idOutput != null) || (this.idOutput != null && !this.idOutput.equals(other.idOutput))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Outputs[ idOutput=" + idOutput + " ]";
    }
    
}
