package models.members;

import lombok.Data;

@Data
public class Member {

    private String userId;

    private String userPw;
    private String confirmUserPw;

    private String userNm;
    private String email;


}
