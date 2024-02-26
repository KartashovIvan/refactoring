package com.javaacademy;

import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * Бутылка
 */
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString(exclude = {"volume", "nestedVolume"})
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bottle {
    final double volume;
    double nestedVolume;
    final String cityProducer;

    public void addLiquid(double liquidVolume) {
        if (liquidVolume > nestedVolume) {
            throw  new RuntimeException("Объем добавляемой жидкости больше чем объем бутылки");
        }
        double newNestedVolume = nestedVolume + liquidVolume;
        if (newNestedVolume > volume) {
            throw  new RuntimeException("Нет места в бутылки, все выливается!");
        }
        setNestedVolume(newNestedVolume);
    }
}
