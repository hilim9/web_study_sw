package models.member;

import commons.RequiredValidator;
import commons.Validator;

public class JoinValidator implements Validator<Member>, RequiredValidator {
    @Override
    public void check(Member member) {
        String userId = member.getUserId();
        String userPw = member.getUserPw();
        String confirmUserPw = member.getConfirmUserPw();
        String userNm = member.getUserNm();
        
        /* 필수 항목 검증 S */
        requiredCheck(userId, new BadRequestException("아이디를 입력하세요"));
        requiredCheck(userPw, new BadRequestException("비밀번호를 입력하세요"));
        requiredCheck(confirmUserPw, new BadRequestException("비밀번호를 확인하세요"));
        requiredCheck(userNm, new BadRequestException("회원명을 입력하세요"));
        /* 필수 항목 검증 E */

    }
}
