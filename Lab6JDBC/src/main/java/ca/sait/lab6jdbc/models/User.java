
package ca.sait.lab6jdbc.models;

import java.io.Serializable;

/**
 *
 * @author Madhu
 */
public class User implements Serializable {
    
    private String email;
    private boolean active;
    private String firstName;
    private String lastName;
    private String password;
    private Role role;
    
    public User (){
            
    }    

    public User(String email, boolean active, String firstName, String lastName, String password, Role role) {
        this.email = email;
        this.active = active;
        this.firstName = firstName;
        this.lastName = lastName;
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
        return firstName;
    }

    public String getLastname() {
        return lastName;
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
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    
    
    
    
}
