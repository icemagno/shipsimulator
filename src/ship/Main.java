package ship;

import com.mattheys.InfoObserver;
import com.mattheys.SimulationThread;
import com.mattheys.TestInfoObserver;

public class Main {
	
	static double interval = 1.0;
	static double boatspeed = 0.0;
	static double heading = 45.0;
	static double latitude = 47.65;
	static double longitude = -122.45;
	static double altitude = 0.0;
	static int rudderposition = 0;
	static int throttleposition = 0;
	
	
	private static double calcHullSpeed( int waterLineLengthMeters ) {
		double waterLineLengthFeet = waterLineLengthMeters * 3.2808;
		double hullSpeed = 1.34 * Math.sqrt( waterLineLengthFeet );
		return hullSpeed;
	}
	
	
	public static void main(String[] args) {
		
		InfoObserver observer = new TestInfoObserver();
		double hullspeed = calcHullSpeed( Ships.FRAGATA_NITEROI );
		
		SimulationThread simulation = new SimulationThread(observer, interval, hullspeed, boatspeed, heading, latitude, 
				longitude, altitude, rudderposition, throttleposition, 2.0);
		
		
		simulation.start();
		
		// simulation.SetRudderPosition(p);  // O rudder terá tudo a ver com o MiniPID 
		// simulation.SetThrottlePosition(t);
		
	}

}
