package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetNextStationIfZero() {
        Radio rad = new Radio();

        rad.setNextStation();

        int expectedNextStation = 1;
        int actualNextStation = rad.getNumberStation();

        Assertions.assertEquals(expectedNextStation, actualNextStation);
    }

    @Test
    public void shouldSetNextStationIfMinusOne() {
        Radio rad = new Radio();
        rad.setNumberStation(-1);


        rad.setNextStation();

        int expectedNextStation = 1;
        int actualNextStation = rad.getNumberStation();

        Assertions.assertEquals(expectedNextStation, actualNextStation);
    }

    @Test
    public void shouldSetNextStationIfOne() {
        Radio rad = new Radio();
        rad.setNumberStation(1);

        rad.setNextStation();

        int expectedNextStation = 2;
        int actualNextStation = rad.getNumberStation();

        Assertions.assertEquals(expectedNextStation, actualNextStation);
    }

    @Test
    public void shouldSetNextStationIfEight() {
        Radio rad = new Radio();
        rad.setNumberStation(8);

        rad.setNextStation();

        int expectedNextStation = 9;
        int actualNextStation = rad.getNumberStation();

        Assertions.assertEquals(expectedNextStation, actualNextStation);
    }

    @Test
    public void shouldSetNextStationIfNine() {
        Radio rad = new Radio();
        rad.setNumberStation(9);

        rad.setNextStation();

        int expectedNextStation = 0;
        int actualNextStation = rad.getNumberStation();

        Assertions.assertEquals(expectedNextStation, actualNextStation);
    }

    @Test
    public void shouldSetNextStationIfTen() {
        Radio rad = new Radio();
        rad.setNumberStation(10);

        rad.setNextStation();

        int expectedNextStation = 1;
        int actualNextStation = rad.getNumberStation();

        Assertions.assertEquals(expectedNextStation, actualNextStation);
    }

    @Test
    public void shouldSetPrevStationIfZero() {
        Radio rad = new Radio();

        rad.setPrevStation();

        int expectedPrevStation = 9;
        int actualPrevStation = rad.getNumberStation();

        Assertions.assertEquals(expectedPrevStation, actualPrevStation);
    }

    @Test
    public void shouldSetPrevStationIfEight() {
        Radio rad = new Radio();
        rad.setNumberStation(8);

        rad.setPrevStation();

        int expectedPrevStation = 7;
        int actualPrevStation = rad.getNumberStation();

        Assertions.assertEquals(expectedPrevStation, actualPrevStation);
    }

    @Test
    public void shouldSetPrevStationIfTen() {
        Radio rad = new Radio();
        rad.setNumberStation(10);

        rad.setPrevStation();

        int expectedPrevStation = 9;
        int actualPrevStation = rad.getNumberStation();

        Assertions.assertEquals(expectedPrevStation, actualPrevStation);
    }

    @Test
    public void shouldSetPrevStationIfNine() {
        Radio rad = new Radio();
        rad.setNumberStation(9);

        rad.setPrevStation();

        int expectedPrevStation = 8;
        int actualPrevStation = rad.getNumberStation();

        Assertions.assertEquals(expectedPrevStation, actualPrevStation);
    }

    @Test
    public void shouldSetPrevStationIfOne() {
        Radio rad = new Radio();
        rad.setNumberStation(1);

        rad.setPrevStation();

        int expectedPrevStation = 0;
        int actualPrevStation = rad.getNumberStation();

        Assertions.assertEquals(expectedPrevStation, actualPrevStation);
    }

    @Test
    public void shouldSetPrevStationIfMinusOne() {
        Radio rad = new Radio();
        rad.setNumberStation(-1);

        rad.setPrevStation();

        int expectedPrevStation = 9;
        int actualPrevStation = rad.getNumberStation();

        Assertions.assertEquals(expectedPrevStation, actualPrevStation);
    }

    @Test
    public void shouldNotSetWrongStation() {
        Radio rad = new Radio();

        rad.setNumberStation(15);

        int expectedWrongStation = 0;
        int actualWrongStation = rad.getNumberStation();

        Assertions.assertEquals(expectedWrongStation, actualWrongStation);

    }

    @Test
    public void shouldSetStation() {
        Radio rad = new Radio();

        rad.setNumberStation(7);

        int expected = 7;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfZero() {
        Radio rad = new Radio();

        rad.increaseVolume();

        int expectedIncreaseVolume = 1;
        int actualIncreaseVolume = rad.getVolume();

        Assertions.assertEquals(expectedIncreaseVolume, actualIncreaseVolume);
    }

    @Test
    public void shouldIncreaseVolumeIfMinusOne() {
        Radio rad = new Radio();
        rad.setVolume(-1);

        rad.increaseVolume();

        int expectedIncreaseVolume = 1;
        int actualIncreaseVolume = rad.getVolume();

        Assertions.assertEquals(expectedIncreaseVolume, actualIncreaseVolume);
    }

    @Test
    public void shouldIncreaseVolumeIfOne() {
        Radio rad = new Radio();
        rad.setVolume(1);

        rad.increaseVolume();

        int expectedIncreaseVolume = 2;
        int actualIncreaseVolume = rad.getVolume();

        Assertions.assertEquals(expectedIncreaseVolume, actualIncreaseVolume);
    }

    @Test
    public void shouldIncreaseVolumeIfNintyNine() {
        Radio rad = new Radio();
        rad.setVolume(99);

        rad.increaseVolume();

        int expectedIncreaseVolume = 100;
        int actualIncreaseVolume = rad.getVolume();

        Assertions.assertEquals(expectedIncreaseVolume, actualIncreaseVolume);
    }

    @Test
    public void shouldIncreaseVolumeIfHundred() {
        Radio rad = new Radio();
        rad.setVolume(100);

        rad.increaseVolume();

        int expectedIncreaseVolume = 100;
        int actualIncreaseVolume = rad.getVolume();

        Assertions.assertEquals(expectedIncreaseVolume, actualIncreaseVolume);

    }

    @Test
    public void shouldIncreaseVolumeIfHundredOne() {
        Radio rad = new Radio();
        rad.setVolume(101);

        rad.increaseVolume();

        int expectedIncreaseVolume = 1;
        int actualIncreaseVolume = rad.getVolume();

        Assertions.assertEquals(expectedIncreaseVolume, actualIncreaseVolume);

    }

    @Test
    public void shouldTurnDownVolumeIfZero() {
        Radio rad = new Radio();

        rad.turnDownVolume();

        int expectedTurnDownVolume = 0;
        int actualTurnDownVolume = rad.getVolume();

        Assertions.assertEquals(expectedTurnDownVolume, actualTurnDownVolume);
    }

    @Test
    public void shouldTurnDownVolumeIfNintyNine() {
        Radio rad = new Radio();
        rad.setVolume(99);

        rad.turnDownVolume();

        int expectedTurnDownVolume = 98;
        int actualTurnDownVolume = rad.getVolume();

        Assertions.assertEquals(expectedTurnDownVolume, actualTurnDownVolume);
    }

    @Test
    public void shouldTurnDownVolumeIfHundred() {
        Radio rad = new Radio();
        rad.setVolume(100);

        rad.turnDownVolume();

        int expectedTurnDownVolume = 99;
        int actualTurnDownVolume = rad.getVolume();

        Assertions.assertEquals(expectedTurnDownVolume, actualTurnDownVolume);
    }

    @Test
    public void shouldTurnDownVolumeIfHundredOne() {
        Radio rad = new Radio();
        rad.setVolume(101);

        rad.turnDownVolume();

        int expectedTurnDownVolume = 0;
        int actualTurnDownVolume = rad.getVolume();

        Assertions.assertEquals(expectedTurnDownVolume, actualTurnDownVolume);
    }

    @Test
    public void shouldTurnDownVolumeIfMinusOne() {
        Radio rad = new Radio();
        rad.setVolume(-1);

        rad.turnDownVolume();

        int expectedTurnDownVolume = 0;
        int actualTurnDownVolume = rad.getVolume();

        Assertions.assertEquals(expectedTurnDownVolume, actualTurnDownVolume);
    }

    @Test
    public void shouldTurnDownVolumeIfOne() {
        Radio rad = new Radio();
        rad.setVolume(1);

        rad.turnDownVolume();

        int expectedTurnDownVolume = 0;
        int actualTurnDownVolume = rad.getVolume();

        Assertions.assertEquals(expectedTurnDownVolume, actualTurnDownVolume);
    }

}
