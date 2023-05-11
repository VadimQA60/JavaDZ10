package ru.netology;

public class Radio {
    private int inTotalStation = 10;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int radioStation = minRadioStation;


    public Radio(int inTotalStation) {
        this.inTotalStation = inTotalStation;
        this.maxRadioStation = this.inTotalStation - 1;

    }

    public Radio() {
    }


    private int sound;

    public int getInTotalStation() {
        return inTotalStation;
    }


    public int getRadioStation() {
        return radioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public Radio(int minRadioStation, int maxRadioStation){
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
    }

    public int getSound() {
        return sound;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {
            return;
        }
        if (newRadioStation > maxRadioStation) {
            return;
        }
        radioStation = newRadioStation;
    }

    public void nextRadioStation() {
        if (radioStation == maxRadioStation) {
            setRadioStation(0);
        } else {
            radioStation++;
        }
    }

    public void prevRadioStation() {
        if (radioStation == 0) {
            setRadioStation(9);
        } else {
            radioStation--;
        }
    }

    public void setSound(int newSound) {
        if (newSound < 0) {
            return;
        }
        if (newSound > 100) {
            return;
        }
        sound = newSound;
    }

    public void plusSound() {
        if (sound >= 100) {
            setSound(100);
        } else {
            sound++;
        }
    }

    public void minusSound() {
        if (sound <= 0) {
            setSound(0);
        } else {
            sound--;
        }
    }


}
