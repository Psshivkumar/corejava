package com.xworkz.boot.app;

public class BrowserRunner {

	public static void main(String[] args) {

		Browser chrome = new Chrome();
		Browser opera = new Opera();
		Browser firefox = new Firefox();
		Browser edge = new Edge();
		Chrome chrome2 = new Chrome();
		System.out.println(opera.version);
		firefox.searchEngine();
		Firefox firefox2=(Firefox) firefox;
	    firefox2.function();
	    Edge edge2=(Edge) edge;
	    edge2.microsoft(edge2);
 
	}

}
