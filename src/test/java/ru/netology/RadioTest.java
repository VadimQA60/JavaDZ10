package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public void radioStationTest() {

        Radio radio1 = new Radio(10);
        Assertions.assertEquals(10, radio1.getInTotalStation());

        Radio radio2 = new Radio(11);
        Assertions.assertEquals(11, radio2.getInTotalStation());


    }

    @Test
    public void setRadioStationTest() {
        Radio radio = new Radio();
        radio.setRadioStation(3);
        int expected = 3;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setRadioStationTestWrong() {
        Radio radio = new Radio();
        radio.setRadioStation(11);
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationTestWrong2() {
        Radio radio = new Radio();
        radio.setRadioStation(-11);
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadiStation() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadiStationOne() {
        Radio radio = new Radio();
        radio.setRadioStation(6);
        radio.nextRadioStation();
        int expected = 7;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void revRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void revRadioStationOne() {
        Radio radio = new Radio();
        radio.setRadioStation(4);
        radio.prevRadioStation();
        int expected = 3;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundTest() {
        Radio radio = new Radio();
        radio.setSound(51);
        int expected = 51;
        int actual = radio.getSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundTestWrong() {
        Radio radio = new Radio();
        radio.setSound(-11);
        int expected = 0;
        int actual = radio.getSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSoundTestWrong2() {
        Radio radio = new Radio();
        radio.setSound(111);
        int expected = 0;
        int actual = radio.getSound();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void plusSoundTest() {
        Radio radio = new Radio();
        radio.setSound(51);
        radio.plusSound();
        int expected = 52;
        int actual = radio.getSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusSoundTestOne() {
        Radio radio = new Radio();
        radio.setSound(100);
        radio.plusSound();
        int expected = 100;
        int actual = radio.getSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusSoundTest() {
        Radio radio = new Radio();
        radio.setSound(75);
        radio.minusSound();
        int expected = 74;
        int actual = radio.getSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusSoundTestOne() {
        Radio radio = new Radio();
        radio.setSound(0);
        radio.minusSound();
        int expected = 0;
        int actual = radio.getSound();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void minMaxTestStation() {
        Radio radio = new Radio(0,9);
        Assertions.assertEquals(0, radio.getMinRadioStation());
        Assertions.assertEquals(9, radio.getMaxRadioStation());
    }

}