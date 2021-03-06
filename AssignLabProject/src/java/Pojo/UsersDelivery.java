package Pojo;
// Generated Mar 22, 2015 7:46:58 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * UsersDelivery generated by hbm2java
 */
public class UsersDelivery  implements java.io.Serializable {


     private int delilverQueueId;
     private Lab lab;
     private Date toWhenDate;
     private Set usersDeliveryHasTrainees = new HashSet(0);

    public UsersDelivery() {
    }

	
    public UsersDelivery(int delilverQueueId, Lab lab) {
        this.delilverQueueId = delilverQueueId;
        this.lab = lab;
    }
    public UsersDelivery(int delilverQueueId, Lab lab, Date toWhenDate, Set usersDeliveryHasTrainees) {
       this.delilverQueueId = delilverQueueId;
       this.lab = lab;
       this.toWhenDate = toWhenDate;
       this.usersDeliveryHasTrainees = usersDeliveryHasTrainees;
    }
   
    public int getDelilverQueueId() {
        return this.delilverQueueId;
    }
    
    public void setDelilverQueueId(int delilverQueueId) {
        this.delilverQueueId = delilverQueueId;
    }
    public Lab getLab() {
        return this.lab;
    }
    
    public void setLab(Lab lab) {
        this.lab = lab;
    }
    public Date getToWhenDate() {
        return this.toWhenDate;
    }
    
    public void setToWhenDate(Date toWhenDate) {
        this.toWhenDate = toWhenDate;
    }
    public Set getUsersDeliveryHasTrainees() {
        return this.usersDeliveryHasTrainees;
    }
    
    public void setUsersDeliveryHasTrainees(Set usersDeliveryHasTrainees) {
        this.usersDeliveryHasTrainees = usersDeliveryHasTrainees;
    }




}


