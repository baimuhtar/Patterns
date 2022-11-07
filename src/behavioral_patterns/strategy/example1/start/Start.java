package behavioral_patterns.strategy.example1.start;

import behavioral_patterns.strategy.example1.auth.UserChecker;
import behavioral_patterns.strategy.example1.strategy.DBAuth;
import behavioral_patterns.strategy.example1.strategy.FileAuth;

import java.io.File;

public class Start {
    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();

        userChecker.check(new FileAuth(new File("C://Windows//System32")));

        userChecker.check(new DBAuth("https://jdbc.com"));
    }
}
