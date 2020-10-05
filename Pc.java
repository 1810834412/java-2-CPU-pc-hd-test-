package diyicizuoyedi4ti;
public class Pc
{
    private Cpu cpu;
    private HardDisk HD;
    Pc(Cpu cpu){
        setCPU(cpu);
    }
    Pc(HardDisk HD){
        setHardDisk(HD);
    }
    protected void setCPU(Cpu cpu)
    {
        this.cpu = cpu;
    }
    void setHardDisk(HardDisk HD)
    {
        this.HD = HD;
    }
    void show()
    {
        System.out.println("CPU速度:"+cpu.getSpeed());
        System.out.println("CPU线程:"+cpu.getThread());
        System.out.println("CPU核心数量:"+cpu.getCnumber());
        System.out.println("硬盘容量:"+HD.getAmount());
        System.out.println("硬盘读取速度:"+HD.getRspeed());
        System.out.println("硬盘写入速度:"+HD.getWspeed());
    }
}
