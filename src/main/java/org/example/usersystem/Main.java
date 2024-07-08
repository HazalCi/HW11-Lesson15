package org.example.usersystem;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = UserManager.getInstance();
        System.out.println("Default Role: " + userManager.getDefaultRole());

        User user = User.UserBuilder.aUser()
                .withUsername("hazalci")
                .withEmail("hazalci@gmail.com")
                .withPassword("abcde")
                .withRole("admin")
                .build();

        System.out.println(user.toString());
    }
}