package com.upgrade.example;

import java.io.File;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;

import com.upgrade.library.task.DownLoadUpgradeFileTask;
import com.upgrade.library.util.UpgradeUtil;

/**
 * 
 * @email 6881797@163.com
 */
public class MainActivity extends Activity {

	private final String testUrl = "http://bs.baidu.com/appstore/apk_0D991094E5CE38957811C1FA3726B748.apk";
	private DownLoadUpgradeFileTask mDownloadTask;
	private String mDirPath ;// A dir that will be only used to store the downloaded upgrade file .
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mDirPath = createDownLoadUpgradeDir(getApplicationContext());
	}
	
	
	public void onClick(View view){
		switch(view.getId()){
		case R.id.start_download:
			if(mDownloadTask!=null){
				mDownloadTask.cancel(true);
			}
			mDownloadTask = new DownLoadUpgradeFileTask(getApplicationContext(), testUrl, mDirPath, true);
			mDownloadTask.execute();
			break;
		case R.id.stop_download:
			if(mDownloadTask!=null){
				mDownloadTask.cancel(true);
			}
			break;
		case R.id.delete_download_file:
			File dir = new File(mDirPath);
			UpgradeUtil.deleteContentsOfDir(dir);
			break;
		}
	}
	
	private static String createDownLoadUpgradeDir(Context context){
		String dir =  null;
		final String dirName = "upgrade";
		File root =  null;
		if(Environment.getExternalStorageState().equalsIgnoreCase(Environment.MEDIA_MOUNTED)){
			root = context.getExternalFilesDir(null);
		}else{
			root = context.getFilesDir();
		}
		File file = new File(root,dirName);
		file.mkdirs();
		dir = file.getAbsolutePath();
		return dir ;
	}
	


}
