package task1;

public interface UserAccount {
    public interface useracc{
        void createAccount(String username, String password, String email);
        void updateAccount(String username, String password, String email);
        void deleteAccount(String username);
    }

}
