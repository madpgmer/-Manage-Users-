
package ca.sait.lab6jdbc.models;
import java.io.Serializable;

/**
 *
 * @author Madhu
 */
public class Role implements Serializable{ 
    private int id;
    private String name;

    public Role(){
    
    }

    public Role(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
