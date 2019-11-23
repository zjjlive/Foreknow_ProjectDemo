package com.foreknow.demo1;

/**
 * 变量、数据类型、运算符
 * 1.变量
 * 概念：来源于数学，是计算机语言中能住存储计算结果或能表示值的一个抽象的概念。可以理解为可以为某块
 * 内容起个名字，通过名字就可以找到内存中存放的数据。这块内存的名字我们一般被称为变量名
 *
 * 2.如何定义一个变量   语法:  数据类型 变量名 = 值;  例如: int temp = 10;
 *
 * 3.变量一定要先初始化,然后才能使用
 *
 * 4.变量的命名规则
 *  不能与已有的变量名重复
 *  变量的名称一定要用英文字母或者$开头
 *  变量的名字的其它的字符可以是英文、数字、下划线和$，中间是不能够有空格的
 *  变量的名字不能使用Java中的关键字(具有特殊意义的单词)与保留字(目前在Java中还没有使用到的)
 *  变量的名字、类的名字都可以称为标识符(int b = 25;名字)
 *
 * 5.变量的命名的规范(驼峰原则)
 *  使用英文单词做为变量名
 *  首字母如果是英文，应该是小写字母。例如：name  age  studentName  studentClass
 *  如果由多个单词组成，第二个单词起，首字母要大写，其它的都小写
 *  尽量不要使用没有意义的单独字母，如果使用最好使用注释要说明
 *
 *  Java中的数据类型
 *  Java语言是一门强类型的编程语言，声明某个变量的时候一定要指定变量的存储类型。
 *  Java中的类型有两种
 *  1.基本数据类型(8种)：也可以称为原始类型
 *  2.引用数据类型(可以理解为自定义类型)
 *
 *  基本数据类型：byte short int long float double char boolean
 *  数值类型
 *  1.整数类型：表述为一个整数
 *  类型      占用的空间      位空间          取值范围
 *  byte      1Byte         8bit        -2的7次方---2的7次方-1
 *  short     2Byte         16bit       -2的15次方---2的15次方-1
 *  int(默认)  4Byte         32bit       -2的31次方---2的31次方-1
 *  long      8Byte         64bit       -2的63次方---2的63次方-1
 *
 * 2.浮点数类型：表述为一个浮点数(小数)
 * float 单精度浮点型
 * double 双精度浮点型   浮点数默认为double类型
 *
 * 3.字符型
 * char表述一个特定的字符(无论是英文，数字，汉字，符号都算为一个字符)
 * Java中的字符要使用单引号来表示 例如: 'A' '-' 'Y'
 *
 * 4.布尔类型
 * boolean表述逻辑的真(true)/假（false）
 *
 * 基本数据类型的转换
 * 自动类型转换
 *  规则    byte->short->int->long->float->double
 *          char->int
 *  1.范围小的类型向范围大的类型
 *  2.整数向浮点数类型
 *  3.char型向int类型
 *  4.布尔是不能进行任何转换的
 *
 * 强制类型转换
 * 规则    byte->short->int->long->float->double
 *        char->int
 * 当需要反向类型转换的时候，就需要利用强制类型的转换，这样也可能造成数据精度的丢失（浮点数的部分）。
 */
        public class TestVar {
            public static void main(String[] args) {
                //1.存放整数数据的变量
                //int:表示声明了一个可以存放整数的内存
                //temp就是变量名称
                //=号表示赋值
                //10表示一个数值
                int temp = 10;
                System.out.println("整数变量的值是:"+temp);
                //计算两个整数的和
                int a = 30;
                int b = 25;
                int c = a+b;
                System.out.println("两个整数的和是:"+c);
                //变量在声明的时候，也可以不赋值
                //变量一定要先初始化,然后才能使用,否则编译报错
                int d = 0;
                int x= 1,y = 2,z = 3;
                System.out.println(d);
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);

                int age = 20;
                int money = 3400;
                int id = 12;
                System.out.println("学生的编号是:"+id+"学生的年龄是:"+age+"学生零花钱是:"+money);

                //整数类型
                byte num = 100;
                short num1 = 13;
                int num2 = 150;
                long num3 = 4000;
                System.out.println("num2="+num2);

                //浮点类型
                float f1 = 3.14f;
                double f2 = 3.1415926;
                System.out.println("f1="+f1);
                System.out.println("f2="+f2);

                //字符型
                char c1 = 'A';
                char c2 = 'M';
                char c3 = 'Y';
                System.out.println("c3="+c3);

                //布尔类型的变量
                boolean yes = true;
                boolean marry = false;
                System.out.println("yes="+yes);

                //自动类型的转换
                byte bs = 28;
                int as = bs;//自动类型的转换  范围小->范围大
                System.out.println(as);

                long o = 1222;
                float f = o;//自动类型的转换  正数->浮点数
                System.out.println(f);

                char cs = '啊';
                int xs = cs;//自动类型的转换  char->int
                System.out.println(xs); //ASC码

                //强制类型转换
                int aaa = 97;
                byte bbb = (byte) aaa;
                System.out.println(bbb);

                //精度丢失
                int xxx = 200;
                byte yyy = (byte) x;
                System.out.println(yyy);

                double ddd = 3.14;  //丢失浮点数的部分
                int zzz = (int) ddd;
                System.out.println(zzz);

                // int->char
                int iii = 65;
                char jjj = (char) iii;
                System.out.println(jjj);


    }
}
