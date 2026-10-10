package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void permissible0To1Station() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void permissibleMin0To1Station() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void permissibleMax0To1Station() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void permissible0To9Station() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void permissibleMin0To9Station() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        Assertions.assertEquals(8, radio.getCurrentStation());
    }


    @Test
    public void permissibleMax0To9Station() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void permissible0To1Volume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void permissibleMin0To1Volume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void permissibleMax0To1Volume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void permissible0To100Volume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void permissibleMin0To100Volume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }


    @Test
    public void permissibleMax0To100Volume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void nextFrom0To1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void nextFrom9To0() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevFrom1To0() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void prevFrom0To9() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void test() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(15);

        Assertions.assertEquals(15, radio.getCurrentStation());

    }

}

