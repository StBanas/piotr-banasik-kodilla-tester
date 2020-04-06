package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
        double width;
        double haight;
        boolean stamped;

        public Stamp(double width, double haight, boolean stamped) {
                this.width = width;
                this.haight = haight;
                this.stamped = stamped;
        }

        @Override
        public String toString() {
                return "Stamp{" +
                        "width=" + width +
                        ", haight=" + haight +
                        ", stamped=" + stamped +
                        '}';
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Stamp stamp = (Stamp) o;
                return Double.compare(stamp.width, width) == 0 &&
                        Double.compare(stamp.haight, haight) == 0 &&
                        stamped == stamp.stamped;
        }

        @Override
        public int hashCode() {
                return Objects.hash(width, haight, stamped);
        }
}

