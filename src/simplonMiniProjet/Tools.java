package simplonMiniProjet;

import java.util.InputMismatchException;
import java.util.Scanner;


public  class Tools {

	private  int scanInteger;
	private boolean errorScanInteger;

	public int getScanInteger() {
		return scanInteger;
	}

	public boolean isErrorScanInteger() {
		return errorScanInteger;
	}

	public void setScanInteger(int scanInteger) {
		this.scanInteger = scanInteger;
	}

	
	
	public  void scanInteger(int maxInteger) {

		Scanner scan = new Scanner(System.in);

		errorScanInteger = false;
		
		try {
			scanInteger = scan.nextInt();
			
			if ( scanInteger < 0 || scanInteger > maxInteger  ) {
				errorScanInteger = true;
			}

		} catch (InputMismatchException exception) {
			errorScanInteger = true;
		}

	}

}
