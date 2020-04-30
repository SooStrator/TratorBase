package com.github.SooStrator.TratorBase.utils;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import org.apache.commons.codec.binary.Hex;

public class MethodsUtil {
	
	public static BufferedImage Screenshot() {
		BufferedImage image = null;
		try {
			image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			return image;
		} catch (Exception e) {}
		if(image != null) {
			return image;
		} else {
			System.err.println("Error: Failed to take a screenshot");
			return null;
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static String[] ListToArray(ArrayList list) {
	      String[] myArray = new String[list.size()];
	      list.toArray(myArray);
	      return myArray;
	}
	
	public static String CharToString(char InputChar) {
		return String.valueOf(InputChar);
	}
	
    public static String BytesToHex(byte[] bytes) {
        char[] chars = Hex.encodeHex(bytes);
        return new String(chars);
    }
	
}