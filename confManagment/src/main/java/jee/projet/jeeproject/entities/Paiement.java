/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jee.projet.jeeproject.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author ADADI
 */
@Entity
public class Paiement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11, nullable = false, unique = true)
    private int id;

    @Column(name = "bank", length = 100, nullable = false)
    private Date bank;

    @Column(name = "country", length = 50, nullable = false)
    private Date country;

    @OneToMany(mappedBy = "paiement")
    private List<Submission> submissions;

    public Paiement() {
    }

    public Paiement(int id, Date bank, Date country) {
        this.id = id;
        this.bank = bank;
        this.country = country;
    }

    public Paiement(Date bank, Date country) {
        this.bank = bank;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBank() {
        return bank;
    }

    public void setBank(Date bank) {
        this.bank = bank;
    }

    public Date getCountry() {
        return country;
    }

    public void setCountry(Date country) {
        this.country = country;
    }

    public List<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(List<Submission> submissions) {
        this.submissions = submissions;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paiement other = (Paiement) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paiement{" + "id=" + id + ", bank=" + bank + ", country=" + country + ", submissions=" + submissions + '}';
    }
    
    
}
