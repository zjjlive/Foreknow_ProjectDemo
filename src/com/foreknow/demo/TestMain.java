package com.foreknow.demo;

/**
 * Java的环境配制
 *
 * 开发环境的配制流程：
 *  下载JDK https://www.java.com/zh_CN/download/mac_download.jsp
 *  安装开发工具 http://www.jetbrains.com/
 *
 * 1.Java编程的语言特点
 *  跨平台
 *  面向对象的：就是一种开发的方法，适用于大型的复杂的业务逻辑的系统开发
 *  简单：相对于C++来说，Java的语法要简单
 *  分布式的
 *  安全的：Java的语法中包含了一系列检查等要求，保证程序不会出现严重的逻辑非法情况
 * 2.Java中的一些重要的名词
 *  JDK：是包含了进行Java开发工作的一系列工具和内容，其中会包含JRE,又被称为Java的开发环境。
 *  JRE：Java Development Kit（Java的运行时环境）
 *  JVM：Java的虚拟机(就是一个软件)
 *
 * 3.Java的开发工具：IDEA/Eclipse
 *
 * HelloWorld程序
 * 1.Java中的核心就是类(class)
 * 2.如果想要通过程序输出看到结果，要在class中一定要有main方法，而且一个类只能有一个main方法
 * 3.从目前来说，所有的Java的代码都要写到main方法中
 * 4.Java中的{}是成对出现
 * 5.System.out.println("字符串:我们要输出的内容")
 * 6.Java中是区分大小写的
 * 7.写在main方法的语句，每行结束后都要加分号，表示当前代码行结束
 * 8.所有括号以及分号都要使用英文输出法，不要使用中文输入法的符号
 *
 *
 * Java到底能够做什么？
 *  开发一些桌面程序   Web开发    手机端开发(Android)  大数据......
 */
public class TestMain {
    //主函数：程序的入口点,所有的Java的代码都要写到主函数(方法)里面
    //psvm回车
    public static void main(String[] args) {
        //sout回车
        System.out.println("这是一个helloworld程序");
        System.out.println("哈哈！！！！！！");
    }
}
