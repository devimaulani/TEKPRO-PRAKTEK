// Kelas abstrak untuk user
public abstract class User {
    protected String name; // Nama user

    public User(String name) { 
        this.name = name; 
    } // Konstruktor

    public String getName() { 
        return name; 
    } // Getter

    public void setName(String name) { 
        this.name = name; 
    } // Setter
}
