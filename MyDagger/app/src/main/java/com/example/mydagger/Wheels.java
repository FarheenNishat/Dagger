package com.example.mydagger;
import javax.inject.Inject;

public class Wheels {

        private Rims rims;
        private Tires tires;

        public Wheels(Rims rims, Tires tires) {
                this.rims = rims;
                this.tires = tires;
        }
}
