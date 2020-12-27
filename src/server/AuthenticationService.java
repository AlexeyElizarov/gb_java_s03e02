package server;
import db.CredentialsEntry;
import db.UsersRepo;


public class AuthenticationService {

    public AuthenticationService() {}

    public static String findNicknameByLoginAndPassword(String login, String password) {
        try {
            CredentialsEntry entry = UsersRepo.findUser(login, password);
            return entry.getNickname();
        }
        catch (RuntimeException e) {
            return null;
        }
    }

}
