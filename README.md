﻿# 实验5
###iodemo.class是基本IO操作的实现类和获取系统文件树的实现类
通过把输入的字符串用getBytes函数转为字节数组，再用write函数把东西写到TXT文件里再通过下面代码读取file1写入到file2
		FileReader fin = new FileReader(file1);
		FileWriter fout = new FileWriter(file2);
		int c;
		while((c=fin.read())!=-1){
			fout.write(c);
		}
File[] list = file.listFiles();把file路径下所有的文件和文件夹放进File数组list里getName获取名字lastModified获取最后修改时间length获取大小
isDirectory和isFile和判断类型
###iodemo2.class是带缓冲区的IO的实现类
跟上面实验一样的读写方法以字节流的方式读写和BufferedInputStream创建对象以缓存流方式读取文件，BufferedOutputStream创建对象以缓存流方式写入文件做对比，System.currentTimeMillis函数得到系统当前时间设开始时间和结束时间
###serialize.class是对象序列化的实现类
List<Student>声明一个类型为Student对象的集合对象
通过BufferedReader把list.txt里的学生信息通过student里的函数赋值放进list集合里
writeObject(list)把list对象序列化list里面的Student对象也被序列化(ArrayList<Student>)readObject()反序列化再强制类型转化为ArrayList<Student>对象。