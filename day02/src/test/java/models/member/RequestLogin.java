package models.member;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RequestLogin {
    private String userId;
    private String userPw;
}
