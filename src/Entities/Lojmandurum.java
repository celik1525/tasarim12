/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ruhi ÇELİK
 */
@Entity
@Table(name = "lojmandurum", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lojmandurum.findAll", query = "SELECT l FROM Lojmandurum l")
    , @NamedQuery(name = "Lojmandurum.findById", query = "SELECT l FROM Lojmandurum l WHERE l.id = :id")
    , @NamedQuery(name = "Lojmandurum.findByDeger", query = "SELECT l FROM Lojmandurum l WHERE l.deger = :deger")})
public class Lojmandurum implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "deger", nullable = false, length = 2000000000)
    private String deger;

    public Lojmandurum() {
    }

    public Lojmandurum(Integer id) {
        this.id = id;
    }

    public Lojmandurum(Integer id, String deger) {
        this.id = id;
        this.deger = deger;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeger() {
        return deger;
    }

    public void setDeger(String deger) {
        this.deger = deger;
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
        if (!(object instanceof Lojmandurum)) {
            return false;
        }
        Lojmandurum other = (Lojmandurum) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return deger;
    }
    
}
