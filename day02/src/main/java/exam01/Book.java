package exam01;

public class Book {
    private String title;
    private String author;
    private String publisher;

    private Book() {}

    // builder 패턴
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    static class Builder {
        private Book instance = new Book();

        public Builder title(String title) { // 같은 객체를 반환하면 메서드 체이닝으로 사용가능
            instance.title = title;
            return this;
        }

        public Builder author(String author) {
            instance.author = author;
            return this;
        }

        public Builder publisher(String publisher) {
            instance.publisher = publisher;
            return this;
        }

        public Book build() {
            return instance;
        }
    }
}
