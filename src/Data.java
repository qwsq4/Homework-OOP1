public class Data {
    private static final String VALID_CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

    public static void checkData(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
        if (checkString(login) && checkString(password) && password.equals(confirmPassword)) {
            System.out.println("Данные корректны");
        }
    }

    public static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if (!checkString(login)) {
            throw new WrongLoginException("Логин некорректный");
        }
        if (!checkString(password)) {
            throw new WrongPasswordException("Пароль некорректный");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать");
        }
    }

    private static boolean checkString(String str) {
        if (str.length() > 20) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!VALID_CHARS.contains(String.valueOf(str.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
