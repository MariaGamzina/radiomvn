package ru.netology.radio;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Radio {

    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int numberStation = minNumberStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume = minVolume;

    public Radio(int size) {
        maxNumberStation = minNumberStation + size - 1;

    }


    public void setNumberStation(int newNumberStation) {
        if (newNumberStation > maxNumberStation) {
            return;
        }
        if (newNumberStation < minNumberStation) {
            return;
        }
        numberStation = newNumberStation;
    }


    public void setVolume(int newVolume) {
        if (newVolume > maxVolume) {
            return;
        }
        if (newVolume < minVolume) {
            return;
        }
        volume = newVolume;
    }


    public void increaseVolume() {
        if (volume < maxVolume) {
            volume++;
        } else {
            volume = maxVolume;
        }
    }

    public void turnDownVolume() {
        if (volume > minVolume) {
            volume--;
        } else {
            volume = minVolume;
        }
    }


    public void setNextStation() {
        if (numberStation < maxNumberStation) {
            numberStation++;
        } else {
            numberStation = minNumberStation;
        }

    }

    public void setPrevStation() {
        if (numberStation == minNumberStation) {
            numberStation = maxNumberStation;
        } else {
            numberStation--;
        }
    }


}

