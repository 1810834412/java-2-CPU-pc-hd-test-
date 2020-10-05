package diyicizuoyedi4ti;
public class Cpu
{
    private int speed;
    private int thread;
    private int cnumber;
    Cpu(int speed){
        setSpeed(speed);
    }
    Cpu(int thread,int cnumber){
        setCnumber(cnumber);
        setThread(thread);
    }
    int getSpeed() {
        return speed;
    }
    int getThread(){
        return thread;
    }
    int getCnumber(){
        return cnumber;
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
}
