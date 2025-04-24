// Kelas generic untuk mencatat akses user ke modul
public class AccessRecord<U extends User, M extends Module<?>> {
    private U user; 
    private M module; // (generic)

    public AccessRecord(U user, M module) {
        this.user = user;
        this.module = module;
    }

    public U getUser() { 
        return user; 
    } // Getter

    public void setUser(U user) { 
        this.user = user; 
    } // Setter

    public M getModule() { 
        return module; 
    } // Getter

    public void setModule(M module) { 
        this.module = module; 
    } // Setter

    // Method untuk mencetak log akses
    public void log() {
        System.out.println(user.getName() + " accessed " + module.getContent().getTitle());
    }
}