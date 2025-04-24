import java.util.*;

// Kelas platform pembelajaran yang menyimpan daftar modul
public class LearningPlatform {
    private List<Module<?>> modules = new ArrayList<>(); // Daftar modul dengan wildcard

    // Method untuk menambahkan modul ke platform
    public void addModule(Module<?> module) {  
        modules.add(module);
        System.out.println("Module added: " + module.getContent().getTitle());
    }
}