# Rapport de Traçabilité - IUT Tower Defense

## Équipe
- **Yassir Boulouiha Gnaoui**
- **Alex Lovin**

## Tableau de Traçabilité

| ID User Story | Titre US | Classe de Test JUnit | Méthodes de Test | Statut |
| :--- | :--- | :--- | :--- | :--- |
| **US1** | Nouvelle Tour Missile | `MissileTowerTest` | `testMissileTowerStats` | OK |
| **US2** | Niveaux de Difficulté | `DifficultyTest` | `testEasyMode`, `testNormalMode`, `testHardMode` | OK |
| **US3** | Progression Niveau 2 | `GameProgressionTest` | `testLevelProgression` | OK |

## Détails des User Stories

### US1 : Tour Missile
- **Description** : En tant que joueur, je souhaite ajouter une nouvelle tour peu chère le Missile (coût = 60) qui va tirer à une distance courte (20).
- **Implémentation** : Classe `Missile.java`, méthodes `placeMissiles()` et `draw()` dans `Game.java`.

### US2 : Niveaux de Difficulté
- **Description** : En tant que joueur, je souhaite avoir 3 modes : EASY (400 pièces / 20 vies / 250 kills), NORMAL (200 pièces / 10 vies / 500 kills), HARD (100 pièces / 5 vies / 1000 kills).
- **Implémentation** : Enum `GameDifficulty.java`, classe `GameProfile.java`, initialisation dans `Game.doSetupStuff()`.

### US3 : Progression au Niveau 2
- **Description** : En tant que joueur, lorsque le 1er niveau est terminé, les compteurs sont remis à zéro et le niveau 2 commence avec un nouveau chemin et un nouvel ennemi.
- **Implémentation** : Méthode `startLevel2()` dans `Game.java`. Réinitialisation de `killsCounter`, nettoyage des listes d'ennemis et effets, rechargement de `PathPoints`.

## Exécution des tests
Les tests ont été migrés vers **JUnit 4** pour plus de simplicité. Ils valident les exigences métier et assurent la non-régression sur les fonctionnalités critiques.
