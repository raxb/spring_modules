package learn.spring.config;

import learn.spring.FlatPrerequisiteCondition;
import learn.spring.aop.OnlineReview;
import learn.spring.beans.Flats;
import learn.spring.beans.House;
import learn.spring.beans.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@Import(ParentConfiguration.class)
public class ApplicationConfiguration {

    @Autowired
    Record record;

    @Bean
    public House createHouse() {
        return new House(record);
    }

    @Bean
    @Conditional(FlatPrerequisiteCondition.class)
    public Flats flats() {
        return new Flats();
    }

    @Bean
    public OnlineReview createReview() {
        return new OnlineReview();
    }
}
