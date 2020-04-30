package com.github.SooStrator.TratorBase.utils;

import java.awt.Taskbar;
import java.awt.Window;

public class TaskbarUtil {
	
	public static void requestWindowUserAttention(Window window) {
		if(Taskbar.isTaskbarSupported()) {
			try {
				Taskbar.getTaskbar().requestWindowUserAttention(window);
			} catch(Exception e) {}
		}else {
			System.err.println("[Error] Taskbaranzeigen sind auf ihrem Gerät nicht supported");
		}
	}
	
	public static void setWindowProgressState(Window window, Taskbar.State state) {
		if(Taskbar.isTaskbarSupported()) {
			try {
				Taskbar.getTaskbar().setWindowProgressState(window, state);
			} catch(Exception e) {}
		}else {
			System.err.println("[Error] Taskbaranzeigen sind auf ihrem Gerät nicht supported");
		}
	}
	
	public static void setProgressValue(int value) {
		if(Taskbar.isTaskbarSupported()) {
			try {
				Taskbar.getTaskbar().setProgressValue(value);
			} catch(Exception e) {}
		}else {
			System.err.println("[Error] Taskbaranzeigen sind auf ihrem Gerät nicht supported");
		}
	}
	
}