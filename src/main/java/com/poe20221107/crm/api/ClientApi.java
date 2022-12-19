package com.poe20221107.crm.api;

import com.poe20221107.crm.dao.Client;
import com.poe20221107.crm.dao.ClientDAO;
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


@Path("clients")
public class ClientApi {
    
    @GET()
    @Produces(MediaType.APPLICATION_JSON)
    public List<Client> getClients(){
        
        return ClientDAO.findAll();
    }
    
    @GET()
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Client getClient(@PathParam("id") Long id){
        
        return ClientDAO.findById(id);
    }
    
    
    @POST()
    @Consumes(MediaType.APPLICATION_JSON)
    public void createClient(Client client){
        ClientDAO.create(client);
    }
    
    @DELETE()
    @Path("/{id}")
    public void deleteClient(@PathParam("id") Long id){
        ClientDAO.deleteById(id);
    }
    
    @PUT()
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateClient(Client client, @PathParam("id") Long id){
        // TODO : vérifier si id dans URL est identique à id dans body
        
        ClientDAO.update(client);
    }
}