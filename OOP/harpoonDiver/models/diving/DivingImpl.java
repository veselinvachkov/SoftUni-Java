package harpoonDiver.models.diving;

import harpoonDiver.models.diver.Diver;
import harpoonDiver.models.divingSite.DivingSite;

import java.util.Collection;

class DivingImpl implements Diving {
    @Override
    public void searching(DivingSite divingSite, Collection<Diver> divers) {
        for (Diver diver : divers) {
            diveAndSearch(diver, divingSite);
        }
    }

    private void diveAndSearch(Diver diver, DivingSite divingSite) {
        while (diver.canDive() && !divingSite.getSeaCreatures().isEmpty()) {
            shootAndCollect(diver, divingSite);
        }
    }

    private void shootAndCollect(Diver diver, DivingSite divingSite) {
        diver.shoot();
        String seaCreature = divingSite.getSeaCreatures().iterator().next();
        diver.getSeaCatch().getSeaCreatures().add(seaCreature);
        divingSite.getSeaCreatures().remove(seaCreature);
    }
}
