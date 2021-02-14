package learn.spring.beans.qualifier;

import learn.spring.beans.Sport;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("hockeySport")
public class Hockey implements Sport {
    @Override
    public void play() {
        System.out.println("Playing Hockey...");
    }
}
