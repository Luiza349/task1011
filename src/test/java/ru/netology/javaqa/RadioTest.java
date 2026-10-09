package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextFrom0To1 () {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void nextFrom9To0 () {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void prevFrom1To0 () {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void prevFrom0To9 () {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation_belowZero_ignored() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStation_aboveNine_ignored() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void VolumeMaxDoesNotChange() {
        Radio radio = new Radio();
        for (int i = 0; i < 100; i++) {
            radio.increaseVolume();
        }
        Assertions.assertEquals(100, radio.getCurrentVolume());

        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void VolumenormalCase() {
        Radio radio = new Radio();
        for (int i = 0; i < 50; i++) {
            radio.increaseVolume();
        }
        radio.decreaseVolume();
       Assertions.assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void VolumeMinDoesNotChange() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getCurrentVolume());

        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}

