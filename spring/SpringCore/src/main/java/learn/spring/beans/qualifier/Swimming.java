package learn.spring.beans.qualifier;

import learn.spring.beans.Sport;
import learn.spring.beans.cutom_qualifier.Indoor;
import learn.spring.beans.cutom_qualifier.Multiplayer;
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
