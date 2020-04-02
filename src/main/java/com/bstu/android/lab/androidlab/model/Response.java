package com.bstu.android.lab.androidlab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Response {
    private List<CarSale> listOfCarSales;
}
