package models.member;

import commons.Validator;

public class Joinservice {

    // 검증에 대한 역할
    // 객체를 설계할 때 하나의 역할만 담당하도록 설계하는것이 좋다
    //JoinValidator validator = new JoinValidator();
    Validator validator;

    public Joinservice(Validator validator) {

        this.validator = validator;
    }

    public void join(Member member) {
        
        validator.check(member);
        
        
        /*String userId = member.getUserId();
        if (userId ==  null || userId.isBlank()) { // userId가 null, 또는 " "(빈 값)일 때
            throw new BadRequestException("아이디를 입력하세요");
        }

        String userPw = member.getUserPw();
        if (userPw ==  null || userPw.isBlank()) { // userId가 null, 또는 " "(빈 값)일 때
            throw new BadRequestException("비밀번호를 입력하세요");
        }*/
    }

}
