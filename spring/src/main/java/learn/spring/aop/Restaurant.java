package learn.spring.aop;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("restaurant")
public class Restaurant {

    public void feast() {
        System.out.println("Orders received...");
        System.out.println("Preparing delicacies...");
    }

    public void around(int no_of_rounds) {
        System.out.println("Around join point..." + no_of_rounds);
    }
}
