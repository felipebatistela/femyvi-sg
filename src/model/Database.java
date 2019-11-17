
package model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="users")
@XmlAccessorType(XmlAccessType.FIELD)
public class Database {
    
    @XmlElement(name = "user")
    private List<User> users;

    public Database(List<User> users) {
        this.users = users;
    }
    
    public Database() {
        this.users = new ArrayList<User>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Database{" + "users=" + users + '}';
    }
    
}
