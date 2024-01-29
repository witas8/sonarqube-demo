package mw.course.sonarqube;

import org.springframework.stereotype.Component;

@Component
public class Printer {

    public boolean printMe() throws InterruptedException {
        System.out.println("Sonarqube is...");
        Thread.sleep(2000);
        System.out.println("...suuuuper!");
        return true;
    }
}
