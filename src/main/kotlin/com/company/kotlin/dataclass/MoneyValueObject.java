package com.company.kotlin.dataclass;

import java.util.Objects;

public class MoneyValueObject {
    private final int value;

    public MoneyValueObject(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoneyValueObject moneyValueObject = (MoneyValueObject) o;
        return value == moneyValueObject.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}