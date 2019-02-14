/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jee.projet.jeeproject.models;

import jee.projet.jeeproject.entities.Conference;

/**
 *
 * @author ADADI
 */
public class ConferenceFacade extends AbstractFacade<Conference>{
    
    public ConferenceFacade( ) {
        super(Conference.class);
    }
    
}
