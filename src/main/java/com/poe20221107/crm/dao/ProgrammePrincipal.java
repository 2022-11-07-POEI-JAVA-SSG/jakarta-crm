package com.poe20221107.crm.dao;

import com.poe20221107.crm.business.ClientState;


public class ProgrammePrincipal {
    
    public static void main(String[] args){
        
        
        Client client = new Client("test2", "test2", "test2", "test2",  "test2"
                ,  "test2",  "test2", "test2",  "test2", ClientState.INACTIVE);
        ClientDAO.create(client);
    }
    
}
