package com.github.SooStrator.TratorBase;

import com.github.SooStrator.TratorBase.utils.FileUtil;
import com.github.SooStrator.TratorBase.utils.MathUtil;
import com.github.SooStrator.TratorBase.utils.MethodsUtil;
import com.github.SooStrator.TratorBase.utils.TaskbarUtil;
import com.github.SooStrator.TratorBase.utils.UserUtil;

public class TratorBase {
	
	final static double Version = 1.8;
	public static FileUtil getFileUtil = new FileUtil();
	public static TaskbarUtil getTaskbarUtil = new TaskbarUtil();
	public static UserUtil getUserUtil = new UserUtil();
	public static MethodsUtil getMethodUtil = new MethodsUtil();
	public static MathUtil getMathUtil = new MathUtil();
	
	public static void main(String[] args) throws Exception {
		System.out.println("TratorBase-b" + Version);
	}
	
}