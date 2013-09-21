upgrade
=======

A helpful component to download  a  upgrade  file. Breakpoint continuingly  is supported in this project.


Announcement：
1.This project is a free and open-source project,developers can use this project for any intent ,and free forever.
2.If you have any good suggestion,or you find some bugs,you can email to 6881797@163.com .We welcome the feedbacks like this kind.

How to use：
1.This project is an android library,you can download it and add to your project as a library,or you can copy the codes to your project。
2.The core of this project is to new an instance of DownLoadUpgradeFileTask. Its constructor DownLoadUpgradeFileTask(Context context, String url,String downLoadFileDir,boolean supportedBreakPoint)
，has four parameters: 'url' is the upgrade http file url; 'downLoadFileDir' is the dir to store the download upgrade file only; 'supportedBreakPoint' indicates that whether the download should support breakpoint conitnuingly.
3.Some resource to replace:
a. \res\drawable-xhdpi\ic_notification ，     Please replace it with your project notification drawable，Usually has a with and height is 48*48
b. \res\values(或 \res\values-zh)，      You can replace some strings.


声明：
1.本项目属于免费开源项目，使用者可用于任何用途，永久免费
2.如果您对本项目有好的建议，或者发现项目中有bug，请您发邮件到  6881797@163.com

使用说明：
1.本项目是作为andorid的一个library，使用者下载后，直接添加到您的项目中即可，也可以copy代码到您的想目中去。
2.本项目的核心是 new 一个 DownLoadUpgradeFileTask 实例出来，他的构造方法 DownLoadUpgradeFileTask(Context context, String url,String downLoadFileDir,boolean supportedBreakPoint)
，有四个参数，url 是升级文件  的url， downLoadFileDir 是存放下载文件的目录，要求这个目录下只能存放升级文件  ；supportedBreakPoint 是标识是否使用断点续下，true表示断点续下，false表示每次下载都是一次新的下载
3.需要替换的资源文件：
a. \res\drawable-xhdpi\ic_notification ，请开发者自己替换为自己项目的 通知栏图标，一般要求为宽高:48*48
b. \res\values(或 \res\values-zh)，里面的一些string，开发者可以自定义 
