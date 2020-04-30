package com.github.SooStrator.TratorBase.utils;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.UUID;

public class UserUtil {
	
	public static String getUsername() {
		return System.getenv("USERNAME");
	}
	
	public static String getTempFolder() {
		return System.getenv("TEMP");
	}
	
	public static String gethHomePath() {
		return System.getenv("homePath");
	}
	
	public static String getOperatingSystem() {
		return System.getProperty("os.name");
	}
	
	public static String getRuntimeVersion() {
		return System.getProperty("java.runtime.version");
	}
	
	public static String getFileSeperator() {
		return System.getProperty("file.separator");
	}
	
	public static String getLineSeperator() {
		return System.getProperty("line.separator");
	}
	
	public static int getScreenResolution() {
		return Toolkit.getDefaultToolkit().getScreenResolution();
	}
	
	public static int getScreenWidth() {
		return Toolkit.getDefaultToolkit().getScreenSize().width;
	}
	
	public static int getScreenHeigth() {
		return Toolkit.getDefaultToolkit().getScreenSize().height;
	}
	
	public static Dimension getScreenSize() {
		return Toolkit.getDefaultToolkit().getScreenSize();
	}
	
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}
	
}