package com.xworkz.Abstraction.boot;

import com.xworkz.Abstraction.app.MicroWave;
import com.xworkz.Abstraction.app.Oven;

public class MicroWaveMain {

	public static void main(String[] args) {
		MicroWave microWave = new Oven();

		microWave.adjustTimer();
		microWave.powerOff();
		microWave.powerOn();
		microWave.setTemperature();
		microWave.stopTimer();

		System.out.println("-------------------");

		microWave.bake();
		microWave.displayStatus();
		microWave.lightOff();
		microWave.lightOn();
		microWave.preHeat();

	}

}
