package com.poe20221107.crm;

import com.poe20221107.crm.business.ClientState;
import com.poe20221107.crm.business.OrderState;
import com.poe20221107.crm.dao.Client;
import com.poe20221107.crm.dao.ClientDAO;
import com.poe20221107.crm.dao.Order;
import com.poe20221107.crm.dao.OrderDAO;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CrmDAOTest {

    @Test
    public void readAllClients(){ 
       
       List<Client> clients = ClientDAO.findAll();
       assertTrue(clients.size() > 0);
    }
    
    @Test
    public void readOneClient(){ 
       
       Client client = ClientDAO.findById(1);
       assertEquals(1, client.getId());
    }

    @Test
    public void createAndDeleteClient(){ 
       
       Client client = new Client("companyName", "firstName", "lastName", "email"
               , "phone", "address", "zipCode", "city", "country", ClientState.ACTIVE);
       ClientDAO.create(client);
       
       System.out.println("id: "+client.getId());
       assertTrue(client.getId() > 0);
       
       //clean
       ClientDAO.delete(client);     
    }
    
    @Test
    public void updateClient(){ 
       
       Client client = new Client("companyName", "firstName", "lastName", "email"
               , "phone", "address", "zipCode", "city", "country", ClientState.ACTIVE);
       ClientDAO.create(client);
       
       assertEquals("companyName", client.getCompanyName());
       
       // update
       client.setCompanyName("new name");
       ClientDAO.update(client);
       
       // assert
       Client updatedClient = ClientDAO.findById(client.getId());
       assertEquals("new name", client.getCompanyName());
       
       // clean
       ClientDAO.delete(client);     
    }
    
    
    @Test
    public void readAllOrders(){ 
       
       List<Order> orders = OrderDAO.findAll();
       assertTrue(orders.size() > 0);
    }

    @Test
    public void readOneOrder(){ 
       
       Order order = OrderDAO.findById(1L);
       assertEquals(1, order.getId());
    }
    

    @Test
    public void createAndDeleteOrder(){ 
       
       Client client = ClientDAO.findById(1);
       
       Order order = new Order("typePresta", "designation", 2, 200, 
               OrderState.OPTION, client);
       
       OrderDAO.create(order);
       
       OrderDAO.findById(order.getId());
       assertEquals(1, order.getClient().getId());
       
       //clean
       OrderDAO.delete(order);     
    }
        
    @Test
    public void updateOrder(){ 
       Client client = ClientDAO.findById(1);
       
       Order order = new Order("typePresta", "designation", 2, 200, 
               OrderState.OPTION, client);
       
       OrderDAO.create(order);
       
       OrderDAO.findById(order.getId());
       assertEquals("typePresta", order.getTypePresta());
       
       order.setTypePresta("type presta UPDATED");
       OrderDAO.update(order);
       
       // assert
       OrderDAO.findById(order.getId());
       assertEquals("type presta UPDATED", order.getTypePresta());
       
       //clean
       OrderDAO.delete(order);     
    }
    
}