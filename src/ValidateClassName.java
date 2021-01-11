import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static final String EMAIL_REGEX = "^[C|A|P][0-9]{4}[G|H|I|K|L|M]$";
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher("C0318G");
        Matcher m1 = pattern.matcher(" M0318G");
        Matcher m2 = pattern.matcher("P0323A");
        System.out.println(matcher.matches());
        System.out.println(m2.matches() + " " + m1.matches());

    }

}
