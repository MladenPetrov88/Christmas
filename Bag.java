package Christmas;

import HealthyHeaven.Salad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bag {
    String color;
    int capacity;
    List<Present> data;

    public  Bag (String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int count () {
        return this.data.size();
    }

    public  void add (Present present) {
        if (this.data.size() < this.capacity) {
            this.data.add(present);
        }
    }

    public boolean remove (String name) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name)) {
                data.remove(i);
                return true;
            }
        }
        return false;
    }

    public Present heaviestPresent () {
        Present present = null;
        double weight = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getWeight() > weight){
                present = data.get(i);
            }
        }
        return present;
    }

    public Present getPresent (String name) {
        Present present = null;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name)) {
                present = data.get(i);
            }
        }
        return present;
    }

    public String report() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s bag contains: ", color)).append(System.lineSeparator());
        this.data.forEach(e -> {
            sb.append(e.toString()).append(System.lineSeparator());
        });
        return sb.toString().trim();
    }
}
