upgrade
=======

A helpful component to download  a  upgrade  file. Breakpoint continuingly  is supported in this project.


Announcement��
1.This project is a free and open-source project,developers can use this project for any intent ,and free forever.
2.If you have any good suggestion,or you find some bugs,you can email to 6881797@163.com .We welcome the feedbacks like this kind.

How to use��
1.This project is an android library,you can download it and add to your project as a library,or you can copy the codes to your project��
2.The core of this project is to new an instance of DownLoadUpgradeFileTask. Its constructor DownLoadUpgradeFileTask(Context context, String url,String downLoadFileDir,boolean supportedBreakPoint)
��has four parameters: 'url' is the upgrade http file url; 'downLoadFileDir' is the dir to store the download upgrade file only; 'supportedBreakPoint' indicates that whether the download should support breakpoint conitnuingly.
3.Some resource to replace:
a. \res\drawable-xhdpi\ic_notification ��     Please replace it with your project notification drawable��Usually has a with and height is 48*48
b. \res\values(�� \res\values-zh)��      You can replace some strings.


������
1.����Ŀ������ѿ�Դ��Ŀ��ʹ���߿������κ���;���������
2.������Ա���Ŀ�кõĽ��飬���߷�����Ŀ����bug���������ʼ���  6881797@163.com

ʹ��˵����
1.����Ŀ����Ϊandorid��һ��library��ʹ�������غ�ֱ����ӵ�������Ŀ�м��ɣ�Ҳ����copy���뵽������Ŀ��ȥ��
2.����Ŀ�ĺ����� new һ�� DownLoadUpgradeFileTask ʵ�����������Ĺ��췽�� DownLoadUpgradeFileTask(Context context, String url,String downLoadFileDir,boolean supportedBreakPoint)
�����ĸ�������url �������ļ�  ��url�� downLoadFileDir �Ǵ�������ļ���Ŀ¼��Ҫ�����Ŀ¼��ֻ�ܴ�������ļ�  ��supportedBreakPoint �Ǳ�ʶ�Ƿ�ʹ�öϵ����£�true��ʾ�ϵ����£�false��ʾÿ�����ض���һ���µ�����
3.��Ҫ�滻����Դ�ļ���
a. \res\drawable-xhdpi\ic_notification ���뿪�����Լ��滻Ϊ�Լ���Ŀ�� ֪ͨ��ͼ�꣬һ��Ҫ��Ϊ���:48*48
b. \res\values(�� \res\values-zh)�������һЩstring�������߿����Զ��� 
