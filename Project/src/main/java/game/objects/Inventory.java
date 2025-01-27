package game.objects;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Object> objects;
    private List<Object> acquired;

    public Inventory() {
        this.objects = new ArrayList<>();
    }

    public List<Object> getAcquired() {
        return acquired;
    }

    public void setAcquired(List<Object> acquired) {
        this.acquired = acquired;
    }

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }
}
