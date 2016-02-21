package tiscon1.model;

import java.io.Serializable;
import java.security.Principal;

/**
 * @author kawasima
 */
public class UserPrincipal implements Principal, Serializable {
    private String name;
    private Long id;

    public UserPrincipal() {

    }

    public UserPrincipal(String name) {
        this.name = name;
    }

    public UserPrincipal(String name,Long id){
        this(name);
        setId(id);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
