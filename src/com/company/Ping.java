package com.company;

import java.io.IOException;
import java.net.InetAddress;

public class Ping {
	
	public static boolean pingReacheble(String adr, int timeOut) {
		boolean reach = false;
		try {
		       InetAddress address = InetAddress.getByName(adr);
		       reach = address.isReachable(timeOut);
		     }
		     catch (IOException e) {
		       System.err.println("Unable to reach" + adr);
		     }
		return reach;
	}

}
