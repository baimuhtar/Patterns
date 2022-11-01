package behavioral_patterns.strategy.start;

import behavioral_patterns.strategy.auth.UserChecker;
import behavioral_patterns.strategy.strategy.DBAuth;
import behavioral_patterns.strategy.strategy.FileAuth;

import java.io.File;

public class Start {
    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();

        userChecker.check(new FileAuth(new File("C://Windows//System32")));

        userChecker.check(new DBAuth("https://jdbc.com"));
    }
}
