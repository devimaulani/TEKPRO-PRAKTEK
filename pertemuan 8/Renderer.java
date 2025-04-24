// Interface generic untuk merender konten
public interface Renderer<T extends Content> {
    void renderContent(T content); // Method abstrak
}