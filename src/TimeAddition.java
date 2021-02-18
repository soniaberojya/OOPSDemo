
public class TimeAddition 
{
	int hr,min,sec,day=0;
	
	TimeAddition(int hr,int min, int sec)
	{
		this.hr = hr;
		this.min = min;
		this.sec = sec;
				
	}
	void addition(TimeAddition t2)
	{
		this.sec += t2.sec;
		this.min += t2.min;
		this.hr += t2.hr;
		
		while(this.sec>=60)
		{
			this.sec = this.sec - 60;
			this.min ++;
		}
		while(this.min>=60)
		{
			this.min = this.min - 60;
			this.hr ++;
		}
		while(this.hr>24)
		{
			this.hr = this.hr-24;
			day++;
		}
		
	}
	void display()
	{
		System.out.println("total time = "+day+"days"+this.hr+":"+this.min+":"+this.sec);
	}
	

	public static void main(String[] args) 
	{
		TimeAddition t1 = new TimeAddition(24,45,60);
		TimeAddition t2 = new TimeAddition(2,55,05);
		
		t1.addition(t2);
		t1.display();
		

	}

}
