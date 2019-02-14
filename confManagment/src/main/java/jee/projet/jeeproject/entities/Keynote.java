/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jee.projet.jeeproject.entities;

import java.sql.Date;
import javax.persistence.Entity;

/**
 *
 * @author ADADI
 */
@Entity
public class Keynote extends Person {

    public Keynote() {
    }

    public Keynote(int id, String nationId, String name, Date bday, String status, String institution, String country, String gender, String phoneno, String email, String field) {
        super(id, nationId, name, bday, status, institution, country, gender, phoneno, email, field);
    }

    public Keynote(String nationId, String name, Date bday, String status, String institution, String country, String gender, String phoneno, String email, String field) {
        super(nationId, name, bday, status, institution, country, gender, phoneno, email, field);
    }

}
