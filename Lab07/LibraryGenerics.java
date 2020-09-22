import java.util.*;

public class LibraryGenerics<M extends Media> {
    private List<M> resources = new ArrayList<>();
    public void addMedia(M x) {
        resources.add(x);
    }
    
    public M retrieveLast() {
        int size = resources.size();
        if (size > 0)
            return resources.get(size - 1);
        return null;
    }
    
    public static void main(String[] args) {
        LibraryGenerics<Media> library = new LibraryGenerics<>();
        library.addMedia(new Book("James Sawyer", "123456"));
        System.out.println(library.retrieveLast());
        library.addMedia(new Video("Lord of the Rings", 150.0));
        System.out.println(library.retrieveLast());
        library.addMedia(new Book("Design Patterns", "1122-98532"));
    }
}

abstract class Media {
    protected String title;
    public Media(String title) {
        this.title = title;
    }
    public abstract String toString();
}

class Book extends Media {
    protected String isbn;
    public Book(String title, String isbn) {
        super(title);
        this.isbn = isbn;
    }
    public String toString() {
        return "Title = " + title + "Isbn = " + isbn;
    }
}

class Video extends Media {
    protected double duration;
    public Video(String title, double duration) {
        super(title);
        this.duration = duration;
    }
    public String toString() {
        return "Title = " + title + "Duration = " + duration;
    }
}
