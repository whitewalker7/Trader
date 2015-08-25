package org.user;

public class Length {
    private double lengthInMetres;

    public Length() {
    }

    public Length(double metre) {
        lengthInMetres = metre;
    }

    public Length(double metre, double centimeter) {
        lengthInMetres = metre + (centimeter / 100);
    }

    Length addLength(Length length) {
        lengthInMetres += length.lengthInMetres;
        if (lengthInMetres < 0)
            throw new NegativeLengthException();
        return new Length(lengthInMetres);
    }

    public double getLengthInMetres() {
        return lengthInMetres;
    }

    @Override
    public boolean equals(Object otherLength) {

    return true;
    }
}
