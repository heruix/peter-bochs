package com.peterbochs.webservice;

import java.util.Random;

import com.peterbochs.Global;

public class WebServiceUtil {
	static String magicNumber = String.valueOf(new Random().nextInt(100000000));

	public static void log(final String software, final String message1, final String message2, final String message3, final String info) {
		new Thread() {
			public void run() {
//				if (Setting.getInstance().isLogToPetersoftServer()) {
					try {
						new MonitorSoftwareProxy().getMonitorSoftware().log2(software, message1, message2, message3, info, magicNumber, Global.version);
					} catch (Exception e) {
						//			e.printStackTrace();
					}
//				}
			}
		}.start();
	}
}
