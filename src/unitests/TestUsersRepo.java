package unitests;

import db.CredentialsEntry;
import db.UsersRepo;

import java.sql.SQLException;

public class TestUsersRepo {

    public static void main(String[] args) throws SQLException {
//        testChangeUser();
        testFindUser();

    }

    public static void testChangeUser() throws SQLException {

        CredentialsEntry entry;
        entry = UsersRepo.findUser("l2", "p2");

        System.out.println(entry);

        int row = UsersRepo.changeNickname("l1","nickname758");
        entry = UsersRepo.findUser("l1", "p1");
        System.out.println(entry);

        UsersRepo.changeNickname("l1","nickname4255");
        entry = UsersRepo.findUser("l1", "p1");
        System.out.println(entry);
    }

    public static void testFindUser() throws SQLException {
        CredentialsEntry entry1 = UsersRepo.findUser("l1", "p1");
        System.out.println(entry1);
//        CredentialsEntry entry2 = repo.findUser("l1", "p2");

    }

}
