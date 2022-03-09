package com.leaptraining.bugtracker;

import com.leaptraining.bugtracker.BugTrackerJHipsterApp;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = BugTrackerJHipsterApp.class)
public @interface IntegrationTest {
}
