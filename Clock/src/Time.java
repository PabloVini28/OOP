class Time {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    
    Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    
    public int getHour(){
        return this.hour; 
    }
    
    public int getMinute(){
        return this.minute;
    }
    
    public int getSecond(){
        return this.second;
    }
    
    public void setHour(int value){
        if(value > 23 || value < 0){
            IO.println("fail: hora invalida");   
            return;
        }
        this.hour = value;
    }
    
    public void setMinute(int value){
        if(value > 59 || value < 0){
            IO.println("fail: minuto invalido");
            return;
        }
        this.minute = value;
    }
    
    public void setSecond(int value){
        if(value > 59 || value < 0){
            IO.println("fail: segundo invalido");
            return;
        }
        this.second = value;
    }
    
    public void nextSecond(){
        this.second++;
        if(getSecond() == 60){
            setSecond(0);
            this.minute++;
        }
        if(getMinute()==60){
            setMinute(0);
            this.hour++;
        }
        if(getHour() == 24){
            setHour(0);
            setMinute(0);
            setSecond(0);
        }
    }
    
    public String toString(){
        return String.format("%02d:%02d:%02d",this.hour,this.minute,this.second);
    }

}

class Legenda{
    
}