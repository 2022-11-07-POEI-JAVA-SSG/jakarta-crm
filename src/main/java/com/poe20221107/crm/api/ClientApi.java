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
import javax.ws.rs.core.Response;


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
    public Client getClient(@PathParam("id") Integer id){
        
        return ClientDAO.findById(id);
    }

    @POST()
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createClient(Client client){
        ClientDAO.create(client);
        // retourner status code HTTP : 201 
        return Response.status(Response.Status.CREATED).entity(client).build();
    }
    
    @DELETE()
    @Path("/{id}")
    public void deleteClient(@PathParam("id") Integer id){
        ClientDAO.deleteById(id);
    }
    
    @PUT()
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateClient(Client client, @PathParam("id") Integer id){
       if(id.equals(client.getId())){        
            ClientDAO.update(client);
            return Response.ok().build();
       } else {
           // retourner status code HTTP : 400           
           return Response.status(Response.Status.BAD_REQUEST).build();
       }
    }
}
