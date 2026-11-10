public class Users{

    public enum Role{
        employee,
        manager
    };

    private String name;
    private Role role;

    Users(String name, Role role){
        this.name = name;
        this.role = role;
    }


    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setRole(Role role){
        this.role = role;
    }


    //getters
    public String getName() {
        return name;
    }
    public Role getRole() {
        return role;
    }

    
    
}
