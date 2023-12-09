package harpoonDiver.repositories;

import harpoonDiver.models.divingSite.DivingSite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DivingSiteRepository implements Repository {
    private final Collection<DivingSite> sites;

    public DivingSiteRepository() {
        this.sites = new ArrayList<>();
    }

    @Override
    public Collection getCollection() {
        return Collections.unmodifiableCollection(sites);
    }

    @Override
    public void add(Object entity) {
        sites.add((DivingSite) entity);
    }

    @Override
    public boolean remove(Object entity) {
        return sites.remove(entity);
    }

    @Override
    public Object byName(String name) {
        for (DivingSite divingSite : sites) {
            if (divingSite.getName().equals(name)) {
                return divingSite;
            }
        }
        return null;
    }
}

