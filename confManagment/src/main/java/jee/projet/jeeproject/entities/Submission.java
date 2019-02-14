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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author ADADI
 */
@Entity
public class Submission implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "submission_id", length = 11, nullable = false, unique = true)
    private int id;

    @ManyToOne
    @JoinColumn(name = "conference_id", nullable = false, insertable = false, updatable = false)
    private Conference conference;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
    private Author author;

    @OneToOne(fetch = FetchType.LAZY)
    private Reviews reviews;

    @OneToMany(mappedBy = "submission")
    private List<ChairNotes> chairNotes;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
    private Paiement paiement;
    
    @ManyToOne
    @JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
    private Article article;

    private String typePaiement;

    public Submission() {
    }

    public Submission(int id, Conference conference, Author author, Reviews reviews, List<ChairNotes> chairNotes, Paiement paiement, Article article, String typePaiement) {
        this.id = id;
        this.conference = conference;
        this.author = author;
        this.reviews = reviews;
        this.chairNotes = chairNotes;
        this.paiement = paiement;
        this.article = article;
        this.typePaiement = typePaiement;
    }

    public Submission(Conference conference, Author author, Reviews reviews, List<ChairNotes> chairNotes, Paiement paiement, Article article, String typePaiement) {
        this.conference = conference;
        this.author = author;
        this.reviews = reviews;
        this.chairNotes = chairNotes;
        this.paiement = paiement;
        this.article = article;
        this.typePaiement = typePaiement;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Reviews getReviews() {
        return reviews;
    }

    public void setReviews(Reviews reviews) {
        this.reviews = reviews;
    }

    public List<ChairNotes> getChairNotes() {
        return chairNotes;
    }

    public void setChairNotes(List<ChairNotes> chairNotes) {
        this.chairNotes = chairNotes;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getTypePaiement() {
        return typePaiement;
    }

    public void setTypePaiement(String typePaiement) {
        this.typePaiement = typePaiement;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Submission other = (Submission) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Submission{" + "id=" + id + ", conference=" + conference + ", author=" + author + ", reviews=" + reviews + ", chairNotes=" + chairNotes + ", paiement=" + paiement + ", article=" + article + ", typePaiement=" + typePaiement + '}';
    }
    
    

}
