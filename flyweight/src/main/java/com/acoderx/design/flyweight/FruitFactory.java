package com.acoderx.design.flyweight;

import java.util.EnumMap;
import java.util.Map;

/**
 * Description:
 *
 * @author xudi
 * @since 2018-12-04
 */
public class FruitFactory {
    Map<FruitType, Fruit> map = new EnumMap<>(FruitType.class);

    Fruit createFruit(FruitType type) {
        Fruit fruit = map.get(type);
        if (fruit == null) {
            switch (type) {
                case APPLE:
                    fruit = new Apple();
                    map.put(FruitType.APPLE, fruit);
                    break;
                case ORANGE:
                    fruit = new Orange();
                    map.put(FruitType.ORANGE, fruit);
                    break;
            }
        }
        return fruit;
    }
}
