package com.upgrade.library.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

/**
 * 
 * @email 6881797@163.com
 *
 */
public class UpgradeUtil {

	public static  long getNetFileSize(String strUrl) throws IOException{
		URL url = new URL(strUrl);
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setConnectTimeout(5 * 1000);
		conn.setReadTimeout(1000 * 10);
		conn.setRequestMethod("GET");
		conn.connect();
		int length = conn.getContentLength();
		conn.disconnect();
		return length;
	}
	
	
	public static String getPackageVersionName(Context context){
		try {
			PackageInfo info = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.GET_META_DATA);
			String versionName = info.versionName;
			return versionName;
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static int getPackageVersionCode(Context context){
		try {
			PackageInfo info = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.GET_META_DATA);
			int versionCode = info.versionCode;
			return versionCode;
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		return 1;
	}
	
	
	public static void deleteContentsOfDir(File dir){
		if(dir==null || !dir.exists())
			return ;
		File[] files = dir.listFiles();
		if(files!=null && files.length>0){
			for(int i=0;i<files.length;i++){
				deleteDirIncludeSelf(files[i]);
			}
		}
		
	}
	
	
	public static void deleteDirIncludeSelf(File dir) {
		if (dir == null || !dir.exists()) return;
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (File file : files)
				if (file.isDirectory()) deleteDirIncludeSelf(file);
				else file.delete();
			dir.delete();
		} else dir.delete();
	}
	
	
	public static void closeInputStream(InputStream is) {
		if (is == null) {
			return;
		}
		try {
			is.close();
			is=null;
		} catch (IOException e) {
			LogUtil.e(e.getLocalizedMessage());
		}
	}

	public static void closeOutputStream(OutputStream os) {
		if (os == null) {
			return;
		}
		try {
			os.close();
			os=null;
		} catch (IOException e) {
			LogUtil.e(e.getLocalizedMessage());
		}
	}
	
}
