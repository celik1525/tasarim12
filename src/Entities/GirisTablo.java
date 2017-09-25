/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.awt.Image;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ruhi ÇELİK
 */
@Entity
@Table(name = "girisTablo", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GirisTablo.findAll", query = "SELECT g FROM GirisTablo g")
    , @NamedQuery(name = "GirisTablo.findBySicil", query = "SELECT g FROM GirisTablo g WHERE g.sicil = :sicil")
    , @NamedQuery(name = "GirisTablo.findBySifre", query = "SELECT g FROM GirisTablo g WHERE g.sifre = :sifre")
    , @NamedQuery(name = "GirisTablo.findByYetki", query = "SELECT g FROM GirisTablo g WHERE g.yetki = :yetki")
    , @NamedQuery(name = "GirisTablo.findByImage", query = "SELECT g FROM GirisTablo g WHERE g.image = :image")
    , @NamedQuery(name = "GirisTablo.findByKullaniciAdi", query = "SELECT g FROM GirisTablo g WHERE g.kullaniciAdi = :kullaniciAdi")})
public class GirisTablo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sicil", nullable = false)
    private Integer sicil;
    @Column(name = "sifre", length = 2000000000)
    private String sifre;
    @Column(name = "yetki", length = 2000000000)
    private String yetki;
    @Column(name = "image", length = 2000000000)
    @Lob
    private byte [] image;

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    
    @Column(name = "kullaniciAdi", length = 2000000000)
    private String kullaniciAdi;
//    @OneToOne
//    @Id
//    @Column(name="sicil")
//    private AtamaTablo atamaTablo;
//    @OneToOne
//    @Id
//    @Column(name="sicil")
//    private KimlikTablo kimlikTablo;
//    @OneToOne
//    @Id
//    @Column(name="sicil")
//    private Malihaklar malihaklar;
//    @OneToOne
//    @Id
//    @Column(name="sicil")
//    private Izindurum izindurum;

//    public AtamaTablo getAtamaTablo() {
//        return atamaTablo;
//    }
//
//    public void setAtamaTablo(AtamaTablo atamaTablo) {
//        this.atamaTablo = atamaTablo;
//    }
//
//    public KimlikTablo getKimlikTablo() {
//        return kimlikTablo;
//    }
//
//    public void setKimlikTablo(KimlikTablo kimlikTablo) {
//        this.kimlikTablo = kimlikTablo;
//    }
//
//    public Malihaklar getMalihaklar() {
//        return malihaklar;
//    }
//
//    public void setMalihaklar(Malihaklar malihaklar) {
//        this.malihaklar = malihaklar;
//    }
//
//    public Izindurum getIzindurum() {
//        return izindurum;
//    }
//
//    public void setIzindurum(Izindurum izindurum) {
//        this.izindurum = izindurum;
//    }
//    
//    
    
    
    
    public GirisTablo() {
    }

    public GirisTablo(Integer sicil) {
        this.sicil = sicil;
    }

    public Integer getSicil() {
        return sicil;
    }

    public void setSicil(Integer sicil) {
        this.sicil = sicil;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getYetki() {
        return yetki;
    }

    public void setYetki(String yetki) {
        this.yetki = yetki;
    }

    
    

    

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
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
        if (!(object instanceof GirisTablo)) {
            return false;
        }
        GirisTablo other = (GirisTablo) object;
        if ((this.sicil == null && other.sicil != null) || (this.sicil != null && !this.sicil.equals(other.sicil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return sicil.toString()+" "+kullaniciAdi+" "+ sifre+ image;
    }
    
}
