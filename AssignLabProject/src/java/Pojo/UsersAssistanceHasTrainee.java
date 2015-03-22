package Pojo;
// Generated Mar 22, 2015 7:46:58 PM by Hibernate Tools 3.6.0



/**
 * UsersAssistanceHasTrainee generated by hbm2java
 */
public class UsersAssistanceHasTrainee  implements java.io.Serializable {


     private UsersAssistanceHasTraineeId id;
     private UsersAssistance usersAssistance;
     private Trainee trainee;
     private Integer timesOfServed;
     private int served;
     private String comment;

    public UsersAssistanceHasTrainee() {
    }

	
    public UsersAssistanceHasTrainee(UsersAssistanceHasTraineeId id, UsersAssistance usersAssistance, Trainee trainee, int served) {
        this.id = id;
        this.usersAssistance = usersAssistance;
        this.trainee = trainee;
        this.served = served;
    }
    public UsersAssistanceHasTrainee(UsersAssistanceHasTraineeId id, UsersAssistance usersAssistance, Trainee trainee, Integer timesOfServed, int served, String comment) {
       this.id = id;
       this.usersAssistance = usersAssistance;
       this.trainee = trainee;
       this.timesOfServed = timesOfServed;
       this.served = served;
       this.comment = comment;
    }
   
    public UsersAssistanceHasTraineeId getId() {
        return this.id;
    }
    
    public void setId(UsersAssistanceHasTraineeId id) {
        this.id = id;
    }
    public UsersAssistance getUsersAssistance() {
        return this.usersAssistance;
    }
    
    public void setUsersAssistance(UsersAssistance usersAssistance) {
        this.usersAssistance = usersAssistance;
    }
    public Trainee getTrainee() {
        return this.trainee;
    }
    
    public void setTrainee(Trainee trainee) {
        this.trainee = trainee;
    }
    public Integer getTimesOfServed() {
        return this.timesOfServed;
    }
    
    public void setTimesOfServed(Integer timesOfServed) {
        this.timesOfServed = timesOfServed;
    }
    public int getServed() {
        return this.served;
    }
    
    public void setServed(int served) {
        this.served = served;
    }
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }




}


