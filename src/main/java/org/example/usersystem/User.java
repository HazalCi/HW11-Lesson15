package org.example.usersystem;

public class User {
    private String username;
    private String email;
    private String password;
    private String role;


    public static class UserBuilder {
        private String username;
        private String email;
        private String password;
        private String role;

        public UserBuilder() {

        }

        public static UserBuilder aUser() {
            return new UserBuilder();
        }

        public UserBuilder withUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder withPassword(String password) {
            this.password = password;
            return this;
        }


        public UserBuilder withRole(String role) {
            this.role = role;
            return this;
        }

        public User build() {
            User user = new User();
            user.username = this.username;
            user.email = this.email;
            user.password = this.password;
            user.role = this.role;
            return user;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "Username= " + username +
                ", Email= " + email +
                ", Password= " + password +
                ", Role= " + role +
                '}';
    }
}
