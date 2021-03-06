package Pojo;
// Generated Mar 22, 2015 7:46:58 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Group generated by hbm2java
 */
public class Group  implements java.io.Serializable {


     private Integer idGroup;
     private String name;
     private String description;
     private int isActive;
     private Set users = new HashSet(0);
     private Set courses = new HashSet(0);
     private Set trainees = new HashSet(0);

    public Group() {
    }

	
    public Group(String name, String description, int isActive) {
        this.name = name;
        this.description = description;
        this.isActive = isActive;
    }
    public Group(String name, String description, int isActive, Set users, Set courses, Set trainees) {
       this.name = name;
       this.description = description;
       this.isActive = isActive;
       this.users = users;
       this.courses = courses;
       this.trainees = trainees;
    }
   
    public Integer getIdGroup() {
        return this.idGroup;
    }
    
    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public int getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }
    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }
    public Set getCourses() {
        return this.courses;
    }
    
    public void setCourses(Set courses) {
        this.courses = courses;
    }
    public Set getTrainees() {
        return this.trainees;
    }
    
    public void setTrainees(Set trainees) {
        this.trainees = trainees;
    }




}


