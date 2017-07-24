package model;

public class Main {

    public static void main(String[] args) {
        System.out.println(UserDAO.getInstance().getUser("admin@example.com").toString());
    }
}
