package fr.diginamic.banque.entities;

public class TestOperationExecutable {

	public static void main(String[] args) {
		
		Debit db1 = new Debit("sFJU",65);
		Debit db2 = new Debit("SEDSs",65);
		Debit db3 = new Debit("sgkjb",65);
		Debit db4 = new Debit("shvjh",65);
		
		
		Credit cdt1 = new Credit("gf",35);
		Credit cdt2 = new Credit("gf",35);
		Credit cdt3 = new Credit("gf",35);
		Credit cdt4 = new Credit("gf",35);
		
		Operation[] tablOperation = {db1,db2,db3,db4,cdt1,cdt2,cdt3,cdt4};
		for (int i = 0; i <= tablOperation.length-1; i++) {
			System.out.println();
		}
		
		
	}

}
