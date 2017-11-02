package com.scheduler;

import java.util.TimerTask;

import com.rixyncs.fetchrecord.DataPush;

import java.util.Date;

// Create a class extends with TimerTask
public class ScheduledTask extends TimerTask {

	Date now; // to display current time

	// Add your task here
	        public void run() {
		now = new Date(); // initialize date
		System.out.println("Time is :" + now); // Display current time
		
		DataPush sc=new DataPush();
		sc.Scheduler();
	}
}