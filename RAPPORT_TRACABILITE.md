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
| **US4** | Menu Initial | `DifficultyTest` | `testNormalModeConfiguration` | OK |
| **US5** | Coûts des tours | `MissileTowerTest` | `testBlackHoleTowerStats`, `testSunTowerStats` | OK |
| **US6** | Victoire finale | `GameProgressionTest` | `testLevelProgression` | OK |

## Détails des User Stories

### US1 : Tour Missile
- **Description** : En tant que joueur, je souhaite ajouter une nouvelle tour peu chère le Missile (coût = 60). Initialement prévue avec une portée de 20, celle-ci a été augmentée à 100 pour une meilleure efficacité.
- **Implémentation** : Classe `Missile.java`, `MissileEffect.java`, méthodes `placeMissiles()` et `draw()` dans `Game.java`. Visualisation dans le menu ajoutée.

### US2 : Niveaux de Difficulté
- **Description** : En tant que joueur, je souhaite avoir 3 modes : EASY (400 pièces / 20 vies / 250 kills), NORMAL (200 pièces / 10 vies / 500 kills), HARD (100 pièces / 5 vies / 1000 kills).
- **Implémentation** : Enum `GameDifficulty.java`, classe `GameProfile.java`, initialisation dans `Game.doSetupStuff()`.

### US3 : Progression au Niveau 2
- **Description** : En tant que joueur, lorsque le 1er niveau est terminé, les compteurs sont remis à zéro et le niveau 2 commence avec un nouveau chemin et un nouvel ennemi.
- **Implémentation** : Méthode `startLevel2()` dans `Game.java`. Réinitialisation de `killsCounter`, nettoyage des listes d'ennemis et effets, rechargement de `PathPoints`.

### US4 : Menu de sélection de difficulté
- **Description** : En tant que joueur, je souhaite pouvoir choisir ma difficulté au lancement du jeu via un menu.
- **Implémentation** : `JOptionPane.showOptionDialog` ajouté dans `doSetupStuff()`.

### US5 : Correction des coûts et affichage
- **Description** : Les coûts des tours doivent être : 100 pour BlackHole, 300 pour Sun, et 60 pour Missile. L'affichage doit être aligné.
- **Implémentation** : Mise à jour des classes `BlackHole`, `Sun`, `Missile` et de la méthode `draw()` dans `Game.java`.

### US6 : Fin de jeu (Victoire)
- **Description** : Le jeu doit afficher un message de victoire après avoir terminé le niveau 2.
- **Implémentation** : Logique de victoire dans `doUpdateTasks()` et affichage "You Win!!!" dans `draw()`.

## Exécution des tests
Les tests ont été migrés vers **JUnit 4** pour plus de simplicité. Ils valident les exigences métier et assurent la non-régression sur les fonctionnalités critiques.
