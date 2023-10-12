package tests;

import jakarta.servlet.http.HttpServletRequest;
import models.member.BadRequestException;
import models.member.LoginService;
import models.member.RequestLogin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@DisplayName("로그인 기능 테스트")
@ExtendWith(MockitoExtension.class) // 배열이기 떄문에 더 추가 가능 추가 후 애노테이션으로 사용 가능
public class LoginServiceTest {

    public LoginService service;

    @Mock
    private HttpServletRequest request;

    private RequestLogin requestLogin;

    private void updateRequestData(String userId, String userPw) { // 가짜 데이터 생성(스텁)
        given(request.getParameter("userId")).willReturn(userId);
        given(request.getParameter("userPw")).willReturn(userPw);
    }

    @BeforeEach
    void init() {

        service = new LoginService();
        // request = mock(HttpServletRequest.class); // 가짜 객체 생성
        // -> @ExtendWith(MockitoExtension.class)로 추가 했기 때문에 삭제 가능
        requestLogin = RequestLogin.builder() // 초기화시에 Request 데이터 넣어줌
                .userId("user" + System.currentTimeMillis())
                .userPw("123345678")
                .build();
    }
    
    @Test
    @DisplayName("로그인 성공시 예외가 발생하지 않음")
    void loginSuccess() {
        assertDoesNotThrow( () -> {
            updateRequestData(requestLogin.getUserId(), requestLogin.getUserPw());
            service.login(request);
        });
    }

    @Test
    @DisplayName("필수 항목 검증(userId, userPw), 검증 실패시 BadRequestException 발생")
    void requiredFields() {
        assertThrows(BadRequestException.class, () -> {
            updateRequestData(" ", requestLogin.getUserPw());
            service.login(request);
        });
    }

}
