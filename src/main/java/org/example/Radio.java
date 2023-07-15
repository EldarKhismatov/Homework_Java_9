package org.example;

public class Radio {
    public int numberStation;
    public int currentVolume;


    public void reductionStation(){
        if (numberStation > 9){
            numberStation = numberStation - 1;
        }
    }
    public void increaseStation(){
        if (numberStation < 9){
            numberStation = numberStation + 1;
        }
    }
    public void setNumberStation(int newNumberStation){
        if (newNumberStation < 0){
            return;
        }
        if (newNumberStation > 9){
            return;
        }
        numberStation = newNumberStation;
    }
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void reductionVolume(){
        if (currentVolume > 100){
            currentVolume = currentVolume - 1;
        }
    }
    public void setCurrentVolume(int newCurrentVolume){
        if (newCurrentVolume < 0){
            return;
        }
        if (newCurrentVolume > 100){
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public int getCurrentVolume(){
        return currentVolume;
    }
}
