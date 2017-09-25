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
@Table(name = "izingiris", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Izingiris.findAll", query = "SELECT \u0131 FROM Izingiris \u0131")
    , @NamedQuery(name = "Izingiris.findBySira", query = "SELECT \u0131 FROM Izingiris \u0131 WHERE \u0131.sira = :sira")
    , @NamedQuery(name = "Izingiris.findBySicil", query = "SELECT \u0131 FROM Izingiris \u0131 WHERE \u0131.sicil = :sicil")
    , @NamedQuery(name = "Izingiris.findByIzinsekli", query = "SELECT \u0131 FROM Izingiris \u0131 WHERE \u0131.izinsekli = :izinsekli")
    , @NamedQuery(name = "Izingiris.findByBegin", query = "SELECT \u0131 FROM Izingiris \u0131 WHERE \u0131.begin = :begin")
    , @NamedQuery(name = "Izingiris.findByEnd", query = "SELECT \u0131 FROM Izingiris \u0131 WHERE \u0131.end = :end")
    , @NamedQuery(name = "Izingiris.findByIzinadresi", query = "SELECT \u0131 FROM Izingiris \u0131 WHERE \u0131.izinadresi = :izinadresi")
    , @NamedQuery(name = "Izingiris.findByIzinili", query = "SELECT \u0131 FROM Izingiris \u0131 WHERE \u0131.izinili = :izinili")
    , @NamedQuery(name = "Izingiris.findByYolizni", query = "SELECT \u0131 FROM Izingiris \u0131 WHERE \u0131.yolizni = :yolizni")
    , @NamedQuery(name = "Izingiris.findBySure", query = "SELECT \u0131 FROM Izingiris \u0131 WHERE \u0131.sure = :sure")
    , @NamedQuery(name = "Izingiris.findBySenesi", query = "SELECT \u0131 FROM Izingiris \u0131 WHERE \u0131.senesi = :senesi")})
public class Izingiris implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sira", nullable = false)
    private Integer sira;
    @Basic(optional = false)
    @Column(name = "sicil", nullable = false)
    private int sicil;
    @Column(name = "izinsekli", length = 2000000000)
    private String izinsekli;
    @Column(name = "begin", length = 2000000000)
    private String begin;
    @Column(name = "end", length = 2000000000)
    private String end;
    @Column(name = "izinadresi", length = 2000000000)
    private String izinadresi;
    @Column(name = "izinili", length = 2000000000)
    private String izinili;
    @Column(name = "yolizni")
    private Integer yolizni;
    @Column(name = "sure")
    private Integer sure;
    @Column(name = "senesi")
    private Integer senesi;

    public Izingiris() {
    }

    public Izingiris(Integer sira) {
        this.sira = sira;
    }

    public Izingiris(Integer sira, int sicil) {
        this.sira = sira;
        this.sicil = sicil;
    }

    public Integer getSira() {
        return sira;
    }

    public void setSira(Integer sira) {
        this.sira = sira;
    }

    public int getSicil() {
        return sicil;
    }

    public void setSicil(int sicil) {
        this.sicil = sicil;
    }

    public String getIzinsekli() {
        return izinsekli;
    }

    public void setIzinsekli(String izinsekli) {
        this.izinsekli = izinsekli;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getIzinadresi() {
        return izinadresi;
    }

    public void setIzinadresi(String izinadresi) {
        this.izinadresi = izinadresi;
    }

    public String getIzinili() {
        return izinili;
    }

    public void setIzinili(String izinili) {
        this.izinili = izinili;
    }

    public Integer getYolizni() {
        return yolizni;
    }

    public void setYolizni(Integer yolizni) {
        this.yolizni = yolizni;
    }

    public Integer getSure() {
        return sure;
    }

    public void setSure(Integer sure) {
        this.sure = sure;
    }

    public Integer getSenesi() {
        return senesi;
    }

    public void setSenesi(Integer senesi) {
        this.senesi = senesi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sira != null ? sira.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Izingiris)) {
            return false;
        }
        Izingiris other = (Izingiris) object;
        if ((this.sira == null && other.sira != null) || (this.sira != null && !this.sira.equals(other.sira))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Izingiris[ sira=" + sira + " ]";
    }
    
}
