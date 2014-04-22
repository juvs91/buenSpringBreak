/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataBaseManagers;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 *
 * @author usuario
 */
public class Transaction {
    private UserTransaction ux;
    private EntityManager em;
    
    public Transaction(){
    
    }
    public  Object save(Object entity){
        try {
            /*em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();*/
            ux.begin();
            em.persist(entity);
            ux.commit();
        } catch (SystemException | NotSupportedException | RollbackException | HeuristicMixedException | HeuristicRollbackException | SecurityException | IllegalStateException ex) {
            Logger.getLogger(SensorTagFormBl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return entity;
    }
    public Object edit(Object entity){
        return entity;
    }
}
