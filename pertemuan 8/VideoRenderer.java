// Implementasi renderer untuk konten video
public class VideoRenderer implements Renderer<VideoContent> {
    public void renderContent(VideoContent content) {
        System.out.println("Playing video: " + content.getTitle());
    }
}