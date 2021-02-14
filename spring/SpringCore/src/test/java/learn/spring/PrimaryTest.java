package learn.spring;

import learn.spring.beans.House;
import learn.spring.beans.Record;
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
@ActiveProfiles("paper")
public class PrimaryTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    Record record;

    @Test
    public void testHouse() {
        House testHouse = new House(record);
        testHouse.constructHouse();
        assertTrue(log.getLog().contains("Constructed House..."));
        assertTrue(log.getLog().contains("Reading Paper..."));
    }
}
