/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ruhi ÇELİK
 */
@Entity
@Table(name = "hizmetsinifi", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hizmetsinifi.findAll", query = "SELECT h FROM Hizmetsinifi h")
    , @NamedQuery(name = "Hizmetsinifi.findById", query = "SELECT h FROM Hizmetsinifi h WHERE h.id = :id")
    , @NamedQuery(name = "Hizmetsinifi.findByDeger", query = "SELECT h FROM Hizmetsinifi h WHERE h.deger = :deger")})
public class Hizmetsinifi implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "deger", nullable = false, length = 2000000000)
    private String deger;

    public Hizmetsinifi() {
    }

    public Hizmetsinifi(Integer id) {
        this.id = id;
    }

    public Hizmetsinifi(Integer id, String deger) {
        this.id = id;
        this.deger = deger;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getDeger() {
        return deger;
    }

    public void setDeger(String deger) {
        String oldDeger = this.deger;
        this.deger = deger;
        changeSupport.firePropertyChange("deger", oldDeger, deger);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hizmetsinifi)) {
            return false;
        }
        Hizmetsinifi other = (Hizmetsinifi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return deger;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
