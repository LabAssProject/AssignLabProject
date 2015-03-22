package DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import pojo.*;
import java.util.List;

/**
 *
 * @author sara
 */
public class UserNotificationDAO extends GenericDAO{
    
    public void insertNotification(User sender,List<User> ricever ,String message){
        beginTransaction();
        
        
        for(User u:ricever){
            Notifications usersNotification=new Notifications();
//            usersNotification.setUserByUserSenderId(sender);
//            usersNotification.setUserByUserRecieverId(u);
//            usersNotification.setMessage(message);
//            save(usersNotification);
            
        }
        
    }
    
}
