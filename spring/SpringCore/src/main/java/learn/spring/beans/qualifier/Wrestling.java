package learn.spring.beans.qualifier;

import learn.spring.beans.Sport;
import learn.spring.beans.custom_qualifier.Outdoor;
import learn.spring.beans.custom_qualifier.SinglePlayer;
import org.springframework.stereotype.Component;

@Component
@Outdoor
@SinglePlayer
public class Wrestling implements Sport {
    @Override
    public void play() {
        System.out.println("Wrestling...");
    }
}
