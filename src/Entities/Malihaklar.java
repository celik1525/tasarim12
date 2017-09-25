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
@Table(name = "malihaklar", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Malihaklar.findAll", query = "SELECT m FROM Malihaklar m")
    , @NamedQuery(name = "Malihaklar.findBySicil", query = "SELECT m FROM Malihaklar m WHERE m.sicil = :sicil")
    , @NamedQuery(name = "Malihaklar.findByDerece", query = "SELECT m FROM Malihaklar m WHERE m.derece = :derece")
    , @NamedQuery(name = "Malihaklar.findByKademe", query = "SELECT m FROM Malihaklar m WHERE m.kademe = :kademe")
    , @NamedQuery(name = "Malihaklar.findByGosterge", query = "SELECT m FROM Malihaklar m WHERE m.gosterge = :gosterge")
    , @NamedQuery(name = "Malihaklar.findByEkgosterge", query = "SELECT m FROM Malihaklar m WHERE m.ekgosterge = :ekgosterge")
    , @NamedQuery(name = "Malihaklar.findByAileyardimi", query = "SELECT m FROM Malihaklar m WHERE m.aileyardimi = :aileyardimi")
    , @NamedQuery(name = "Malihaklar.findByCocuk", query = "SELECT m FROM Malihaklar m WHERE m.cocuk = :cocuk")
    , @NamedQuery(name = "Malihaklar.findBySendikaUy", query = "SELECT m FROM Malihaklar m WHERE m.sendikaUy = :sendikaUy")
    , @NamedQuery(name = "Malihaklar.findBySendika", query = "SELECT m FROM Malihaklar m WHERE m.sendika = :sendika")
    , @NamedQuery(name = "Malihaklar.findByYabancidil", query = "SELECT m FROM Malihaklar m WHERE m.yabancidil = :yabancidil")
    , @NamedQuery(name = "Malihaklar.findByDilderece", query = "SELECT m FROM Malihaklar m WHERE m.dilderece = :dilderece")
    , @NamedQuery(name = "Malihaklar.findByMezuniyet", query = "SELECT m FROM Malihaklar m WHERE m.mezuniyet = :mezuniyet")
    , @NamedQuery(name = "Malihaklar.findByMezuniyetBolum", query = "SELECT m FROM Malihaklar m WHERE m.mezuniyetBolum = :mezuniyetBolum")
    , @NamedQuery(name = "Malihaklar.findByMemuriyetBaslama", query = "SELECT m FROM Malihaklar m WHERE m.memuriyetBaslama = :memuriyetBaslama")})
public class Malihaklar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sicil", nullable = false)
    private Integer sicil;
    @Column(name = "derece")
    private Integer derece;
    @Column(name = "kademe")
    private Integer kademe;
    @Column(name = "gosterge")
    private Integer gosterge;
    @Column(name = "ekgosterge")
    private Integer ekgosterge;
    @Column(name = "aileyardimi")
    private boolean aileyardimi;
    @Column(name = "cocuk")
    private Integer cocuk;
    @Column(name = "sendikaUy")
    private boolean sendikaUy;
    @Column(name = "sendika")
    private String sendika;
    @Column(name = "yabancidil", length = 2000000000)
    private String yabancidil;
    @Column(name = "dilderece", length = 2000000000)
    private String dilderece;
    @Column(name = "mezuniyet", length = 2000000000)
    private String mezuniyet;
    @Column(name = "mezuniyetBolum", length = 2000000000)
    private String mezuniyetBolum;
    @Column(name = "memuriyetBaslama", length = 2000000000)
    private String memuriyetBaslama;

    public Malihaklar() {
    }

    public Malihaklar(Integer sicil) {
        this.sicil = sicil;
    }

    public Integer getSicil() {
        return sicil;
    }

    public void setSicil(Integer sicil) {
        this.sicil = sicil;
    }

    public Integer getDerece() {
        return derece;
    }

    public void setDerece(Integer derece) {
        this.derece = derece;
    }

    public Integer getKademe() {
        return kademe;
    }

    public void setKademe(Integer kademe) {
        this.kademe = kademe;
    }

    public Integer getGosterge() {
        return gosterge;
    }

    public void setGosterge(Integer gosterge) {
        this.gosterge = gosterge;
    }

    public Integer getEkgosterge() {
        return ekgosterge;
    }

    public void setEkgosterge(Integer ekgosterge) {
        this.ekgosterge = ekgosterge;
    }

   

    public Integer getCocuk() {
        return cocuk;
    }

    public void setCocuk(Integer cocuk) {
        this.cocuk = cocuk;
    }

    public boolean isAileyardimi() {
        return aileyardimi;
    }

    public void setAileyardimi(boolean aileyardimi) {
        this.aileyardimi = aileyardimi;
    }

    public boolean isSendikaUy() {
        return sendikaUy;
    }

    public void setSendikaUy(boolean sendikaUy) {
        this.sendikaUy = sendikaUy;
    }

   
    public String getSendika() {
        return sendika;
    }

    public void setSendika(String sendika) {
        this.sendika = sendika;
    }

    public String getYabancidil() {
        return yabancidil;
    }

    public void setYabancidil(String yabancidil) {
        this.yabancidil = yabancidil;
    }

    public String getDilderece() {
        return dilderece;
    }

    public void setDilderece(String dilderece) {
        this.dilderece = dilderece;
    }

    public String getMezuniyet() {
        return mezuniyet;
    }

    public void setMezuniyet(String mezuniyet) {
        this.mezuniyet = mezuniyet;
    }

    public String getMezuniyetBolum() {
        return mezuniyetBolum;
    }

    public void setMezuniyetBolum(String mezuniyetBolum) {
        this.mezuniyetBolum = mezuniyetBolum;
    }

    public String getMemuriyetBaslama() {
        return memuriyetBaslama;
    }

    public void setMemuriyetBaslama(String memuriyetBaslama) {
        this.memuriyetBaslama = memuriyetBaslama;
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
        if (!(object instanceof Malihaklar)) {
            return false;
        }
        Malihaklar other = (Malihaklar) object;
        if ((this.sicil == null && other.sicil != null) || (this.sicil != null && !this.sicil.equals(other.sicil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return sicil+" "+mezuniyet+" "+mezuniyetBolum+" "+derece+" "+kademe+" "+gosterge+" "+ekgosterge+" "
                +memuriyetBaslama+" "+yabancidil;
    }
    
}
