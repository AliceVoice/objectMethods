public class Book {
    private String title;
    private int year;
    private Author author;

    public Book(String title, int year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Название: " + title + ". Год издательства: " + year + " " + author.toString();
    }

    public boolean equals(Object other) {
        if (getClass() != other.getClass()) {
            return false;
        }
        Book swanLake = (Book) other;
        return title.equals(swanLake.title);
    }

    public int hashCode() {
        return java.util.Objects.hash(title);
    }
}

