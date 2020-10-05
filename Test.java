package diyicizuoyedi4ti;
public class Test {
    public static void main(String args[]) {
        Cpu cpu = new Cpu(12,8);
        cpu.setSpeed(4);
        HardDisk HD=new HardDisk(3000,3500);
        HD.setAmount(1000);
        Pc pc = new Pc(cpu);
        pc.setHardDisk(HD);
        pc.show();
    }

}
