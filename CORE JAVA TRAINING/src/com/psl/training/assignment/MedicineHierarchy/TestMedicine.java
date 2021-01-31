package com.psl.training.assignment.MedicineHierarchy;

public class TestMedicine {
	public static void main(String[] args) {
		Medicine[] med = new Medicine[10];
		int ran;
		for(int i=0; i<10; i++) {
			ran = ((int) (Math.random()*(3)))+1;
			if(ran == 1) {
				med[i] = new Tablet("CT"+i+ran, "A"+i+ran);
			}
			else if(ran == 2) {
				med[i] = new Syrup("CS"+i+ran, "A"+i+ran);
			}
			else {
				med[i] = new Oinment("CO"+i+ran, "A"+i+ran);
			}
		}
		for(int i=0; i<10; i++) {
			med[i].displayLabel();
			System.out.println();
		}
	}
}