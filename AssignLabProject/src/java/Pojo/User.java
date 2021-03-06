package Pojo;
// Generated Mar 22, 2015 7:46:58 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer idUser;
     private Department department;
     private String email;
     private String pass;
     private String name;
     private int isActive;
     private Set groups = new HashSet(0);
     private Set notificationses = new HashSet(0);
     private Set userPhoneses = new HashSet(0);

    public User() {
    }

	
    public User(Department department, String email, String pass, String name, int isActive) {
        this.department = department;
        this.email = email;
        this.pass = pass;
        this.name = name;
        this.isActive = isActive;
    }
    public User(Department department, String email, String pass, String name, int isActive, Set groups, Set notificationses, Set userPhoneses) {
       this.department = department;
       this.email = email;
       this.pass = pass;
       this.name = name;
       this.isActive = isActive;
       this.groups = groups;
       this.notificationses = notificationses;
       this.userPhoneses = userPhoneses;
    }
   
    public Integer getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public int getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }
    public Set getGroups() {
        return this.groups;
    }
    
    public void setGroups(Set groups) {
        this.groups = groups;
    }
    public Set getNotificationses() {
        return this.notificationses;
    }
    
    public void setNotificationses(Set notificationses) {
        this.notificationses = notificationses;
    }
    public Set getUserPhoneses() {
        return this.userPhoneses;
    }
    
    public void setUserPhoneses(Set userPhoneses) {
        this.userPhoneses = userPhoneses;
    }




}


