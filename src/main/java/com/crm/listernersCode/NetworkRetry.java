package com.crm.listernersCode;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class NetworkRetry implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		int start =0;
		int end=3;
		while(start<end)
		{
			start++;
			return true;
		}
		
		return false;
	}


}
