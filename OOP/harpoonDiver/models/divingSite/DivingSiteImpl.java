package harpoonDiver.models.divingSite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import static harpoonDiver.common.ExceptionMessages.SITE_NAME_NULL_OR_EMPTY;

public class DivingSiteImpl implements DivingSite {
    private String name;
    private Collection<String> seaCreatures;

    public DivingSiteImpl(String name) {
        setName(name);
        this.seaCreatures = new HashSet<>();
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(SITE_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Collection<String> getSeaCreatures() {
        return seaCreatures;
    }
}