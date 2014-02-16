/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.graph;

import Factories.SensorFactory;
import graph.object.SensorGas;
import java.util.List;
import javax.ejb.EJB;
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
@Path("graph.object.sensorgas")
public class SensorGasFacadeREST extends AbstractFacade<SensorGas> {
    @PersistenceContext(unitName = "factoryEcomation_ServicesPU")
    @EJB SensorFactory sensor;
    private EntityManager em;

    public SensorGasFacadeREST() {
        super(SensorGas.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(SensorGas entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Long id, SensorGas entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public SensorGas find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Produces({"application/xml", "application/json"})
    public SensorGas unoSolo() {
        return  sensor.createSensorGas();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<SensorGas> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
