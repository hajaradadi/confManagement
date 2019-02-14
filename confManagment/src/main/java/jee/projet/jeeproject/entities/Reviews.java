/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jee.projet.jeeproject.entities;

import java.io.Serializable;
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
public class Reviews implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11, nullable = false, unique = true)
    private int id;
    
    @OneToMany(mappedBy = "reviews")
    private List<Reviwer> reviwers;
    
    
    private boolean review1;

    private boolean review2;

    private boolean review3;

    public Reviews() {
    }

    public Reviews(int id, List<Reviwer> reviwers, boolean review1, boolean review2, boolean review3) {
        this.id = id;
        this.reviwers = reviwers;
        this.review1 = review1;
        this.review2 = review2;
        this.review3 = review3;
    }

    public Reviews(List<Reviwer> reviwers, boolean review1, boolean review2, boolean review3) {
        this.reviwers = reviwers;
        this.review1 = review1;
        this.review2 = review2;
        this.review3 = review3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Reviwer> getReviwers() {
        return reviwers;
    }

    public void setReviwers(List<Reviwer> reviwers) {
        this.reviwers = reviwers;
    }

    public boolean isReview1() {
        return review1;
    }

    public void setReview1(boolean review1) {
        this.review1 = review1;
    }

    public boolean isReview2() {
        return review2;
    }

    public void setReview2(boolean review2) {
        this.review2 = review2;
    }

    public boolean isReview3() {
        return review3;
    }

    public void setReview3(boolean review3) {
        this.review3 = review3;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.id;
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
        final Reviews other = (Reviews) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reviews{" + "id=" + id + ", reviwers=" + reviwers + ", review1=" + review1 + ", review2=" + review2 + ", review3=" + review3 + '}';
    }
    
    
    
}
