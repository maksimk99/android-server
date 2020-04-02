package com.bstu.android.lab.androidlab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CarSale {
    private String carId;
    private String name;
    private String year;
    private String mileage;
    private String engineCapacity;
    private String price;
    private String imageUrl;
}
