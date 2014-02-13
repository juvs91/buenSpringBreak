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
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Module.findAll", query = "SELECT m FROM Module m"),
    @NamedQuery(name = "Module.findByIdModule", query = "SELECT m FROM Module m WHERE m.idModule = :idModule"),
    @NamedQuery(name = "Module.findByModuleName", query = "SELECT m FROM Module m WHERE m.moduleName = :moduleName"),
    @NamedQuery(name = "Module.findByLastUpdateDate", query = "SELECT m FROM Module m WHERE m.lastUpdateDate = :lastUpdateDate")})
public class Module implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_module")
    private Integer idModule;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "module_name")
    private String moduleName;
    @Column(name = "last_update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateDate;
    @OneToMany(mappedBy = "idModule")
    private Collection<CommDeviceTags> commDeviceTagsCollection;

    public Module() {
    }

    public Module(Integer idModule) {
        this.idModule = idModule;
    }

    public Module(Integer idModule, String moduleName) {
        this.idModule = idModule;
        this.moduleName = moduleName;
    }

    public Integer getIdModule() {
        return idModule;
    }

    public void setIdModule(Integer idModule) {
        this.idModule = idModule;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @XmlTransient
    public Collection<CommDeviceTags> getCommDeviceTagsCollection() {
        return commDeviceTagsCollection;
    }

    public void setCommDeviceTagsCollection(Collection<CommDeviceTags> commDeviceTagsCollection) {
        this.commDeviceTagsCollection = commDeviceTagsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idModule != null ? idModule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Module)) {
            return false;
        }
        Module other = (Module) object;
        if ((this.idModule == null && other.idModule != null) || (this.idModule != null && !this.idModule.equals(other.idModule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Module[ idModule=" + idModule + " ]";
    }
    
}
