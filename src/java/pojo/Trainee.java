package pojo;
// Generated Mar 21, 2015 12:47:58 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Trainee generated by hbm2java
 */
public class Trainee  implements java.io.Serializable {


     private Integer idTrainee;
     private User user;
     private int intake;
     private Set usersDeliveries = new HashSet(0);
     private Set usersAssistances = new HashSet(0);
     private Set groups = new HashSet(0);

    public Trainee() {
    }

	
    public Trainee(User user, int intake) {
        this.user = user;
        this.intake = intake;
    }
    public Trainee(User user, int intake, Set usersDeliveries, Set usersAssistances, Set groups) {
       this.user = user;
       this.intake = intake;
       this.usersDeliveries = usersDeliveries;
       this.usersAssistances = usersAssistances;
       this.groups = groups;
    }
   
    public Integer getIdTrainee() {
        return this.idTrainee;
    }
    
    public void setIdTrainee(Integer idTrainee) {
        this.idTrainee = idTrainee;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public int getIntake() {
        return this.intake;
    }
    
    public void setIntake(int intake) {
        this.intake = intake;
    }
    public Set getUsersDeliveries() {
        return this.usersDeliveries;
    }
    
    public void setUsersDeliveries(Set usersDeliveries) {
        this.usersDeliveries = usersDeliveries;
    }
    public Set getUsersAssistances() {
        return this.usersAssistances;
    }
    
    public void setUsersAssistances(Set usersAssistances) {
        this.usersAssistances = usersAssistances;
    }
    public Set getGroups() {
        return this.groups;
    }
    
    public void setGroups(Set groups) {
        this.groups = groups;
    }




}

