// Subkelas dari Content untuk konten kuis
public class QuizContent extends Content {
    public QuizContent(String title) { 
        super(title); // Konstruktor memanggil konstruktor Content
    } 

    public void display() {
        System.out.println("Displaying quiz: " + getTitle());
    }
}

