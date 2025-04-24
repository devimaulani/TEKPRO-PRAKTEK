// Kelas untuk merender berbagai konten menggunakan wildcard upper bound
public class ContentRenderer {
    public void render(Module<? extends Content> module) {
        System.out.println("Rendering: " + module.getContent().getTitle());
    }
}