package exam01;

import lombok.*;

//@Setter
//@Getter
//@ToString
//@NoArgsConstructor(access = AccessLevel.PRIVATE) -> 생성자를 private으로 사용
//@NoArgsConstructor // 기본 생성자(매개변수X)
//@AllArgsConstructor
//@EqualsAndHashCode
//@RequiredArgsConstructor // 초기화가 반드시 필요한 멤버 변수를 매개변수로 하는 생성자
@Data // @Getter + @Setter + @ToString + @EqualsAndHashCode
public class Member {

    private String userId; // 상수는 직접 값을 입력해 주어야 하기 때문에 생성자에 설정 필요
                                // 상수는 반드시 초기화가 필요

    // @ToString.Exclude // toString 출력시 제거됨
    //@NonNull // 상수가 아닐 때 추가
    private String userPw;
    private String userNm;

    /*public Member(String userId) {
        this.userId = "user01";
    }*/



}
