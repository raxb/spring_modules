package learn.spring.beans.qualifier;

import learn.spring.beans.Sport;
import learn.spring.beans.custom_qualifier.Indoor;
import learn.spring.beans.custom_qualifier.Multiplayer;
import org.springframework.stereotype.Component;

@Component
@Indoor
@Multiplayer
public class Swimming implements Sport {
    @Override
    public void play() {
        System.out.println("Swimming...");
    }
}
