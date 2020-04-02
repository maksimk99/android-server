package com.bstu.android.lab.androidlab.service;

import com.bstu.android.lab.androidlab.model.CarSale;
import com.bstu.android.lab.androidlab.model.Response;

import java.util.ArrayList;
import java.util.List;

public class BaseService {

    public Response generateResponse() {
        return new Response(generateList());
    }

    private List<CarSale> generateList() {
        return new ArrayList<>() {{
            add(new CarSale("1", "Nisan GT-R", "2013г", "130000 km", "3.2 liter", "34000$",
                    "https://4.bp.blogspot.com/-K-djtN_Hz4A/TkpRRYOP4PI/AAAAAAAADeE/47ofMTkpjAM/s1600/2012-Nissan-GT-R-Gray.jpg"));
            add(new CarSale("2", "BMW i8", "2017г", "54000 km", "1.4 liter", "47000$",
                    "https://i.insider.com/5e6fd9dac4854078b45faac6?width=600&format=jpeg&auto=webp"));
            add(new CarSale("3", "Jaguar F-Type", "2012", "150000 km", "3.4 liter", "21000$",
                    "https://ebaymotorsblog.com/motors/blog/wp-content/uploads/2013/02/Jaguar_LA_AUTO_2013__1938-600x400.jpg"));
            add(new CarSale("4", "Lamborghini Aventador", "2013г", "76000 km", "5.2 liter", "120000$",
                    "https://www.hispotion.com/wp-content/uploads/2013/06/lamorghini-sesto-elemento-1-600x400.jpg"));
            add(new CarSale("5", "Mercedes S-class", "2014г", "170000 km", "2.4 liter", "28000$",
                    "https://transfer-service.by/images/transport/mercedes_benz_s_klasse_w222_front.jpg"));
            add(new CarSale("6", "Volkswagen Tiguan", "2017г", "130000 km", "2.2 liter", "25000$",
                    "https://content.autotrader.com/content/dam/autotrader/articles/TopLists/2019/September/BestCompactSUVS/2019-Volkswagen-Tiguan.jpg"));
            add(new CarSale("7", "Toyota Camry", "2015г", "210000 km", "2.4 liter", "17000$",
                    "https://transfer-service.by/images/transport/toyota_camry_front.jpg"));
            add(new CarSale("8", "Audi A6", "2019г", "43000 km", "2.8 liter", "54000$",
                    "https://www.newcartestdrive.com/wp-content/uploads/2019/05/2019_Audi_A6_hero-600x400.jpg"));
            add(new CarSale("9", "Mercedes E-class", "2015г", "140000 km", "2.4 liter", "22000$",
                    "https://www.gkirby.com/wp-content/uploads/2019/05/1-9-600x400.jpg"));
            add(new CarSale("10", "Audi E-tron", "2020г", "2000 km", "0.9 liter", "80000$",
                    "https://parkers-images.bauersecure.com/pagefiles/274680/600x400/____audi-e-tron.jpeg"));
        }};
    }
}
