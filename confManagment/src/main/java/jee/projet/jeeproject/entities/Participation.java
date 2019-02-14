/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jee.projet.jeeproject.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author ADADI
 */
@Entity
public class Participation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11, nullable = false, unique = true)
    private int id;

    @ManyToOne
    @JoinColumn(name = "conference_id", nullable = false, insertable = false, updatable = false)
    private Conference conference;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
    private Person person;

    public Participation() {
    }

    public Participation(int id, Conference conference, Person person) {
        this.id = id;
        this.conference = conference;
        this.person = person;
    }

    public Participation(Conference conference, Person person) {
        this.conference = conference;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.id;
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
        final Participation other = (Participation) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Participation{" + "id=" + id + ", conference=" + conference + ", person=" + person + '}';
    }
    
    

}
