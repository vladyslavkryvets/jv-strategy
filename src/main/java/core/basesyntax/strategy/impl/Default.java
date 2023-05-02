package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class Default implements DiscountService {
    public double getDiscount() {
        return 0;
    }
}