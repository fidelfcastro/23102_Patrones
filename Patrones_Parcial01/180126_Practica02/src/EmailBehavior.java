import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailBehavior implements ValidateBehavior{
    @Override
    public boolean validate(String value) {
        if (value == null) {
            return false;
        }
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(value);

        return matcher.matches();
    }
}
