package org.acme;

import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;

import java.util.Timer;
import java.util.TimerTask;


public class FluentBitIntegrationTest {

    private static final Logger log = Logger.getLogger(FluentBitIntegrationTest.class);

    @Test
    public void testLogSendingContinuously() {
	
	log.info("Este es un registro de prueba enviado a Fluent Bit.");
        log.debug("Este es otro registro de prueba enviado a Fluent Bit.");
        log.warn("Este es otro registro de prueba enviado a Fluent Bit.");
        log.error("Este es otro registro de prueba enviado a Fluent Bit.");
	
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                log.info("Este es un registro de prueba enviado a Fluent Bit.");
                log.debug("Este es otro registro de prueba enviado a Fluent Bit.");
                log.warn("Este es otro registro de prueba enviado a Fluent Bit.");
                log.error("Este es otro registro de prueba enviado a Fluent Bit.");
            }
        }, 0, 1000);

        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timer.cancel();
    }
}
