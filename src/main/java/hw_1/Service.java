package hw_1;

import java.io.IOException;

public interface Service {

    public void check(Parameters parameters) throws IOException;

    public void write(Parameters parameters) throws IOException;
}
