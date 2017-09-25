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
@Table(name = "izindurum", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Izindurum.findAll", query = "SELECT \u0131 FROM Izindurum \u0131")
    , @NamedQuery(name = "Izindurum.findBySicil", query = "SELECT \u0131 FROM Izindurum \u0131 WHERE \u0131.sicil = :sicil")
    , @NamedQuery(name = "Izindurum.findByIzinhakedis", query = "SELECT \u0131 FROM Izindurum \u0131 WHERE \u0131.izinhakedis = :izinhakedis")
    , @NamedQuery(name = "Izindurum.findByDevirizin", query = "SELECT \u0131 FROM Izindurum \u0131 WHERE \u0131.devirizin = :devirizin")
    , @NamedQuery(name = "Izindurum.findByKullan\u0131lanizin", query = "SELECT \u0131 FROM Izindurum \u0131 WHERE \u0131.kullan\u0131lanizin = :kullan\u0131lanizin")
    , @NamedQuery(name = "Izindurum.findByKalanyillikizin", query = "SELECT \u0131 FROM Izindurum \u0131 WHERE \u0131.kalanyillikizin = :kalanyillikizin")
    , @NamedQuery(name = "Izindurum.findByYolizni", query = "SELECT \u0131 FROM Izindurum \u0131 WHERE \u0131.yolizni = :yolizni")
    , @NamedQuery(name = "Izindurum.findByRapor", query = "SELECT \u0131 FROM Izindurum \u0131 WHERE \u0131.rapor = :rapor")
    , @NamedQuery(name = "Izindurum.findByMazeretizni", query = "SELECT \u0131 FROM Izindurum \u0131 WHERE \u0131.mazeretizni = :mazeretizni")
    , @NamedQuery(name = "Izindurum.findByOzursuz", query = "SELECT \u0131 FROM Izindurum \u0131 WHERE \u0131.ozursuz = :ozursuz")
    , @NamedQuery(name = "Izindurum.findByIdariizin", query = "SELECT \u0131 FROM Izindurum \u0131 WHERE \u0131.idariizin = :idariizin")})
public class Izindurum implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sicil", nullable = false)
    private Integer sicil;
    @Basic(optional = false)
    @Column(name = "izinhakedis", nullable = false)
    private int izinhakedis;
    @Column(name = "devirizin")
    private Integer devirizin;
    @Column(name = "kullan\u0131lanizin")
    private Integer kullanılanizin;
    @Column(name = "kalanyillikizin")
    private Integer kalanyillikizin;
    @Column(name = "yolizni")
    private boolean yolizni;
    @Column(name = "rapor")
    private Integer rapor;
    @Column(name = "mazeretizni")
    private Integer mazeretizni;
    @Column(name = "ozursuz")
    private Integer ozursuz;
    @Column(name = "idariizin")
    private Integer idariizin;

    public Izindurum() {
    }

    public Izindurum(Integer sicil) {
        this.sicil = sicil;
    }

    public Izindurum(Integer sicil, int izinhakedis) {
        this.sicil = sicil;
        this.izinhakedis = izinhakedis;
    }

    public Integer getSicil() {
        return sicil;
    }

    public void setSicil(Integer sicil) {
        this.sicil = sicil;
    }

    public int getIzinhakedis() {
        return izinhakedis;
    }

    public void setIzinhakedis(int izinhakedis) {
        this.izinhakedis = izinhakedis;
    }

    public Integer getDevirizin() {
        return devirizin;
    }

    public void setDevirizin(Integer devirizin) {
        this.devirizin = devirizin;
    }

    public Integer getKullanılanizin() {
        return kullanılanizin;
    }

    public void setKullanılanizin(Integer kullanılanizin) {
        this.kullanılanizin = kullanılanizin;
    }

    public Integer getKalanyillikizin() {
        return kalanyillikizin;
    }

    public void setKalanyillikizin(Integer kalanyillikizin) {
        this.kalanyillikizin = kalanyillikizin;
    }

    public boolean isYolizni() {
        return yolizni;
    }

    public void setYolizni(boolean yolizni) {
        this.yolizni = yolizni;
    }

    

    public Integer getRapor() {
        return rapor;
    }

    public void setRapor(Integer rapor) {
        this.rapor = rapor;
    }

    public Integer getMazeretizni() {
        return mazeretizni;
    }

    public void setMazeretizni(Integer mazeretizni) {
        this.mazeretizni = mazeretizni;
    }

    public Integer getOzursuz() {
        return ozursuz;
    }

    public void setOzursuz(Integer ozursuz) {
        this.ozursuz = ozursuz;
    }

    public Integer getIdariizin() {
        return idariizin;
    }

    public void setIdariizin(Integer idariizin) {
        this.idariizin = idariizin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sicil != null ? sicil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Izindurum)) {
            return false;
        }
        Izindurum other = (Izindurum) object;
        if ((this.sicil == null && other.sicil != null) || (this.sicil != null && !this.sicil.equals(other.sicil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return sicil.toString();
    }
    
}
