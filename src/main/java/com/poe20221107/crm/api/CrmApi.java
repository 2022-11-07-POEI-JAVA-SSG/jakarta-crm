package com.poe20221107.crm.api;

import com.poe20221107.crm.dao.Client;
import com.poe20221107.crm.dao.ClientDAO;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("clients")
public class CrmApi {
    
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
}
