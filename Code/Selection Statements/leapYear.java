public class leapYear {
    public static void main(String[] args) {
        
		int week, month, day, year,dayLeft = -1;
		String monthStr,weekStr;
		
		month = Integer.parseInt(args[0]);
		day = Integer.parseInt(args[1]);
		year = Integer.parseInt(args[2]);
		
		weekStr = WEEK(year,month,day);
		
		//System.out.println( "Week: " + weekStr);
		
		switch (month){
			
			case 1:  monthStr = "January";
                     break;
            case 2:  monthStr = "February";
                     break;
            case 3:  monthStr = "March";
                     break;
            case 4:  monthStr = "April";
                     break;
            case 5:  monthStr = "May";
                     break;
            case 6:  monthStr = "June";
                     break;
            case 7:  monthStr = "July";
                     break;
            case 8:  monthStr = "August";
                     break;
            case 9:  monthStr = "September";
                     break;
            case 10: monthStr = "October";
                     break;
            case 11: monthStr = "November";
					 if(day != 1)
						dayLeft = 62 - day;
                     break;
            case 12: monthStr = "December";
					 dayLeft = 32 - day;
                     break;
            default: monthStr = "OPPS!!!";
                     break;
		
		}
		
		System.out.println(weekStr + " - " + monthStr+" "+day+", "+year);
		
		if (year%400 == 0)
			System.out.println( year +" is a leap year.");
		else if (year%4 == 0 && year%100 != 0 )
			System.out.println( year +" is a leap year.");
		else
			System.out.println( year +" is NOT a leap year.");
			
		if (dayLeft != -1)
			System.out.println( "There are "+ dayLeft +" days left in the year");
			
		
    }
	
	static String WEEK(int y,int m,int d)
     {
          if(m==1) {m=13;y--;}
          if(m==2) {m=14;y--;}
          int week=(d+2*m+3*(m+1)/5+y+y/4-y/100+y/400)%7;
          String weekstr="";
          switch(week)
          {
              case 0: weekstr="Mon"; break;
              case 1: weekstr="Tue"; break;
              case 2: weekstr="Wed"; break;
              case 3: weekstr="Thu"; break;
              case 4: weekstr="Fri"; break;
              case 5: weekstr="Sat"; break;
              case 6: weekstr="Sun"; break;
           }
           return weekstr; 
      }
	
}

