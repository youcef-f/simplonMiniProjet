package simplonMiniProjet;

public class SalleCinemaOpertion {

	private char[][] salleCinema;
	private int row;
	private int placeCount;
	private int firstPlace;

	public int getFirstPlace() {
		return firstPlace;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getPlaceCount() {
		return placeCount;
	}

	public void setPlaceCount(int placeCount) {
		this.placeCount = placeCount;
	}

	public char[][] getSalleCinema() {
		return salleCinema;
	}

	public SalleCinemaOpertion(int row, int placeCount) {
		super();
		this.row = row;
		this.placeCount = placeCount;
		this.salleCinema = new char[row][placeCount];
		;

	}

	/*
	 * Intialize double array with "-" character.
	 */
	protected void initiliseSalleCinema() {

		for (int i = 0; i < salleCinema.length; i++) {

			// show row header

			for (int j = 0; j < salleCinema[i].length; j++) {

				// initial each places and show places
				salleCinema[i][j] = '-';
			}
		}
	}

	/*
	 * show content room cinema defined inside double array char.
	 */
	protected void ShowContentSalle() {

		System.out.print("  ");

		// show column header1
		for (int j = 0; j < salleCinema[0].length; j++) {
			System.out.print(j + 1 + " ");
		}

		System.out.println();
		for (int i = 0; i < salleCinema.length; i++) {

			// show row header
			System.out.print(i + 1 + " ");
			for (int j = 0; j < salleCinema[i].length; j++) {

				System.out.print(salleCinema[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

	}

	/*
	 * Set "x" character in place "-" character following the user choice.
	 * firstPlace variable indicates the first available position in row.
	 */
	protected void setClientChoice(int row, int placeCount) {
		// int firstplace ;
		int placeCountAvailable = 0;
		boolean firstPlaceBool = false;
		for (int j = 0; j < salleCinema[row - 1].length; j++) {

			// initial each places and show places
			if (salleCinema[row - 1][j] == '-') {

				if (!firstPlaceBool) {
					firstPlace = j;
					firstPlaceBool = true;
				}
				salleCinema[row - 1][j] = 'x';
				placeCountAvailable++;

				if (placeCountAvailable == placeCount) {
					return;
				}
			}

		}
	}

	/*
	 * Check if there are available places depending user choice.
	 */
	protected boolean AreAvailablePlaces(int row, int placeCount) {
		int placeCountAvailable = 0;

		for (int j = 0; j < salleCinema[row - 1].length; j++) {

			// initial each places and show places
			if (salleCinema[row - 1][j] == '-') {
				placeCountAvailable++;
				if (placeCountAvailable == placeCount) {

					return true;
				}
			}
		}
		System.out.println();

		return false;
	}

}
