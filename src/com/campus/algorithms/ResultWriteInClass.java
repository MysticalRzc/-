package com.campus.algorithms;

import com.campus.structural.Employer;
import com.campus.structural.Work;

public class ResultWriteInClass {
	public void employerResultWriteIn(double message[][],int num,Employer employer){
		if(num>=10)
		{
			int list [] = employer.getWorkIndexList();
			employer.setListLength(10);
			 for(int i =0;i<2;i++)
			 {	
				 int index = (int)(Math.random()*(num*0.2));
			//	 System.out.println(">>>>"+index);
				 if(message[index][2]==0)
					 list[i] = (int)message[index][1];
				 else
					 i--;
			 }
			 for(int i =8;i<10;i++)
			 {	
				 int index = (int)(Math.random()*(num*0.2)+num*0.8);
			//	 System.out.println(">>>>"+index);
				 if(message[index][2]==0)
					 list[i] = (int)message[index][1];
				 else
					 i--;
			 }
			 for(int i =2;i<8;i++)
			 {	
				 int index = (int)(Math.random()*(num*0.6)+num*0.2);
			//	 System.out.println(">>>>"+index);
				 if(message[index][2]==0)
					 list[i] = (int)message[index][1];
				 else
					 i--;
			 }
		}
		else
		{
			employer.setListLength(num);
			int list [] = employer.getWorkIndexList();
			for(int i = 0 ;i<num;i++)
			{
				list[i]= (int )message[i][1]; 
				message[i][2]=0;
			}
		}
		
	}
	public void workResultWriteIn(double message[][],int num,Work work){
		if(num>=10)
		{
			int list [] = work.getEmployerIndexList();
			work.setListLength(10);
			 for(int i =0;i<2;i++)
			 {	
				 int index = (int)(Math.random()*(num*0.2));
				 if(message[index][2]==0)
					 list[i] = (int)message[index][1];
				 else
					 i--;
			 }
			 for(int i =8;i<10;i++)
			 {	
				 int index = (int)(Math.random()*(num*0.2)+num*0.8);
				 if(message[index][2]==0)
					 list[i] = (int)message[index][1];
				 else
					 i--;
			 }
			 for(int i =2;i<8;i++)
			 {	
				 int index = (int)(Math.random()*(num*0.6)+num*0.2);
				 if(message[index][2]==0)
					 list[i] = (int)message[index][1];
				 else
					 i--;
			 }
		}
		else
		{
			work.setListLength(num);
			int list [] = work.getEmployerIndexList();
			for(int i = 0 ;i<num;i++)
			{
				list[i]= (int )message[i][1]; 
				message[i][2]=0;
			}
		}
	}
}
