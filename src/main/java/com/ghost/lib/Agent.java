package com.ghost.lib;

import java.lang.instrument.Instrumentation;

public class Agent {

	private static Instrumentation instrumentation;

	public static void premain(String args, Instrumentation ins) {
		instrumentation = ins;
	}

	public static long getObjectSize(Object objectToMeasure) {
		return instrumentation.getObjectSize(objectToMeasure);
	}

}
