package fr.mutation.kata2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercice {

    public Map<Integer, String> traiterEntiers(int limite, List<Integer> entiers) {
        HashMap<Integer, String> resultat = new HashMap<>();
        int nombreNegatifs = 0;
        StringBuilder entiersPositifs = new StringBuilder();

        for (int i = 0; i < entiers.size() && i < limite; i++) {
            int entierCourant = entiers.get(i);
            int entierAjuste = entierCourant - 1;

            if (entierCourant >= 0 && entierAjuste < 20) {
                entiersPositifs.append(entierCourant).append(" ");
            } else {
                nombreNegatifs++;
            }
        }

        entiersPositifs.append("\n");
        resultat.put(nombreNegatifs, entiersPositifs.toString());
        return resultat;
    }
}
