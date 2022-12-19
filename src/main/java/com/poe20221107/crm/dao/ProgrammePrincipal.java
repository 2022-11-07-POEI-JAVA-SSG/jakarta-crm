package com.poe20221107.crm.dao;


public class ProgrammePrincipal {
    
    public static void main(String[] args){
        
        
        Client client = new Client("test", "test", "test", "test",  "test",  "test",  "test", 
                 "test",  "test", 1);
        ClientDAO.create(client);
    }
    
}
