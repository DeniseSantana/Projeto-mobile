package treinamento.utils;

import static treinamento.config.DriverFactory.killDriver;

public class Helper {

	public static void finalizaTestes() {
		killDriver();
	}
}
