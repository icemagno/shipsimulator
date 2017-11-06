package ship;

import com.mattheys.InfoObserver;
import com.mattheys.SimulationThread;
import com.mattheys.TestInfoObserver;

public class Main {
	
	static double interval = 1.0;
	static double hullspeed = 9.7;
	static double boatspeed = 0.0;
	static double heading = 45.0;
	static double latitude = 47.65;
	static double longitude = -122.45;
	static double altitude = 0.0;
	static int rudderposition = 0;
	static int throttleposition = 0;
	
	public static void main(String[] args) {
		
		InfoObserver observer = new TestInfoObserver();
		
		SimulationThread simulation = new SimulationThread(observer, interval, hullspeed, boatspeed, heading, latitude, 
				longitude, altitude, rudderposition, throttleposition);
		simulation.start();
		
		// simulation.SetRudderPosition(p);  // O rudder terá tudo a ver com o MiniPID abaixo...
		// simulation.SetThrottlePosition(t);
		
		/*
		MiniPID miniPID; 
		
		miniPID = new MiniPID(0.25, 0.01, 0.4);
		miniPID.setOutputLimits(10);
		//miniPID.setMaxIOutput(2);
		//miniPID.setOutputRampRate(3);
		//miniPID.setOutputFilter(.3);
		miniPID.setSetpointRange(40);

		double target=100;
		
		double actual=0;
		double output=0;
		
		miniPID.setSetpoint(0);
		miniPID.setSetpoint(target);
		
		System.err.printf("Target\tActual\tOutput\tError\n");
		//System.err.printf("Output\tP\tI\tD\n");

		// Position based test code
		for (int i = 0; i < 100; i++){
			
			//if(i==50)miniPID.setI(.05);
			
			//if (i == 60)	target = 50;
				
			//if(i==75)target=(100);
			//if(i>50 && i%4==0)target=target+(Math.random()-.5)*50;
			
			output = miniPID.getOutput(actual, target);
			actual = actual + output;
			
			//System.out.println("=========================="); 
			//System.out.printf("Current: %3.2f , Actual: %3.2f, Error: %3.2f\n",actual, output, (target-actual));
			System.err.printf("%3.2f\t%3.2f\t%3.2f\t%3.2f\n", target, actual, output, (target-actual));
			
			//if(i>80 && i%5==0)actual+=(Math.random()-.5)*20;
		}		
		*/
	}

}
