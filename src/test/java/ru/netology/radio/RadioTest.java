package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {


    @Test
    public void testConstr() {
        Radio rad = new Radio(20);

        Assertions.assertEquals(0, rad.getMinNumberStation());
        Assertions.assertEquals(19, rad.getMaxNumberStation());
        Assertions.assertEquals(0, rad.getNumberStation());
    }


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
    public void shouldSetNextStationIfMaxMinusOne() {
        Radio rad = new Radio(20);
        rad.setNumberStation(rad.getMaxNumberStation() - 1);

        rad.setNextStation();

        int expectedNextStation = rad.getMaxNumberStation();
        int actualNextStation = rad.getNumberStation();

        Assertions.assertEquals(expectedNextStation, actualNextStation);
    }

    @Test
    public void shouldSetNextStationIfMaxNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(rad.getMaxNumberStation());

        rad.setNextStation();

        int expectedNextStation = 0;
        int actualNextStation = rad.getNumberStation();

        Assertions.assertEquals(expectedNextStation, actualNextStation);
    }

    @Test
    public void shouldSetNextStationIfMaxPlusOne() {
        Radio rad = new Radio();
        rad.setNumberStation(rad.getMaxNumberStation() + 1);

        rad.setNextStation();

        int expectedNextStation = 1;
        int actualNextStation = rad.getNumberStation();

        Assertions.assertEquals(expectedNextStation, actualNextStation);
    }

    @Test
    public void shouldSetPrevStationIfZero() {
        Radio rad = new Radio();

        rad.setPrevStation();

        int expectedPrevStation = rad.getMaxNumberStation();
        int actualPrevStation = rad.getNumberStation();

        Assertions.assertEquals(expectedPrevStation, actualPrevStation);
    }

    @Test
    public void shouldSetPrevStationIfMaxMinusOne() {
        Radio rad = new Radio();
        rad.setNumberStation(rad.getMaxNumberStation() - 1);

        rad.setPrevStation();

        int expectedPrevStation = rad.getMaxNumberStation() - 2;
        int actualPrevStation = rad.getNumberStation();

        Assertions.assertEquals(expectedPrevStation, actualPrevStation);
    }

    @Test
    public void shouldSetPrevStationIfMaxPlusOne() {
        Radio rad = new Radio();
        rad.setNumberStation(rad.getMaxNumberStation() + 1);

        rad.setPrevStation();

        int expectedPrevStation = rad.getMaxNumberStation();
        int actualPrevStation = rad.getNumberStation();

        Assertions.assertEquals(expectedPrevStation, actualPrevStation);
    }

    @Test
    public void shouldSetPrevStationIfMax() {
        Radio rad = new Radio();
        rad.setNumberStation(rad.getMaxNumberStation());

        rad.setPrevStation();

        int expectedPrevStation = rad.getMaxNumberStation() - 1;
        int actualPrevStation = rad.getNumberStation();

        Assertions.assertEquals(expectedPrevStation, actualPrevStation);
    }

    @Test
    public void shouldSetPrevStationIfMinPlusOne() {
        Radio rad = new Radio();
        rad.setNumberStation(rad.getMinNumberStation() + 1);

        rad.setPrevStation();

        int expectedPrevStation = rad.getMinNumberStation();
        int actualPrevStation = rad.getNumberStation();

        Assertions.assertEquals(expectedPrevStation, actualPrevStation);
    }

    @Test
    public void shouldSetPrevStationIfMinMinusOne() {
        Radio rad = new Radio();
        rad.setNumberStation(rad.getMinNumberStation() - 1);

        rad.setPrevStation();

        int expectedPrevStation = rad.getMaxNumberStation();
        int actualPrevStation = rad.getNumberStation();

        Assertions.assertEquals(expectedPrevStation, actualPrevStation);
    }

    @Test
    public void shouldNotSetWrongStation() {
        Radio rad = new Radio();

        rad.setNumberStation(rad.getMaxNumberStation() + 10);

        int expectedWrongStation = rad.getMinNumberStation();
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
    public void shouldIncreaseVolumeIfMin() {
        Radio rad = new Radio();

        rad.increaseVolume();

        int expectedIncreaseVolume = 1;
        int actualIncreaseVolume = rad.getVolume();

        Assertions.assertEquals(expectedIncreaseVolume, actualIncreaseVolume);
    }

    @Test
    public void shouldIncreaseVolumeIfMinMinusOne() {
        Radio rad = new Radio();
        rad.setVolume(rad.getMinVolume() - 1);

        rad.increaseVolume();

        int expectedIncreaseVolume = rad.getMinVolume() + 1;
        int actualIncreaseVolume = rad.getVolume();

        Assertions.assertEquals(expectedIncreaseVolume, actualIncreaseVolume);
    }

    @Test
    public void shouldIncreaseVolumeIfMinPlusOne() {
        Radio rad = new Radio();
        rad.setVolume(rad.getMinVolume() + 1);

        rad.increaseVolume();

        int expectedIncreaseVolume = rad.getMinVolume() + 2;
        int actualIncreaseVolume = rad.getVolume();

        Assertions.assertEquals(expectedIncreaseVolume, actualIncreaseVolume);
    }

    @Test
    public void shouldIncreaseVolumeIfMaxMinusOne() {
        Radio rad = new Radio();
        rad.setVolume(rad.getMaxVolume() - 1);

        rad.increaseVolume();

        int expectedIncreaseVolume = rad.getMaxVolume();
        int actualIncreaseVolume = rad.getVolume();

        Assertions.assertEquals(expectedIncreaseVolume, actualIncreaseVolume);
    }

    @Test
    public void shouldIncreaseVolumeIfMax() {
        Radio rad = new Radio();
        rad.setVolume(rad.getMaxVolume());

        rad.increaseVolume();

        int expectedIncreaseVolume = rad.getMaxVolume();
        int actualIncreaseVolume = rad.getVolume();

        Assertions.assertEquals(expectedIncreaseVolume, actualIncreaseVolume);

    }

    @Test
    public void shouldIncreaseVolumeIfMaxPlusOne() {
        Radio rad = new Radio();
        rad.setVolume(rad.getMaxVolume() + 1);

        rad.increaseVolume();

        int expectedIncreaseVolume = rad.getMinVolume() + 1;
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
    public void shouldTurnDownVolumeIfMaxMinusOne() {
        Radio rad = new Radio();
        rad.setVolume(rad.getMaxVolume() - 1);

        rad.turnDownVolume();

        int expectedTurnDownVolume = rad.getMaxVolume() - 2;
        int actualTurnDownVolume = rad.getVolume();

        Assertions.assertEquals(expectedTurnDownVolume, actualTurnDownVolume);
    }

    @Test
    public void shouldTurnDownVolumeIfMax() {
        Radio rad = new Radio();
        rad.setVolume(rad.getMaxVolume());

        rad.turnDownVolume();

        int expectedTurnDownVolume = rad.getMaxVolume() - 1;
        int actualTurnDownVolume = rad.getVolume();

        Assertions.assertEquals(expectedTurnDownVolume, actualTurnDownVolume);
    }

    @Test
    public void shouldTurnDownVolumeIfMaxPlusOne() {
        Radio rad = new Radio();
        rad.setVolume(rad.getMaxVolume() + 1);

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
