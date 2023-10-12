package exam01;

public class Ex03 {
    public static void main(String[] args) {

        Book book = Book.builder()
                .title("책1")
                .author("저자1")
                .publisher("출판사1")
                .build();

        System.out.println(book);
    }
}
