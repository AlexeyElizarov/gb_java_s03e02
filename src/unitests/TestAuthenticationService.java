package unitests;

import server.AuthenticationService;

public class TestAuthenticationService {
    public static void main(String[] args) {
        String nickname1 = AuthenticationService.findNicknameByLoginAndPassword("l1", "p1");
        System.out.println(nickname1);
        String nickname2 = AuthenticationService.findNicknameByLoginAndPassword("l1", "p2");
        System.out.println(nickname2);
    }
}
