package com.github.SooStrator.TratorBase.utils;

import java.io.File;
import java.io.IOException;

public class FileUtil {
	
	public static void CreateFile(String FileName, String path, String dirName) {
		boolean errorfound = false;
		File file = new File(path + dirName + "/" + FileName);
		File dir = new File(path + dirName);
		if (dir.mkdir()) {
            try {
				System.out.println("Datei erstellt: " + file.createNewFile());
			} catch (IOException e) {
				errorfound = true;
				System.err.println("[Error]" + FileName + " konnte nicht erstellt werden");
			}
        } else {
        	if(!errorfound) {
        		System.err.println("[Error]" + dir + " konnte nicht gefunden werden");
        	}
        } 
	}
	
	public static void DeleteFile(File file) {
		boolean errorfound = false;
		try {
			if(file.exists()) {
				file.delete();
			}else {
				errorfound = true;
				System.err.println("[Error]" + file.getName() + " wurde nicht gefunden");
			}
		}catch(Exception e) {
			if(!errorfound) {
				System.err.println("[Error]"+ file.getName() + " konnte nicht gelöscht werden");
			}
		}
	}
	
	public static void DeleteFileOnExit(File file) {
		boolean errorfound = false;
		try {
			if(file.exists()) {
				file.deleteOnExit();
			}else {
				System.err.println("[Error]"+ file.getName() + " nicht gefunden");
			}
		}catch(Exception e) {
			System.err.println("[Error]"+ file.getName() + " konnte nicht gelöscht werden");
		}
	}
	
}