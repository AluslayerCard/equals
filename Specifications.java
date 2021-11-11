package homework2;

import java.util.Objects;

public abstract class Specifications {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.name = "Alpha";
        car1.powerHorse = "707";
        car1.maxSpeed = "380";

        Car2 car2 = new Car2();
        car2.name = "Jeep";
        car2.powerHorse = "650";
        car2.maxSpeed = "330";

        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car1));

    }

}
class Car1 {
    String name;
    String powerHorse;
    String maxSpeed;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car1)) return false;
        Car1 car1 = (Car1) o;
        return name.equals(car1.name) && powerHorse.equals(car1.powerHorse) && maxSpeed.equals(car1.maxSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, powerHorse, maxSpeed);
    }
}

class Car2 {
    String name;
    String powerHorse;
    String maxSpeed;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car2)) return false;
        Car2 car2 = (Car2) o;
        return name.equals(car2.name) && powerHorse.equals(car2.powerHorse) && maxSpeed.equals(car2.maxSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, powerHorse, maxSpeed);
    }
}
