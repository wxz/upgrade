package com.upgrade.library.util;

import android.util.Log;

/**
 * 
 *
 * @author xinzhangwei
 *
 ** @email 6881797@163.com
 */
public class LogUtil {

	public static final boolean DEBUG = true;
	public static final String TAG = "LogUtil";
	
	public static void d(String info) {
		d(TAG,info);
	}
	public static void d(String tag,String info) {
		if(DEBUG)
		Log.d(tag, info);
	}
	
	public static void i(String info) {
		i(TAG,info);
	}
	public static void i(String tag,String info) {
		if(DEBUG)
		Log.i(tag, info);
	}
	
	public static void w(String info) {
		w(TAG,info);
	}
	public static void w(String tag,String info) {
		if(DEBUG)
		Log.w(tag, info);
	}
	
	public static void e(String info) {
		e(TAG,info);
	}
	public static void e(String tag,String info) {
		if(DEBUG)
		Log.e(tag, info);
	}

	public static void e( Exception e){
		e(TAG,e);
	}
	
	public static void e(String tag , Exception e){
		if(DEBUG && e!=null)
			e.printStackTrace();
	}

	
	
}
