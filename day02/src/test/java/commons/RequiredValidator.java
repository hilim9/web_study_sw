package commons;

public interface RequiredValidator {
    default void requiredCheck(String str, RuntimeException e) { // RuntimeException e 다형성
        if(str == null || str.isBlank()) {
            throw e;
        }
    }
}
