package com.classwork;



public class Methodsquestions {

	
	

public void onetohaundred() { //non parameter with no return type
	for(int a = 1;a<=100;a++) {
	  System.out.println(a);
	}
	System.out.println();
}
      

public int onetohundred(int e) { // parameter with return type
	int sum=0;
	for(int i=1;i<=e;i++) {
		System.out.println(i);
		sum+=i;
	}
	return sum;
	}

		


	public void square() {     // non parameter with no retuen type
	for(int e=1;e<=5;e++) {
	     
	     int square = e*e;
	    
	      System.out.println(square);
	} 	
		    }
	public int addition(int a,int b) {  // parameter with return type
		
		int c=a+b;
		System.out.println("addition of a and b is"+c);
	return c;
	} 
	
	
 public int subs(int a,int b) {
	 int c= a-b;
	   System.out.println(c);
	   return c;
	
}
	
	
	public void multiplyby5() {
	    for (int a = 5; a <= 50; a += 5) { 
	        System.out.println(a);
	    }
	}
	
	    
	   public  void showInfo() {
	        System.out.println("Name:yogendra");
	        System.out.println("Age :25");
	        System.out.println("Course name:CSE");
	        
	    }

	   public void checkEvenodd() {
		   int a=2;
		   if(a%2==0) {
			   System.out.println("number is even");
		   }else
			   System.out.println("number is odd");
	   
		   
	   }
	   public int fact(int a) {
	   int b=1;
		for(int n=1;n<=a;n++) {
			b =b*n;
			System.out.println(b);
		}
	return b;
	   }
	   
	   public String name(String n) {
		
		   System.out.println(n);
	   return n;
	   }
       
   public void name(char n) {
      System.out.println();
   }

   public int greater(int c) {
	  
   if(c==100) {
	    System.out.println(c+"is equals to haundred");
		 }else if(c>100){
		   System.out.println(c+" is greater than hundred");
	   }else 
	     System.out.println(c+"is not greater than hundred");
	return c;
   }
        
     
        
  
   public void voting() {
	int e = 100;	
    
    if(e>=18 && e<=100) {
    	 System.out.println("yor are eligilble for voting");
     }else {
    	  System.out.println("not eligible for voting");
     }}
	
	public int cubeorNot(int cube) {
	for(int o=1;o<=5;o++) {
		cube = o*o*o;
		System.out.println(cube);
	}
	return cube;
}

	public void reverse() {
	int rev = 10;
	    while(rev>=1) {
	    	System.out.println(rev);
	       rev--;
	    }
	}
     public int add() {
	 int sum2=1;
	    int sum1=0;
	    while(sum2<=100) {
	    	sum1=sum1 +sum2;
	       sum2++;
       System.out.println(sum1);
        
	    }
	    return sum1;
     }
	    public void palindrome() {
	    	int y=1331;
	    	int original=y;
	    	int reverse=0;
	    	for(;y>0;y=y/10) {
	    		int digit=y%10;
	    		reverse=reverse*10+digit;
	    	}
	    		if(original==reverse) {
	    			System.out.println("it is palindrome");
	    	}else {
	    		System.out.println("It is not palindromr");
	    	}
	    }
	    		
	    		public int reverseNumber() {
	    			int a=123;
	    			int reve=0;
	    			for(;a>0;a=a/10) {
	    				int digit=a%10;
	    				reve=reve*10+digit;
	    				
	    			}
	    			System.out.println(reve);
	    				return reve;
	    		}
	    		
	    		public void squarePrint() {
	    			for(int i=1;i<=5;i++) {
	    				for(int j=1;j<=i;j++) {
	    					System.out.print("*");
	    				}
	    			System.out.println();
	    			}
	    		}
	    public boolean adult(int age){
	    	
	    if(age==18) {
	    	return true;
	    }else {
	    	return false;
	    }
	
	    }
	    
	    
	   
	    public double half(int n) {
	       return   n / 2.0;
	         
	     
	    }
     public String weekdays(int i) {
    	 
    		 
    			 if(i==1) {
    			 return "Sunday";
    			 }else if(i==2) {
    			 return"Monday";
    			 }else if(i==3) { 
    		     return"Tuesday";
    			 }else if(i==4) {
    			 return"wednesday";
    			 } else if(i==5) {
    			 return"Thursday";
    			 }else if(i==6) {
    			 return"Friday";
    			 }else if(i==7) { 
    			 return "saturday";
    			 }else {
    			 return"invalid";
    		
    			 
    			 }
     }
     public String weather(int a) {
    	 if(a==11||a==12||a==1||a==2) {
    		 return "winter";
    	 }else if(a==3||a==4||a==5||a==6) {
    		 return "Summer";
    	 }else if(a==7||a==8||a==9||a==10) {
    		 return"Monsoon";
    	 }else {
    		 return "invalid";
    	 }
     }
	    
	   

     
     public int evenSum(int n) {
    	
    	        int sum = 0;
    	        for (int i = 1; i <= n; i++) {
    	            if (i % 2 == 0) {
    	                sum = sum + i;
    	            }
    	        }
    	        return sum;
    	    }
     

     public int sumOdd(int n) {
    	    int sum = 0;
    	    for (int i = 1; i <= n; i = i + 2) {
    	        sum = sum + i;
    	    }
    	    return sum;
    	}

}
	
			
	    
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	     
	
	
	
		

	
