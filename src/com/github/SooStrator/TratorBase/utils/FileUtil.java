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
				System.out.println("File created: " + file.createNewFile());
			} catch (IOException e) {
				errorfound = true;
				System.err.println("[Error]" + FileName + " could not be created");
			}
        } else {
        	if(!errorfound) {
        		System.err.println("[Error]" + dir + " not found");
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
				System.err.println("[Error]" + file.getName() + " not found");
			}
		}catch(Exception e) {
			if(!errorfound) {
				System.err.println("[Error]"+ file.getName() + " could not be deleted");
			}
		}
	}
	
	public static void DeleteFileOnExit(File file) {
		boolean errorfound = false;
		try {
			if(file.exists()) {
				file.deleteOnExit();
			}else {
				System.err.println("[Error]"+ file.getName() + " not found");
			}
		}catch(Exception e) {
			if(!errorfound) {
				System.err.println("[Error]"+ file.getName() + " could not be deleted");
			}
		}
	}
	
}