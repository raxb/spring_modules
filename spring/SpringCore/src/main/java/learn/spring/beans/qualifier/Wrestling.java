package learn.spring.beans.qualifier;

import learn.spring.beans.Sport;
import learn.spring.beans.cutom_qualifier.Outdoor;
import learn.spring.beans.cutom_qualifier.SinglePlayer;
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
