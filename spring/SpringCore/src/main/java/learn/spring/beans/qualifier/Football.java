package learn.spring.beans.qualifier;

import learn.spring.beans.Sport;
import learn.spring.beans.custom_qualifier.Multiplayer;
import learn.spring.beans.custom_qualifier.Outdoor;
import org.springframework.stereotype.Component;

@Component
@Outdoor
@Multiplayer
public class Football implements Sport {
    @Override
    public void play() {
        System.out.println("Playing Football...");
    }
}
