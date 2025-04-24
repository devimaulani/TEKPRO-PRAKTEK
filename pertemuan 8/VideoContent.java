// Subkelas dari Content untuk konten video
public class VideoContent extends Content {
    public VideoContent(String title) { 
        super(title); // Konstruktor memanggil konstruktor Content
    } 

    public void display() {
        System.out.println("Streaming video: " + getTitle());
    }
}