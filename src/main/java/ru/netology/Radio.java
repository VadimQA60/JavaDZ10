package ru.netology;

public class Radio {
    private int radioStation;
    private int sound;

    public int getRadioStation() {
        return radioStation;
    }

    public int getSound() {
        return sound;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {
            return;
        }
        if (newRadioStation > 9) {
            return;
        }
        radioStation = newRadioStation;
    }

    public void nextRadioStation() {
        if (radioStation == 9) {
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
