package ru.netology.radio;

public class Radio {
    public int numberStation;
    public int volume;

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
        else volume = 100;
    }

    public void turnDownVolume() {
        if (volume > 0) {
            volume--;
        }
        else volume = 0;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        volume = newVolume;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation > 9) {
            return;
        }
        if (newNumberStation < 0) {
            return;
        }
        numberStation = newNumberStation;
    }



    public void setNextStation() {
        if (numberStation < 9) {
            numberStation++;
        }
        else numberStation = 0;

    }

    public void setPrevStation() {
        if (numberStation == 0) {
            numberStation = 9;
        }
        else numberStation--;
    }


}
