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
public class Conference implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "conference_id", length = 11, nullable = false, unique = true)
    private int id;

    @Column(name = "title", length = 200, nullable = false)
    private String title;

    @Column(name = "host", length = 20, nullable = false)
    private String host;

    @Column(name = "slot", nullable = false)
    private Date slot;

    @Column(name = "adress", length = 200, nullable = false)
    private String adress;

    @Column(name = "country", length = 50, nullable = false)
    private String country;

    @Column(name = "phoneno", length = 20, nullable = false)
    private String phoneno;

    @Column(name = "email", length = 30, nullable = false)
    private String email;
    
    @OneToMany(mappedBy = "conference")
    private List<Participation> participation;
    
    @OneToMany(mappedBy = "conference")
    private List<Submission> submissions;

    public Conference() {
    }

    public Conference(int id, String title, String host, Date slot, String adress, String country, String phoneno, String email) {
        this.id = id;
        this.title = title;
        this.host = host;
        this.slot = slot;
        this.adress = adress;
        this.country = country;
        this.phoneno = phoneno;
        this.email = email;
    }

    public Conference(String title, String host, Date slot, String adress, String country, String phoneno, String email) {
        this.title = title;
        this.host = host;
        this.slot = slot;
        this.adress = adress;
        this.country = country;
        this.phoneno = phoneno;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Date getSlot() {
        return slot;
    }

    public void setSlot(Date slot) {
        this.slot = slot;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Participation> getParticipation() {
        return participation;
    }

    public void setParticipation(List<Participation> participation) {
        this.participation = participation;
    }

    public List<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(List<Submission> submissions) {
        this.submissions = submissions;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
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
        final Conference other = (Conference) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conference{" + "id=" + id + ", title=" + title + ", host=" + host + ", slot=" + slot + ", adress=" + adress + ", country=" + country + ", phoneno=" + phoneno + ", email=" + email + ", participation=" + participation + ", submissions=" + submissions + '}';
    }
    
    

}
