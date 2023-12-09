package harpoonDiver.repositories;

import harpoonDiver.models.diver.Diver;

import java.util.ArrayList;
import java.util.Collection;

public class DiverRepository implements Repository<Diver> {
    private final Collection<Diver> divers;

    public DiverRepository() {
        this.divers = new ArrayList<>();
    }

    @Override
    public Collection<Diver> getCollection() {
        return divers;
    }

    @Override
    public void add(Diver diver) {
        divers.add(diver);
    }

    @Override
    public boolean remove(Diver diver) {
        return divers.remove(diver);
    }

    @Override
    public Diver byName(String name) {
        for (Diver diver : divers) {
            if (diver.getName().equals(name)) {
                return diver;
            }
        }
        return null;
    }
}
