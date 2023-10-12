package exam01;

public class Ex04 {
    public static void main(String[] args) {

        Book2 book = Book2.builder()
                .title("책1")
                .author("저자1")
                .publisher("출판사1")
                .build();

        System.out.println(book);
    }
}
