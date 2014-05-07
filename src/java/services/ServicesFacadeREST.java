/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import entities.Services;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author ccastillo
 */
@Stateless
@Path("entities.services")
public class ServicesFacadeREST extends AbstractFacade<Services> {
    @PersistenceContext(unitName = "factoryEcomation_ServicesPU")
    private EntityManager em;

    public ServicesFacadeREST() {
        super(Services.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Services entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Services entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Services find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Services> findAll() {
        return super.findAll();
    }
    
    @GET
    @Path("find/{term}")
    @Produces({"application/xml", "application/json"})
    public List<Services> findByIdServiceNameEntity(@PathParam("term") String term) {
        int id = -1;
        try {
            id = Integer.parseInt(term);
        } catch (NumberFormatException e) {
            //e.printStackTrace();
        }
        List<Services> services = em.createNamedQuery("Services.findByIdServiceNameEntity")
            .setParameter("idService", id)
            .setParameter("term", "%" + term  + "%")
            .getResultList();
        return services;
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Services> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}