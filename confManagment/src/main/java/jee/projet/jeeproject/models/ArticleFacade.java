/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jee.projet.jeeproject.models;

import java.sql.Date;
import java.util.Calendar;
import jee.projet.jeeproject.entities.Article;

/**
 *
 * @author ADADI
 */
public class ArticleFacade extends AbstractFacade<Article>{
    
    public ArticleFacade() {
        super(Article.class);
    }
    
    
    
}
