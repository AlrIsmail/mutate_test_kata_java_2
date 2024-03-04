package fr.mutation.kata2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExerciceTests {

    @Test
    public void listeVide_RetourneUneMapAvecZeroEtUnSautDeLigne() {
        // Given
        final Exercice exercice = new Exercice();
        final List<Integer> listeVide = new ArrayList<>();

        // When
        Map<Integer, String> actuel = exercice.traiterEntiers(1, listeVide);

        // Then
        Entry<Integer, String> reultat = actuel.entrySet().iterator().next();

        // Assert
        Assertions.assertThat(reultat.getKey()).isZero();
        Assertions.assertThat(reultat.getValue()).isEqualTo("\n");
    }

    @Test
    public void listeAvecUnSeulNombrePositif_RetourneUneMapAvecZeroEtUnSautDeLigne() {
        // Given
        final Exercice exercice = new Exercice();
        final List<Integer> listeAvecUnSeulNombrePositif = Arrays.asList(1);

        // When
        Map<Integer, String> actuel = exercice.traiterEntiers(1, listeAvecUnSeulNombrePositif);

        // Then
        Entry<Integer, String> resultat = actuel.entrySet().iterator().next();

        // Assert
        Assertions.assertThat(resultat.getKey()).isZero();
        Assertions.assertThat(resultat.getValue()).isEqualTo("1 \n");
    }

    @Test
    public void listeAvecUnSeulNombreNegatif_RetourneUneMapAvecUnEtUnSautDeLigne() {
        // Given
        final Exercice exercice = new Exercice();
        final List<Integer> listeAvecUnSeulNombreNegatif = Arrays.asList(-1);

        // When
        Map<Integer, String> actuel = exercice.traiterEntiers(1, listeAvecUnSeulNombreNegatif);

        // Then
        Entry<Integer, String> resultat = actuel.entrySet().iterator().next();

        // Assert
        Assertions.assertThat(resultat.getKey()).isEqualTo(1);
        Assertions.assertThat(resultat.getValue()).isEqualTo("\n");
    }

    @Test
    public void listeAvecDesValeursHorsRangeEtMax_RetourneUneMapAvecLeNombrePositifNullEtUnSautDeLigne() {
        // Given
        final Exercice exercice = new Exercice();
        final List<Integer> entiers = Arrays.asList(0, 9, 8, -8, -9, 20, 21, 5);

        // When
        Map<Integer, String> actuel = exercice.traiterEntiers(7, entiers);

        // Then
        Entry<Integer, String> resultat = actuel.entrySet().iterator().next();

        // Assert
        Assertions.assertThat(resultat.getKey()).isEqualTo(3);
        Assertions.assertThat(resultat.getValue()).isEqualTo("0 9 8 20 \n");
    }
}
