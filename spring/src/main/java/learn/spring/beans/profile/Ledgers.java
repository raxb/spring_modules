package learn.spring.beans.profile;

import learn.spring.beans.Record;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class Ledgers implements Record {

    public void read() {
        System.out.println("Reading Ledgers...");
    }
}
