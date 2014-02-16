/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Priscila
 */
@Entity
@Table(name = "outputs_type_value")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OutputsTypeValue.findAll", query = "SELECT o FROM OutputsTypeValue o"),
    @NamedQuery(name = "OutputsTypeValue.findByIdOutputsTypeValue", query = "SELECT o FROM OutputsTypeValue o WHERE o.idOutputsTypeValue = :idOutputsTypeValue"),
    @NamedQuery(name = "OutputsTypeValue.findByTypeName", query = "SELECT o FROM OutputsTypeValue o WHERE o.typeName = :typeName"),
    @NamedQuery(name = "OutputsTypeValue.findByLastUpdateDate", query = "SELECT o FROM OutputsTypeValue o WHERE o.lastUpdateDate = :lastUpdateDate")})
public class OutputsTypeValue implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_outputs_type_value")
    private Integer idOutputsTypeValue;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "type_name")
    private String typeName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateDate;
    @OneToMany(mappedBy = "idOutputsTypeValue")
    private Collection<Outputs> outputsCollection;

    public OutputsTypeValue() {
    }

    public OutputsTypeValue(Integer idOutputsTypeValue) {
        this.idOutputsTypeValue = idOutputsTypeValue;
    }

    public OutputsTypeValue(Integer idOutputsTypeValue, String typeName, Date lastUpdateDate) {
        this.idOutputsTypeValue = idOutputsTypeValue;
        this.typeName = typeName;
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getIdOutputsTypeValue() {
        return idOutputsTypeValue;
    }

    public void setIdOutputsTypeValue(Integer idOutputsTypeValue) {
        this.idOutputsTypeValue = idOutputsTypeValue;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @XmlTransient
    public Collection<Outputs> getOutputsCollection() {
        return outputsCollection;
    }

    public void setOutputsCollection(Collection<Outputs> outputsCollection) {
        this.outputsCollection = outputsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOutputsTypeValue != null ? idOutputsTypeValue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OutputsTypeValue)) {
            return false;
        }
        OutputsTypeValue other = (OutputsTypeValue) object;
        if ((this.idOutputsTypeValue == null && other.idOutputsTypeValue != null) || (this.idOutputsTypeValue != null && !this.idOutputsTypeValue.equals(other.idOutputsTypeValue))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OutputsTypeValue[ idOutputsTypeValue=" + idOutputsTypeValue + " ]";
    }
    
}
