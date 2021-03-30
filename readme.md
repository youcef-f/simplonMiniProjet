# Simplon mini projet

Se programme est ecrit java version 1.8. C'est un projet de type **Eclipse java project**.

Le programme invite l'utilisateur à choisir la rangé dans la salle de cinéma et le nombre de places à reserver.


## La Classe SalleCinemaOpertion
Cette classe permet d'effectuer les opérations liées à une salle de cinéma. Elle est instanciée dans la classe principale **SimplonMiniProjet**

les opérations suivantes sont implémentées.

	- protected void initiliseSalleCinema() 

	- protected void ShowContentSalle() 

	- protected void setClientChoice(int row, int placeCount) 

	- protected boolean AreAvailablePlaces(int row, int placeCount) 


- La methode **initiliseSalleCinema** permet d'initialiser le double tableau qui reflète les emplacements de la salle de cinéma suivant la rangé (row) et la position ( column).
- La methmode **ShowContentSalle**" permet d'afficher à l'utilisateur la position occuper **x** et libre **-**
- La methode **setClientChoice** permet de reserver un ou plusieurs emplacements d'un utilsateur.
- La methode **AreAvailablePlaces** permet de vérifier la disponibilité ou non d'emplacments vide.


## La Classe SimplonMiniProjet
Catte classe est la classe principale, qui invite l'utisateur à rentrer la rangé et le nombre d'emplacements à lui reserver. L'utilsateur est restreint aux intervalles de rangé et nombre d'emplacemets maximuin dans sa saisi. Le programme reinvite l'utilisateur à une nouvelle saisi en cas d'erreur.  La sortie du programme est défini par la saisi du nombre **0**



## Example de sortie console
````shell script
  1 2 3 4 5 6 7 8 9 
1 - - - - - - - - - 
2 - - - - - - - - - 
3 - - - - - - - - - 
4 - - - - - - - - - 
5 - - - - - - - - - 
6 - - - - - - - - - 
7 - - - - - - - - - 
8 - - - - - - - - - 

Combien de places voulez vous acheter [ 1 .. 9 ] ? 0 pour quitter: >>> 10
Erreur. Recommencer svp.
Combien de places voulez vous acheter [ 1 .. 9 ] ? 0 pour quitter: >>> 15
Erreur. Recommencer svp.
Combien de places voulez vous acheter [ 1 .. 9 ] ? 0 pour quitter: >>> 8
A quelle rangé voulez vous aller [ 1 .. 8]  ?  0 pour quitter: >>> 8

votre rangé: 8, numéro des places :  1 à 8
  1 2 3 4 5 6 7 8 9 
1 - - - - - - - - - 
2 - - - - - - - - - 
3 - - - - - - - - - 
4 - - - - - - - - - 
5 - - - - - - - - - 
6 - - - - - - - - - 
7 - - - - - - - - - 
8 x x x x x x x x - 

Combien de places voulez vous acheter [ 1 .. 9 ] ? 0 pour quitter: >>> 9
A quelle rangé voulez vous aller [ 1 .. 8]  ?  0 pour quitter: >>> 7

votre rangé: 7, numéro des places :  1 à 9
  1 2 3 4 5 6 7 8 9 
1 - - - - - - - - - 
2 - - - - - - - - - 
3 - - - - - - - - - 
4 - - - - - - - - - 
5 - - - - - - - - - 
6 - - - - - - - - - 
7 x x x x x x x x x 
8 x x x x x x x x - 

Combien de places voulez vous acheter [ 1 .. 9 ] ? 0 pour quitter: >>> 3
A quelle rangé voulez vous aller [ 1 .. 8]  ?  0 pour quitter: >>> 1

votre rangé: 1, numéro des places :  1 à 3
  1 2 3 4 5 6 7 8 9 
1 x x x - - - - - - 
2 - - - - - - - - - 
3 - - - - - - - - - 
4 - - - - - - - - - 
5 - - - - - - - - - 
6 - - - - - - - - - 
7 x x x x x x x x x 
8 x x x x x x x x - 

Combien de places voulez vous acheter [ 1 .. 9 ] ? 0 pour quitter: >>> 1
A quelle rangé voulez vous aller [ 1 .. 8]  ?  0 pour quitter: >>> 1

votre rangé: 1 numéro de la place :  4
  1 2 3 4 5 6 7 8 9 
1 x x x x - - - - - 
2 - - - - - - - - - 
3 - - - - - - - - - 
4 - - - - - - - - - 
5 - - - - - - - - - 
6 - - - - - - - - - 
7 x x x x x x x x x 
8 x x x x x x x x - 

Combien de places voulez vous acheter [ 1 .. 9 ] ? 0 pour quitter: >>> 1
A quelle rangé voulez vous aller [ 1 .. 8]  ?  0 pour quitter: >>> 1

votre rangé: 1 numéro de la place :  5
  1 2 3 4 5 6 7 8 9 
1 x x x x x - - - - 
2 - - - - - - - - - 
3 - - - - - - - - - 
4 - - - - - - - - - 
5 - - - - - - - - - 
6 - - - - - - - - - 
7 x x x x x x x x x 
8 x x x x x x x x - 

Combien de places voulez vous acheter [ 1 .. 9 ] ? 0 pour quitter: >>> 0
Vous venez de quitter le programme
````
