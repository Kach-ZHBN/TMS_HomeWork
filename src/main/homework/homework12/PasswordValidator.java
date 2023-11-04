package homework.homework12;

public class PasswordValidator {
    public static boolean isValid(String login, String password, String confirmPassword){
        boolean isValid;
        try {
            if (login.length() == 0 || login.length() >= 20) {
                throw new WrongLoginException("Login length error");
            } else if (login.contains(" ")) {
                throw new WrongLoginException("Login contains spaces");
            } else if (password.length() == 0 || password.length() >= 20) {
                throw new WrongPasswordException("Password length error");
            } else if (password.contains(" ") || !password.matches(".*\\d+.*")) {
                throw new WrongPasswordException("Incorrect password");
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password and confirm password don't match");
            } else{
                isValid = true;
            }
        }catch (WrongPasswordException | WrongLoginException |NullPointerException e){
            e.printStackTrace();
            isValid = false;
        }
        return isValid;
    }
}
