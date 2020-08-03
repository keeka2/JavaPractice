public class TimeTest { 
      public static void main(String[] args) 
      { 
            Time t = new Time(12, 35, 30);
			//원래는 주소가 나와야 됨
			//쓸모 없으므로 조금 더 유용하게 쓰기위해 오버라이딩 함
            System.out.println(t.toString()); 
//          t.hour = 13;
            t.setHour(t.getHour()+1);   // 현재시간보다 1시간 후로 변경한다. 
            System.out.println(t); 
      } 
}

//캡슐화 : 변수를 private, 접근을 메소드로
class Time { 
      private int hour; 
      private int minute; 
      private int second; 

      Time(int hour, int minute, int second) { 
            setHour(hour); 
            setMinute(minute); 
            setSecond(second); 
      } 

      public int getHour() {       return hour; } 
      public void setHour(int hour) { 
            if (hour < 0 || hour > 23) return; 
            this.hour = hour; 
      } 
      public int getMinute() {       return minute; } 
      public void setMinute(int minute) { 
            if (minute < 0 || minute > 59) return; 
            this.minute = minute; 
      } 
      public int getSecond() {       return second; } 
      public void setSecond(int second) { 
            if (second < 0 || second > 59) return; 
            this.second = second; 
      } 

} 