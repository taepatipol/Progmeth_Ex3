package main;
import java.util.ArrayList;

import model.*;

public class Main {
	
	/*
	 * Code here
	 * */
	public static ArrayList<Worker> workers = new ArrayList<>();
	
	public static void trigger(Worker w){
		/*
		 * Code here
		 * */
		if (w instanceof QualityChecker) {
			((QualityChecker) w).increaseStress();
		}
	}
	
	public static void produce(){
		/*
		 * Code here
		 * */
		for(Worker w : workers) {
			w.work();
			trigger(w);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bot A = new MaterialProcessor();
		Bot B = new ProductAssembler();
		Bot C = new Packager();
		QualityChecker D= new QualityChecker();
		QualityChecker E= new QualityChecker();
		
		workers.add(A);workers.add(B);workers.add(C);workers.add(D);workers.add(E);
		
		while(Bot.material>0){
			produce();
		}
		System.out.println("Total Product today =" + Bot.finishedProduct);
		
	}

}
