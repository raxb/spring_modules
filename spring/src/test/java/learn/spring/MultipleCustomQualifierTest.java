package learn.spring;

import learn.spring.beans.Sport;
import learn.spring.beans.cutom_qualifier.Multiplayer;
import learn.spring.beans.cutom_qualifier.Outdoor;
import learn.spring.config.ApplicationConfiguration;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
@ActiveProfiles("dev")
public class MultipleCustomQualifierTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    @Outdoor
    //@SinglePlayer
    @Multiplayer
    Sport sport;

    @Test
    public void testHouse() {
        sport.play();
        //assertTrue(log.getLog().contains("Wrestling..."));
        assertTrue(log.getLog().contains("Playing Football..."));
    }

}
