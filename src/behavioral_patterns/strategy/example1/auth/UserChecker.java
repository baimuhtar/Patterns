package behavioral_patterns.strategy.example1.auth;

import behavioral_patterns.strategy.example1.strategy.AuthStrategy;

public class UserChecker {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean check(AuthStrategy authStrategy){
        return authStrategy.CheckLogin(name, password);
    }
}
