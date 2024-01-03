public class ValidadorEmail {

    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";

    public static boolean validar(String email) {
        return email.matches(EMAIL_REGEX);
    }

}
