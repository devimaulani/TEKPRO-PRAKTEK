// Kelas abstrak dasar untuk semua konten
public abstract class Content {
    protected String title; // Judul konten

    // Konstruktor untuk menginisialisasi judul
    public Content(String title) { 
        this.title = title; 
    }

    // Getter untuk mengambil judul
    public String getTitle() { 
        return title; 
    }

    // Setter untuk mengubah judul
    public void setTitle(String title) { 
        this.title = title; 
    }
}