package se.kb.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.kb.AIP;

import javax.enterprise.inject.Produces;

public class KbAipFactory {

    Logger log = LoggerFactory.getLogger(getClass());
    private static int idCounter;

    @Produces
    public AIP createAIP() {

        log.info("creating a new AIP");
        final int next = idCounter++;
        return new AIP() {

            private final int id = next;

            @Override
            public int getId() {
                return id;
            }

            @Override
            public String toString() {
                return "AIP nr " +id;
            }
        };
    }
}
