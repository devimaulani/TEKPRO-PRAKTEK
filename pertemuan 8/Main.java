// Main class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek konten video dan kuis
        VideoContent vc = new VideoContent("Java Basics"); //membuat objek 
        QuizContent qc = new QuizContent("OOP Quiz");


        // Membungkus konten ke dalam modul
        Module<VideoContent> videoModule = new Module<>(vc); // generic classes 
        Module<QuizContent> quizModule = new Module<>(qc);

        // Membuat platform dan menambahkan modul
        LearningPlatform platform = new LearningPlatform();
        platform.addModule(videoModule);
        platform.addModule(quizModule);
    
        // Merender modul dengan ContentRenderer
        ContentRenderer renderer = new ContentRenderer();
        renderer.render(videoModule);
        renderer.render(quizModule);

        // Mencatat akses mahasiswa terhadap modul video
        Student student = new Student("Ali");
        AccessRecord<Student, Module<VideoContent>> record = new AccessRecord<>(student, videoModule);
        record.log();

        // Merender konten spesifik dengan renderer tipe spesifik
        Renderer<VideoContent> videoRenderer = new VideoRenderer();
        videoRenderer.renderContent(vc);

        Renderer<QuizContent> quizRenderer = new QuizRenderer();
        quizRenderer.renderContent(qc);
    }
}