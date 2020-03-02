package io.binac.designpattern.builder;

public class Product {
    private int mA;
    private int mB;

    private Product(Builder builder) {
        mA = builder.mA;
        mB = builder.mB;
    }

    @Override
    public String toString() {
        return "A: " + mA + "; B: " + mB;
    }

    public static class Builder {
        private int mA;
        private int mB;

        public Builder setA(int a) {
            mA = a;
            return this;
        }

        public Builder setB(int b) {
            mB = b;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
