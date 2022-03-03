
package ca.sait.lab6jdbc.models;

import java.io.Serializable;

/**
 *
 * @author Madhu
 */
public class User implements Serializable {
    
    private String email;
    private boolean active;
    private String firstname;
    private String lastname;
    private String password;
    private Role role;
    
    public User (){
            
    }    

    public User(String email, boolean active, String firstname, String lastname, String password, Role role) {
        this.email = email;
        this.active = active;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return active;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    
    
    
    
}
