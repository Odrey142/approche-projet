package fr.diginamic.banque.entities;

public class Credit extends Operation {

	public Credit(String dateOp, int montant) {
		super(dateOp, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "CREDIT";
	}

	@Override
	public String toString() {
		return "Credit [getType()=" + getType() + "]";
	}

}
