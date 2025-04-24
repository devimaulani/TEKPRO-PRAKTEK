// Implementasi renderer untuk konten kuis
public class QuizRenderer implements Renderer<QuizContent> {
    public void renderContent(QuizContent content) {
        System.out.println("Launching quiz: " + content.getTitle());
    }
}