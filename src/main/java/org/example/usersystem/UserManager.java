package org.example.usersystem;

public class UserManager {
    private static UserManager instance;
    private String defaultRole;

    private UserManager() {
        this.defaultRole = "user";
    }

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public String getDefaultRole() {
        return defaultRole;
    }

    public void setDefaultRole(String defaultRole) {
        this.defaultRole = defaultRole;
    }
}
