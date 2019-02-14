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
public class Article implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11, nullable = false, unique = true)
    private int id;

    @Column(name = "title", length = 200, nullable = false)
    private String title;

    @Column(name = "institution", length = 20, nullable = false)
    private String institution;

    @Column(name = "field", length = 20, nullable = false)
    private String field;

    @Column(name = "publication", nullable = false)
    private Date publication;

    @Column(name = "abstarct", nullable = false)
    private String abstarct;

    @Column(name = "filename", nullable = false)
    private String filename;

    @OneToMany(mappedBy = "article")
    private List<Submission> submissions;

    public Article() {
    }

    public Article(String title, String institution, String field, Date publication, String abstarct, String filename) {
        this.title = title;
        this.institution = institution;
        this.field = field;
        this.publication = publication;
        this.abstarct = abstarct;
        this.filename = filename;
    }

    public Article(int id, String title, String institution, String field, Date publication, String abstarct, String filename) {
        this.id = id;
        this.title = title;
        this.institution = institution;
        this.field = field;
        this.publication = publication;
        this.abstarct = abstarct;
        this.filename = filename;
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

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Date getPublication() {
        return publication;
    }

    public void setPublication(Date publication) {
        this.publication = publication;
    }

    public String getAbstarct() {
        return abstarct;
    }

    public void setAbstarct(String abstarct) {
        this.abstarct = abstarct;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public List<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(List<Submission> submissions) {
        this.submissions = submissions;
    }

    @Override
    public String toString() {
        return "Article{" + "id=" + id + ", title=" + title + ", institution=" + institution + ", field=" + field + ", publication=" + publication + ", abstarct=" + abstarct + ", filename=" + filename + ", submissions=" + submissions + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
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
        final Article other = (Article) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
}
