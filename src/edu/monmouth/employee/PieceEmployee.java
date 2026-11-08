package edu.monmouth.employee;

public class PieceEmployee implements Employee {
	private int ratePerPiece = 0;
	private int piecesMade = 0;
	
	public PieceEmployee(int ratePerPiece) {
		this.ratePerPiece = ratePerPiece;
	}
	
	@Override
	public int getMonthlyPay() {
		int monthlyPay = (ratePerPiece * piecesMade);
		return monthlyPay;
	}
	
	@Override
	public String toString() {
	return ("Sales Employee | Rate Per Piece: " + ratePerPiece + "| Pieces Made: " + piecesMade);
	}
	
	@Override 
	public boolean equals(Object o){
		if (o == null) {
			return false;
		}
		else if (o instanceof PieceEmployee) {
			PieceEmployee obj = (PieceEmployee) o;
			if (this.ratePerPiece == obj.ratePerPiece && this.piecesMade == obj.piecesMade) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public void setPiecesMade(int piecesMade) {
		this.piecesMade = piecesMade;
	}

}
