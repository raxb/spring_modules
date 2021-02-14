package learn.spring;

import learn.spring.beans.Flats;
import learn.spring.config.ApplicationConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
@ActiveProfiles("dev")
public class ConditionalBeanTest {

    @Autowired
    Flats flats;

    @Test
    public void testFlats() {
        assertNotNull(flats);
    }
}
