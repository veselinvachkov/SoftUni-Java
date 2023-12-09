package harpoonDiver.core;

import harpoonDiver.common.ConstantMessages;
import harpoonDiver.models.diver.DeepWaterDiver;
import harpoonDiver.models.diver.Diver;
import harpoonDiver.models.diver.OpenWaterDiver;
import harpoonDiver.models.diver.WreckDiver;
import harpoonDiver.models.divingSite.DivingSite;
import harpoonDiver.models.divingSite.DivingSiteImpl;
import harpoonDiver.repositories.DiverRepository;
import harpoonDiver.repositories.DivingSiteRepository;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static harpoonDiver.common.ConstantMessages.*;
import static harpoonDiver.common.ExceptionMessages.*;

public class ControllerImpl implements Controller{
    private final DiverRepository diverRepository;
    private final DivingSiteRepository divingSiteRepository;

    public ControllerImpl() {
        this.diverRepository = new DiverRepository();
        this.divingSiteRepository = new DivingSiteRepository();
    }

    @Override
    public String addDiver(String kind, String diverName) {
        Diver diver = createDiver(kind, diverName);
        diverRepository.add(diver);
        return String.format(DIVER_ADDED, kind, diverName);
    }
    private Diver createDiver(String kind, String diverName) {
        switch (kind.toLowerCase()) {
            case "openwaterdiver":
                return new OpenWaterDiver(diverName);
            case "deepwaterdiver":
                return new DeepWaterDiver(diverName);
            case "wreckdiver":
                return new WreckDiver(diverName);
            default:
                throw new IllegalArgumentException(DIVER_INVALID_KIND);
        }
    }

    @Override
    public String addDivingSite(String siteName, String... seaCreatures) {
        DivingSite divingSite = new DivingSiteImpl(siteName);
        divingSite.getSeaCreatures().addAll(List.of(seaCreatures));
        divingSiteRepository.add(divingSite);
        return String.format(DIVING_SITE_ADDED, siteName);
    }

    @Override
    public String removeDiver(String diverName) {
        Diver diverToRemove = diverRepository.byName(diverName);
        if (diverToRemove == null) {
            throw new IllegalArgumentException(String.format(DIVER_DOES_NOT_EXIST, diverName));
        }
        diverRepository.remove(diverToRemove);
        return String.format(DIVER_REMOVE, diverName);
    }

    @Override
    public String startDiving(String siteName) {
        Collection<Diver> suitableDivers = getSuitableDivers();
        if (suitableDivers.isEmpty()) {
            throw new IllegalArgumentException(SITE_DIVERS_DOES_NOT_EXISTS);
        }

        DivingSite divingSite = (DivingSite) divingSiteRepository.byName(siteName);

        int removedDiverCount = dive(suitableDivers, divingSite);
        return String.format(SITE_DIVING, siteName, removedDiverCount);
    }

    private Collection<Diver> getSuitableDivers() {
        return diverRepository.getCollection().stream()
                .filter(Diver::canDive)
                .collect(Collectors.toList());
    }
    private int dive(Collection<Diver> divers, DivingSite divingSite) {
        int removedDiverCount = 0;
        for (Diver diver : divers) {
            diver.shoot();
            divingSite.getSeaCreatures().addAll(diver.getSeaCatch().getSeaCreatures());
            diver.getSeaCatch().getSeaCreatures().clear();
            if (diver.getOxygen() == 0) {
                diverRepository.remove(diver);
                removedDiverCount++;
            }
        }
        return removedDiverCount;
    }

    @Override
    public String getStatistics() {
        StringBuilder result = new StringBuilder();
        Collection<DivingSite> divingSites = divingSiteRepository.getCollection();
        result.append(String.format(ConstantMessages.FINAL_DIVING_SITES, divingSites.size())).append("\n");

        for (DivingSite divingSite : divingSites) {
            result.append(String.format(ConstantMessages.SITE_DIVING, divingSite.getName(), 0)).append("\n");
        }

        result.append(ConstantMessages.FINAL_DIVERS_STATISTICS).append("\n");

        for (Diver diver : diverRepository.getCollection()) {
            result.append(String.format(ConstantMessages.FINAL_DIVER_NAME, diver.getName())).append("\n");
            result.append(String.format(ConstantMessages.FINAL_DIVER_OXYGEN, diver.getOxygen())).append("\n");
            Collection<String> seaCreatures = diver.getSeaCatch().getSeaCreatures();
            result.append(String.format(ConstantMessages.FINAL_DIVER_CATCH, getSeaCreaturesString(seaCreatures))).append("\n");
        }

        return result.toString();
    }
    private String getSeaCreaturesString(Collection<String> seaCreatures) {
        return seaCreatures.isEmpty() ? "None" : String.join(ConstantMessages.FINAL_DIVER_CATCH_DELIMITER, seaCreatures);
    }


}
