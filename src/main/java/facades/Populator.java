/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.PersonDTO;
import dtos.RenameMeDTO;
import entities.Person;
import entities.RenameMe;
import javax.persistence.EntityManagerFactory;
import utils.EMF_Creator;

/**
 *
 * @author tha
 */
public class Populator {
    public static void populate(){
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        PersonFacade fe = PersonFacade.getPersonFacade(emf);
        fe.create(new PersonDTO(new Person("Name 1", 1)));
        fe.create(new PersonDTO(new Person("Name 2", 2)));
        fe.create(new PersonDTO(new Person("Name 3", 3)));
        fe.create(new PersonDTO(new Person("Name 4", 4)));
        fe.create(new PersonDTO(new Person("Name 5", 5)));
    }
    
    public static void main(String[] args) {
        populate();
    }
}
