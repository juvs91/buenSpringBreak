/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "output_origin_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OutputOriginType.findAll", query = "SELECT o FROM OutputOriginType o"),
    @NamedQuery(name = "OutputOriginType.findByIdOutputOriginType", query = "SELECT o FROM OutputOriginType o WHERE o.idOutputOriginType = :idOutputOriginType"),
    @NamedQuery(name = "OutputOriginType.findByOriginTypeName", query = "SELECT o FROM OutputOriginType o WHERE o.originTypeName = :originTypeName"),
    @NamedQuery(name = "OutputOriginType.findByLastUpdateDate", query = "SELECT o FROM OutputOriginType o WHERE o.lastUpdateDate = :lastUpdateDate")})
public class OutputOriginType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_output_origin_type")
    private Integer idOutputOriginType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "origin_type_name")
    private String originTypeName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOutputOriginType")
    private Collection<Outputs> outputsCollection;

    public OutputOriginType() {
    }

    public OutputOriginType(Integer idOutputOriginType) {
        this.idOutputOriginType = idOutputOriginType;
    }

    public OutputOriginType(Integer idOutputOriginType, String originTypeName, Date lastUpdateDate) {
        this.idOutputOriginType = idOutputOriginType;
        this.originTypeName = originTypeName;
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getIdOutputOriginType() {
        return idOutputOriginType;
    }

    public void setIdOutputOriginType(Integer idOutputOriginType) {
        this.idOutputOriginType = idOutputOriginType;
    }

    public String getOriginTypeName() {
        return originTypeName;
    }

    public void setOriginTypeName(String originTypeName) {
        this.originTypeName = originTypeName;
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
        hash += (idOutputOriginType != null ? idOutputOriginType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OutputOriginType)) {
            return false;
        }
        OutputOriginType other = (OutputOriginType) object;
        if ((this.idOutputOriginType == null && other.idOutputOriginType != null) || (this.idOutputOriginType != null && !this.idOutputOriginType.equals(other.idOutputOriginType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OutputOriginType[ idOutputOriginType=" + idOutputOriginType + " ]";
    }
    
}
