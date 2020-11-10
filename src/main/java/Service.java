import java.io.IOException;

public interface Service {

    public void check(com.company.Parameters parameters) throws IOException;

    public void write(com.company.Parameters parameters) throws IOException;
}
