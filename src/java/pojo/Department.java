package pojo;
// Generated Mar 21, 2015 12:47:58 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Department generated by hbm2java
 */
public class Department  implements java.io.Serializable {


     private Integer idDepartment;
     private String name;
     private String description;
     private int isActive;
     private Set users = new HashSet(0);
     private Set courses = new HashSet(0);

    public Department() {
    }

	
    public Department(String name, String description, int isActive) {
        this.name = name;
        this.description = description;
        this.isActive = isActive;
    }
    public Department(String name, String description, int isActive, Set users, Set courses) {
       this.name = name;
       this.description = description;
       this.isActive = isActive;
       this.users = users;
       this.courses = courses;
    }
   
    public Integer getIdDepartment() {
        return this.idDepartment;
    }
    
    public void setIdDepartment(Integer idDepartment) {
        this.idDepartment = idDepartment;
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




}


