package diyicizuoyedi4ti;
public class HardDisk
{
    private int amount;
    private int rspeed;
    private int wspeed;
    HardDisk(int amount){
        setAmount(amount);
    }
    HardDisk(int rspeed,int wspeed){
        setRspeed(rspeed);
        setWspeed(wspeed);
    }
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
}
