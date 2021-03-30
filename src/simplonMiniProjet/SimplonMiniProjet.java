package simplonMiniProjet;

import java.util.Scanner;

public class SimplonMiniProjet {

	static int rowSalle = 8;
	static int countPlaces = 9;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create SalleCinemaOperation. it will create double array of "Char" object.
		SalleCinemaOpertion salleCinemaOpertion = new SalleCinemaOpertion(rowSalle, countPlaces);

		// Create tools objects for reading keyboard.
		Tools tools = new Tools();

		// initial double array with character "-"
		salleCinemaOpertion.initiliseSalleCinema();

		// show content room cinema defined inside double array.
		salleCinemaOpertion.ShowContentSalle();

		// Object for input char from user keyboard.
		Scanner scan = new Scanner(System.in);

		do {

			/*
			 * This reads the input provided by user using keyboard for place Count. Set 0
			 * for exiting program
			 */
			int placeCount;

			do {

				System.out.print(
						"Combien de places voulez vous acheter [ 1 .. " + countPlaces + " ] ? 0 pour quitter: >>> ");

				tools.scanInteger(countPlaces);

				if (!tools.isErrorScanInteger()) {
					placeCount = tools.getScanInteger();
					if (placeCount == 0) {
						System.out.print("Vous venez de quitter le programme");

						System.exit(0);
					} else {
						break;
					}

				} else {

					System.out.println("Erreur. Recommencer svp.");
				}
			} while (true);

			/*
			 * This reads the input provided by user using keyboard for row number. Set 0
			 * for exiting program
			 */
			int row;

			do {

				System.out.print("A quelle rangé voulez vous aller [ 1 .. " + rowSalle + "]  ?  0 pour quitter: >>> ");

				tools.scanInteger(rowSalle);

				if (!tools.isErrorScanInteger()) {
					row = tools.getScanInteger();
					if (row == 0) {
						System.out.print("Vous venez de quitter le programme");
						System.exit(0);
					} else {
						break;
					}

				} else {

					System.out.println("Erreur. Recommencer svp.");
				}
			} while (true);

			System.out.println();

			if (salleCinemaOpertion.AreAvailablePlaces(row, placeCount)) {
				salleCinemaOpertion.setClientChoice(row, placeCount);
				if (placeCount == 1) {
					System.out.println("votre rangé: " + row + " numéro de la place :  "
							+ (salleCinemaOpertion.getFirstPlace() + 1));
				} else {
					System.out.println("votre rangé: " + row + ", numéro des places :  "
							+ (salleCinemaOpertion.getFirstPlace() + 1) + " à "
							+ (salleCinemaOpertion.getFirstPlace() + placeCount));

				}

			} else {
				System.out.println();
				System.out.println(
						"No available places with following choice. row: " + row + " Count places: " + placeCount);
				System.out.println();
			}

			// show content room cinema defined inside double array.
			salleCinemaOpertion.ShowContentSalle();

		} while (true);
	}

}
