package org.spring.mvc_imt.service;

import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class IMTService {

    public double calculateBMI(int heightCm, double weightKg) {
        // Преобразуем рост из сантиметров в метры
        double heightMeters = heightCm / 100.0;
        // Вычисляем ИМТ по формуле: вес (кг) / (рост (м) ^ 2)
        double bmi = weightKg / (heightMeters * heightMeters);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        bmi = Double.parseDouble(df.format(bmi).replace(",", "."));
        return bmi;
    }

    public String info(double IMT){
        String info;
        if(IMT < 18.5){
            info = "недостаточная масса тела.";
        }else if (IMT < 25){
            info = "нормальная масса тела.";
        }else if (IMT < 30){
            info = "избыточная масса тела(предожирение).";
        }else {
            info = "ожирение.";
        }

        return "У вас " + info;
    }
}
