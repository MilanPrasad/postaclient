package com.scheduler;

import java.util.Timer;

//Main class
public class SchedulerMain {
	public static void main(String args[]) throws InterruptedException {

		Timer time = new Timer(); // Instantiate Timer Object
		ScheduledTask st = new ScheduledTask(); // Instantiate SheduledTask class
		time.schedule(st, 0, 500000); // Create Repetitively task for every 5 secs
	
}}