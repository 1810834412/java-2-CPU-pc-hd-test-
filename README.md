# java-2-CPU-pc-hd-test-
# 计191_高亮_2019310199_实验二PC机模拟程序
# 一、实验目的：
### 1.掌握类与对象的基本思想。
### 2.巩固类与对象的基本方法。
### 3.理解封装是如何进行操作的。
### 4.理解不同类型的作用域范围。
# 二、实验要求：
### 1.基本要求：
### （1）用类描述计算机中cpu的速度和硬盘的容量。
### （2）要求Java程序中要有4个类，名字分别为Cpu、HardDisk、Pc和Test。
### （3）Cpc类要求，getSpeed()返回speed的值，setSpeed(int speed)方法将形参speed的值赋值给speed。
### （4）HardDisk类要求getAmount()返回amount的值，setAmount(int amount)方法将形参amount的值赋值给amount。
### （5）PC类要求，setCPU(Cpu cpu)将参数cpu的值赋值给cpu，setHardDisk(HardDisk HD)方法将参数HD的值赋值给HD，show()方法能显示cpu的速度和硬盘容量。
### （6）主类Test的要求，创建Cpu、HardDisk和Pc的对象调用setCPU(CPU cpu)方法，调用时实参是cpu，调用setHardDisk(HardDisk HD)方法，调用时实参是HD，调用show()方法。
### 2.附加要求：
### （1）类中定义不少于两个构造方法；
### （2）每个类定义不少于2个属性，且属性的类型应该多样化；
### （3）根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
### （4）尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法；
# 三、操作过程：
### （1）根据课本上的要求，首先创建出三个类分别为：PC、CPU、HardDisk和主类Test。
### （2）根据题目要求在Cpu类中设置成员变量speed、thead、cnumber，在HardDisk中设置成员变量rspeed、wspeed。
### （3）在CPU类和HardDisk类中各设置6个方法2个构造方法，其中6个方法包括各自的3个变量的get以及set方法，用来对所接受的参数利用this关键字将该参数赋值给该类中的成员变量。
### （4）在set方法中利用if和else语句进行逻辑判断，在get方法中利用retrun返回该类中的成员变量。
### （5）在PC类中定义两个构造方法，用来将所接收的Cpu类和HardDisk类的参数，并在构造方法中调用set方法和利用this关键字对Cpu和HD成员变量赋值。
### （6）在PC类中定义名为show的方法并利用对象.get方法来打印对象Cpu和对象HD的属性信息。
### （7）在Test类中利用对象.set的方法对对象的成员变量赋值。
### （8）在Test类中利用对象.方法的来调用show方法，来打印数据。
# 四、核心代码：
### 1.CPU类的构造方法的定义以及set方法：
```
 Cpu(int speed){
        setSpeed(speed);
    }
    Cpu(int thread,int cnumber){
        setCnumber(cnumber);
        setThread(thread);
    }
    public void setSpeed(int speed) {
        if (0<=speed && speed<=5){
            this.speed = speed;
        }
        else {
            System.out.println("CPU速度输入有误");
        }
    }
    void setThread(int thread){
        if (0<=thread && thread<=30){
            this.thread = thread;
        }
        else {
            System.out.println("CPU线程数输入有误");
        }
    }
    protected void setCnumber(int cnumber){
        if (0<=cnumber && cnumber<=20){
            this.cnumber = cnumber;
        }
        else {
            System.out.println("CPU核心数输入有误");
        }
    }
```
### 2.HardDisk类中的set和get方法的定义：
```
 int getRspeed(){
        return rspeed;
    }
    int getWspeed(){
        return wspeed;
    }
    int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        if (0<=amount && amount<=10000){
            this.amount = amount;
        }
        else {
            System.out.println("硬盘容量输入有误");
        }
    }
    void setRspeed(int rspeed) {
        if (0<=rspeed && rspeed<=5000){
            this.rspeed = rspeed;
        }
        else {
            System.out.println("硬盘读取速度输入有误");
        }
    }
    protected void setWspeed(int wspeed) {
        if (0<=wspeed && wspeed<=5000){
            this.wspeed = wspeed;
        }
        else {
            System.out.println("硬盘写入速度输入有误");
        }
    }
```
### 3.PC类中定义设置cPU对象和hardDisk对象的值的构造方法：
```
 Pc(Cpu cpu){
        setCPU(cpu);
    }
 Pc(HardDisk HD){
        setHardDisk(HD);
    }
```
### 4.Test类中用构造方法创建对象时的初始化：
```
 Cpu cpu = new Cpu(12,8);
 cpu.setSpeed(4);
 HardDisk HD=new HardDisk(3000,3500);
 HD.setAmount(1000);
 Pc pc = new Pc(cpu);
 pc.setHardDisk(HD);
```
# 五、实验结果
### 实验结果截图
![实验结果截图](https://github.com/1810834412/java-2-CPU-pc-hd-test-/blob/main/Java%E7%AC%AC%E4%BA%8C%E6%AC%A1%E5%AE%9E%E9%AA%8C%E7%BB%93%E6%9E%9C%E6%88%AA%E5%9B%BE.png)

# 六、实验感想：
### 首先我通过这次实验得到了亲自动手写代码的锻炼，我一直认为学任何的编程语言都不是光靠想就可以的一定要亲自动手。其次我在这次试验我学到了如何进行封装以及对类的调用更加的熟练。最后通过老师的讲解，在github学会了创建仓库，将代码托管在github上并学会了MD格式文档的基本操作。
