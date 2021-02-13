package learn.spring.beans.profile;

import learn.spring.beans.Record;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class Books implements Record {

    public void read() {
        System.out.println("Reading Books...");
    }
}
