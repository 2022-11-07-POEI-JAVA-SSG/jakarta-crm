package com.poe20221107.crm.api;

import com.poe20221107.crm.dao.Client;
import com.poe20221107.crm.dao.ClientDAO;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("clients")
public class CrmApi {
    
    @GET()
    @Produces(MediaType.APPLICATION_JSON)
    public List<Client> getClients(){
        
        return ClientDAO.findAll();
    }
}