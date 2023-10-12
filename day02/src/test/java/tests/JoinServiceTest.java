package tests;

import models.member.BadRequestException;
import models.member.JoinValidator;
import models.member.Joinservice;
import models.member.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.temporal.ChronoField;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원가입 기능 테스트") // 단위 테스트에 대한 설명
public class JoinServiceTest {
    /*@Test
    void joinSucess() {
        assertDoesNotThrow(new Executable() {
            @Override
            public void execute() throws Throwable {

            }
        });
    }*/
    private Joinservice service;

    private Member getMember() {
        Member member = new Member();
        member.setUserId("user" + System.currentTimeMillis()); // ID중복방지 난수 발생 메서드 사용
        member.setUserNm("사용자");
        member.setUserPw("12345678");
        member.setConfirmUserPw(member.getUserPw());

        return member;
    }

    @BeforeEach 
    void init() { // 각 단위 테스트 메서드 실행 전 객체 생성
        service = new Joinservice(new JoinValidator());
    }

    @Test
    @DisplayName("회원가입 성공시 예외가 발생하지 않음")
    void joinSucess() {
        assertDoesNotThrow(() -> {
            service.join(getMember());
        });
    }

    @Test
    @DisplayName("필수 항목(userId, userPw, confirmUserPw, userNm) 검증, 검증 실패시 BadRequestException 발생")
    void requiredFields() {

        assertAll( // assertAll -> 한번에 테스트 진행 (실패해도 진행됨)
                () -> {

                    // userId가 null, 또는 " "(빈 값)일 때
                    Member member = getMember();
                    member.setUserId(null);
                    requiredFieldEach(member, "아이디");
                    member.setUserId("   ");
                    requiredFieldEach(member, "아이디");
                },
                () -> {

                    // UserPw가 null, 또는 " "(빈 값)일 때
                    Member member = getMember();
                    member.setUserPw(null);
                    requiredFieldEach(member, "비밀번호");
                    member.setUserPw("   ");
                    requiredFieldEach(member, "비밀번호");
                },
                () -> {
                    //System.out.println("다음 테스트 진행"); // 위 코드에서 테스트 실패시 아래 코드는 실행 안됨
                    // ConfirmUserPw가 null, 또는 " "(빈 값)일 때
                    Member member = getMember();
                    member.setConfirmUserPw(null);
                    requiredFieldEach(member, "비밀번호를 확인");
                    member.setConfirmUserPw("   ");
                    requiredFieldEach(member, "비밀번호를 확인");
                },
                () -> {

                    // UserNm가 null, 또는 " "(빈 값)일 때
                    Member member = getMember();
                    member.setUserNm(null);
                    requiredFieldEach(member, "회원명");
                    member.setUserNm("   ");
                    requiredFieldEach(member, "회원명");
                }
            );
    }

        /*// userId가 null, 또는 " "(빈 값)일 때
        // 예외가 발생한 문구 체크
        BadRequestException thrown = assertThrows(BadRequestException.class, () -> {
           Member member = getMember();
           member.setUserId(null);
           service.join(member);

           member.setUserId("    ");
           service.join(member);

        });

        // 예외가 발생한 문구 체크
        // setUserId 부분을 setUserPW(null)로 변경해도 테스트가 통과 되므로 문구를 체크함
        String message = thrown.getMessage();
        //assertEquals("아이디를 입력하세요", message);
        assertTrue(message.contains("아이디"));

        // userPw가 null, 또는 " "(빈 값)일 때
        // 발생한 예외가 반환값으로 나옴
        assertThrows(BadRequestException.class, () -> {
            Member member = getMember();
            member.setUserPw(null);
            service.join(member);

            member.setUserPw("    ");
            service.join(member);

        });*/

    private void requiredFieldEach(Member member, String word){

        BadRequestException thrown = assertThrows(BadRequestException.class, () -> {

            service.join(member);
        });

       assertTrue(thrown.getMessage().contains(word));


    }
}
