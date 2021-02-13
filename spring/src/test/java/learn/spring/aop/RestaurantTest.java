package learn.spring.aop;

import learn.spring.config.ApplicationConfiguration;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
@ActiveProfiles("dev")
public class RestaurantTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    @Qualifier("restaurant")
    Restaurant restaurant;

    @Test
    public void feast() {
        restaurant.feast();
        assertTrue(log.getLog().contains("Waiting for feast evaluation..."));
        assertTrue(log.getLog().contains("Fantabolous Feast..."));
    }

    @Test
    public void aroundAdvice() {
        restaurant.around(12345);
        assertTrue(log.getLog().contains("Order 1-1-1..."));
        assertTrue(log.getLog().contains("Order 2-2-2..."));
        assertTrue(log.getLog().contains("Around join point...12345"));
        assertTrue(log.getLog().contains("Order 3-3-3..."));
    }

}