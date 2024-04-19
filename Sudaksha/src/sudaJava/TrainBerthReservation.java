package sudaJava;

import java.util.Scanner;

class TrainBerthReservation implements Runnable{
int availableBerths=10;
int reqBerths;

	@Override
	public synchronized void run() {
		System.out.println("Welcome " +Thread.currentThread().getName());	
		System.out.println("available berths"+availableBerths);	
		Scanner sc=new Scanner(System.in);
		if(reqBerths<=availableBerths) {
			System.out.println("Enter berths required ");
			 reqBerths=sc.nextInt();
			System.out.println("Berths allowed to "+Thread.currentThread().getName()+ " are "+reqBerths);
			availableBerths=availableBerths-reqBerths;
		}else {
			System.out.println("no available berths");
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


