package b4_class_and_object.excercise;

public class StopWatch{
    private long startTime, endTime;
    public StopWatch(){
    }
    public long getStartTime(){
        return this.startTime;
    }
    public long getEndTime(){
        return this.endTime;
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis( );
    }
    public String getElapsedtime(){
        return "Thời gian thực thi của chương trình là " + (this.endTime - this.startTime) + "ms";
    }
}