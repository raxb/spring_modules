package learn.spring.beans.primary;

import learn.spring.beans.Record;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("paper")
public class Paper implements Record {
    @Override
    public void read() {
        System.out.println("Reading Paper...");
    }
}
