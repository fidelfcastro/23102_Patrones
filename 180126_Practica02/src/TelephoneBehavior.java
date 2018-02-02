import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneBehavior implements ValidateBehavior{
    @Override
    public boolean validate(String value) {
        if (value == null) {
            return false;
        }
        Pattern pattern = Pattern.compile("^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$"); //Esta expresion regular lo saque de StackOverflow
        Matcher matcher = pattern.matcher(value);

        return matcher.matches();
    }
}