package com.javaacademy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
public enum GarbageType {
    PAPER("Бумага"), GLASS("Стекло"), MIXED("Смешанный мусор");

    @NonNull
    @Getter
    private final String value;
}
