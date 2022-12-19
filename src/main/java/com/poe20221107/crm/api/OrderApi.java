package com.poe20221107.crm.api;

import com.poe20221107.crm.dao.Client;
import com.poe20221107.crm.dao.ClientDAO;
import com.poe20221107.crm.dao.Order;
import com.poe20221107.crm.dao.OrderDAO;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("orders")
public class OrderApi {
    
    @GET()
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order> getOrders(){
        
        return OrderDAO.findAll();
    }
    
    @GET()
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Order getOrder(@PathParam("id") Long id){
        
        return OrderDAO.findById(id);
    }
    
   
    @POST()
    @Consumes(MediaType.APPLICATION_JSON)
    public void createOrdert(Order order){
        OrderDAO.create(order);
    }
    /*
    @DELETE()
    @Path("/{id}")
    public void deleteClient(@PathParam("id") Long id){
        ClientDAO.deleteById(id);
    }
*/    
    @PUT()
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateOrder(Order order, @PathParam("id") Long id){
        // TODO : vérifier si id dans URL est identique à id dans body
        
        OrderDAO.update(order);
    }

}
