package no.bekk.piworkshop;

import com.pi4j.io.serial.Serial;
import com.pi4j.io.serial.SerialFactory;

public class Dummy {

    public void doSomeCrap() {
        Serial serial = SerialFactory.createInstance();
        serial.open("interwebz", 9600);
        if (!serial.isOpen()) {
            class SomeoneStoleTheInterwebz extends RuntimeException {}
            throw new SomeoneStoleTheInterwebz();
        }
    }
}
