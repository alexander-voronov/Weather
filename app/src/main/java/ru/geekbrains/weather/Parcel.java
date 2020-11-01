package ru.geekbrains.weather;

import java.io.Serializable;

public class Parcel implements Serializable {
    public String text;

    private final int imageIndex;
    private final String cityName;

    public int getImageIndex() {
        return imageIndex;
    }

    public String getCityName() {
        return cityName;
    }

    public Parcel(int imageIndex, String cityName) {
        this.imageIndex = imageIndex;
        this.cityName = cityName;
    }
}
