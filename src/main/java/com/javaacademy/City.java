package com.javaacademy;

import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * Город
 */
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@ToString(exclude = {"peopleCount"})
@FieldDefaults(level = AccessLevel.PRIVATE)
public class City {
    @NonNull
    public final String name;
    @Setter
    public int peopleCount;

    public Garbage[] createGarbage() {
        return new Garbage[] {
            new Garbage(GarbageType.GLASS, 1000, this.name),
            new Garbage(GarbageType.PAPER, 15000, this.name),
            new Garbage(GarbageType.MIXED, 200000, this.name),
        };
    }
}
