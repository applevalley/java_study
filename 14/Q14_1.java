package ch14;

class Car {
	int gasolineGauge;
	
	Car(int gasolineGauge) {
		this.gasolineGauge = gasolineGauge;
	}
}

class HybridCar extends Car {
	int electricGauge;
	
	HybridCar(int gasolineGauge, int electricGauge) {
		super(gasolineGauge);
		this.electricGauge = electricGauge;
	}
}

class HybridWaterCar extends HybridCar {
	int waterGauge;
	
	HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge) {
		super(gasolineGauge, electricGauge);
//		this.gasolineGauge = gasolineGauge;
//		this.electricGauge = electricGauge;
		this.waterGauge = waterGauge;
	}
	
	public void showCurrentGauge() {
		System.out.println("gasoline left: " + gasolineGauge);
		System.out.println("electricity left: " + electricGauge);
		System.out.println("water left: " + waterGauge);
	}
}

public class Q14_1 {

	public static void main(String[] args) {

		HybridWaterCar car1 = new HybridWaterCar(100, 200, 300);
		car1.showCurrentGauge();
	}

}
