package view;

//import controller.ThreadId;
import controller.Threads;

public class Principal {
	
	public static void main(String[] args) {
		
		int [] ThreadVetorAll = new int[1000];
		int i = 0;
		for (int y = 0; y < 1000; y++) {
			ThreadVetorAll[i] = (int)(Math.random()*101);
			i = i + 1;
		}
		int ThreadVetor = (int)(Math.random()*1000);
		int ThreadNum = ThreadVetorAll[ThreadVetor];
		int ThreadVetor1 = (int)(Math.random()*1000);
		int ThreadNum1 = ThreadVetorAll[ThreadVetor];
		for(int j = 0; j < 1; j++) {
			Thread threads = new Threads(ThreadVetor, ThreadVetorAll, ThreadNum, ThreadVetor1, ThreadNum1);
			threads.start();
		}
	}
}

