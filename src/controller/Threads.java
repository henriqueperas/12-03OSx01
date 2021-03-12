package controller;

public class Threads extends Thread {

	private int ThreadVetor, ThreadNum, ThreadVetor1, ThreadNum1;
	int[] ThreadVetorAll;
	
	public Threads(int ThreadVetor, int[] threadVetorAll, int ThreadNum, int ThreadVetor1, int ThreadNum1){
		this.ThreadVetor = ThreadVetor;
		this.ThreadVetorAll = threadVetorAll;
		this.ThreadNum = ThreadNum;
		this.ThreadVetor1 = ThreadVetor1;
		this.ThreadNum1 = ThreadNum1;
	}
	
	public void calc() {
		int tempo = 0;
		int tempo1 = 0;
		if(ThreadNum % 2 == 0) {
			for (int i = 0 ; i < ThreadVetorAll.length; i++) {
				if(i != ThreadVetor && i < ThreadVetor) {
					tempo++;
				}
			}
			//tempo = tempo / 1000;
		}else {
			for (int i = 0 ; i < ThreadVetorAll.length; i++) {
				if(i != ThreadVetor && i < ThreadVetor) {
					tempo++;
				}
			}
			//tempo1 = tempo1 / 1000;
		}
		if(ThreadNum1 % 2 == 0) {
			for (int i = 0 ; i < ThreadVetorAll.length; i++) {
				if(i != ThreadVetor1 && i < ThreadVetor1) {
					tempo1++;
				}
			}
			//tempo = tempo / 1000;
		}else {
			for (int i = 0 ; i < ThreadVetorAll.length; i++) {
				if(i != ThreadVetor1 && i < ThreadVetor) {
					tempo1++;
				}
			}
			//tempo1 = tempo1 / 1000;
		}
		System.out.println("0 " + tempo + ".s");
		System.out.println("1 " + tempo1 + ".s");
	}
	
	public void run() {
		calc();
	}
	
}
