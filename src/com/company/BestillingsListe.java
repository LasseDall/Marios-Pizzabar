package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class BestillingsListe {
    private ArrayList<Bestilling> bestillinger;

    public BestillingsListe(){
        bestillinger=new ArrayList<>();
    }
    public void tilføj(Bestilling bestilling) {
        boolean bestillingTilføjet = false;
        if (bestillinger.size() == 0) {
            bestillinger.add(bestilling);
        } else {
            for (int i = 0; i < bestillinger.size(); i++) {
                if (bestilling.getAfhentning() < bestillinger.get(i).getAfhentning()) {
                    bestillinger.add(i, bestilling);
                    i = bestillinger.size();
                    bestillingTilføjet = true;
                }
            }
            if (!bestillingTilføjet) {
                bestillinger.add(bestilling);
            }
        }
    }

    public void fjern(int nummer){
        boolean bestillingFjernet = false;
        for (int i = 0; i < bestillinger.size(); i++) {
            if (bestillinger.get(i).getOrdreNummer() == nummer) {
                bestillinger.remove(i);
                bestillingFjernet = true;
            }
        }
        if (!bestillingFjernet) {
        System.out.println("kan ikke finde ordre");
        }
    }

    @Override
    public String toString() {
        return String.valueOf(bestillinger);
    }
}
