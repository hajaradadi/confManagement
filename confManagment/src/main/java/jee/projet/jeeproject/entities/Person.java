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
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 *
 * @author ADADI
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "qualification")
public abstract class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11, nullable = false, unique = true)
    private int id;

    @Column(name = "nationId", length = 20, nullable = false)
    private String nationId;

    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @Column(name = "bday")
    private Date bday;

    @Column(name = "status", length = 20, nullable = false)
    private String status;

    @Column(name = "institution", length = 20, nullable = false)
    private String institution;

    @Column(name = "country", length = 50, nullable = false)
    private String country;

    @Column(name = "gender", length = 20, nullable = false)
    private String gender;

    @Column(name = "phoneno", length = 20, nullable = false)
    private String phoneno;

    @Column(name = "email", length = 30, nullable = false)
    private String email;

    @Column(name = "field", length = 20, nullable = false)
    private String field;

    @OneToMany(mappedBy = "person")
    private List<Participation> participation;

    public Person() {
    }

    public Person(int id, String nationId, String name, Date bday, String status, String institution, String country, String gender, String phoneno, String email, String field) {
        this.id = id;
        this.nationId = nationId;
        this.name = name;
        this.bday = bday;
        this.status = status;
        this.institution = institution;
        this.country = country;
        this.gender = gender;
        this.phoneno = phoneno;
        this.email = email;
        this.field = field;
    }

    public Person(String nationId, String name, Date bday, String status, String institution, String country, String gender, String phoneno, String email, String field) {
        this.nationId = nationId;
        this.name = name;
        this.bday = bday;
        this.status = status;
        this.institution = institution;
        this.country = country;
        this.gender = gender;
        this.phoneno = phoneno;
        this.email = email;
        this.field = field;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationId() {
        return nationId;
    }

    public void setNationId(String nationId) {
        this.nationId = nationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBday() {
        return bday;
    }

    public void setBday(Date bday) {
        this.bday = bday;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public List<Participation> getParticipation() {
        return participation;
    }

    public void setParticipation(List<Participation> participation) {
        this.participation = participation;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
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
        final Person other = (Person) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", nationId=" + nationId + ", name=" + name + ", bday=" + bday + ", status=" + status + ", institution=" + institution + ", country=" + country + ", gender=" + gender + ", phoneno=" + phoneno + ", email=" + email + ", field=" + field + ", participation=" + participation + '}';
    }

    
    
}
