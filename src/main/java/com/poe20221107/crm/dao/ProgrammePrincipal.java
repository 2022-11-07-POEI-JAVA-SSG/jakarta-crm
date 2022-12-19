package com.poe20221107.crm.dao;

import com.poe20221107.crm.business.ClientState;
import com.poe20221107.crm.business.OrderState;


public class ProgrammePrincipal {
    
    public static void main(String[] args){
        
        
        Client client = new Client("test3", "test3", "test3", "test3",  "test3"
                ,  "test3",  "test3", "test3",  "test3", ClientState.INACTIVE);
        ClientDAO.create(client);
        
        
        
        Order order = new Order("Formation", "Java pour les Nuls", 
                5, 30, OrderState.OPTION, client);
        OrderDAO.create(order);
    }
    
}
