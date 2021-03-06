/**
 * 
 */
package com.tamil.learn.java.basics.decisionmaking;

import java.util.stream.IntStream;

import com.tamil.learn.java.basics.vo.AnsiColor;

/**
 * @author atpsmnn
 *
 */
public class Countdown {
	private int i;
	
	// Synchronize the method to avoid race condition
	// Threads accessing the same shared resources leads to unpredictable results
	public synchronized void countdown() {
		String color = AnsiColor.ANSI_BLACK;		
		switch(Thread.currentThread().getName()) {
			case "Thread1": 
				color = AnsiColor.ANSI_CYAN;
				break;
			case "Thread2":
				color = AnsiColor.ANSI_PURPLE;
				break;
			default:
				color = AnsiColor.ANSI_GREEN;
		}
		//final String threadColor = color;
		//IntStream.range(0, 20).forEach(i -> System.out.println(threadColor + Thread.currentThread().getName() + " : i = "+i));
			System.out.println(color + Thread.currentThread().getName() + " : i = "+i);
	}		
}	

