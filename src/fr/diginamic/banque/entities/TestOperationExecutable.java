package fr.diginamic.banque.entities;

public class TestOperationExecutable {

	public static void main(String[] args) {
		
		Debit db1 = new Debit("date op 1",65);
		Debit db2 = new Debit("date op 2",65);
		Debit db3 = new Debit("date op 3",65);
		Debit db4 = new Debit("date op 4",65);
		
		
		Credit cdt1 = new Credit("date op 5",35);
		Credit cdt2 = new Credit("date op 6",35);
		Credit cdt3 = new Credit("date op 7",35);
		Credit cdt4 = new Credit("date op 8",35);
		
		Operation[] tablOperation = {db1,db2,db3,db4,cdt1,cdt2,cdt3,cdt4};
		for (int i = 0; i <= tablOperation.length-1; i++) {
			System.out.println(tablOperation[i]);
		}
		
		
	}

}
