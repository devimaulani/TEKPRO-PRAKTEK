// Kelas generic yang menyimpan konten tipe tertentu
public class Module<T extends Content> { 
    private T content; // Konten dari tipe generik yang extend Content

    public Module(T content) { 
        this.content = content; 
    } // Konstruktor

    public T getContent() { 
        return content; 
    } // Getter

    public void setContent(T content) { 
        this.content = content; } 
        // Setter
}
