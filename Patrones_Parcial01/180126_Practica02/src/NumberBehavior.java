import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberBehavior implements ValidateBehavior{
    @Override
    public boolean validate(String value) {
        if (value == null) {
            return false;
        }
        Pattern pattern = Pattern.compile("^[0-9]+$");
        Matcher matcher = pattern.matcher(value);

        return matcher.matches();
    }
}
