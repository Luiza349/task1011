package ru.netology.javaqa;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public Radio() {
        this.currentStation = 0;
        this.currentVolume = 0;
    }

    // Переключить на следующую станцию (с зацикливанием 9→0)
    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    // Переключить на предыдущую станцию (с зацикливанием 0→9)
    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    // Установить номер станции напрямую (с проверкой диапазона)
    public void setCurrentStation(int station) {
        if (station >= 0 && station <= 9) {
            this.currentStation = station;
        }

    }

    public int getCurrentStation() {
        return currentStation;
    }

    // Увеличить громкость на 1 (не выше 100)
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    // Уменьшить громкость на 1 (не ниже 0)
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
