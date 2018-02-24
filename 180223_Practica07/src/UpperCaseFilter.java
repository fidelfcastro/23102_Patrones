import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by fidel on 2/23/2018.
 */
public class UpperCaseFilter extends FilterInputStream {
    protected UpperCaseFilter(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int result = in.read();
        if(result ==-1){
            return -1;
        }
        else {
            return Character.toUpperCase((char)result);
        }
    }

}
