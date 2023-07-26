package com.gmail.credentials.app;

public class Store 
{
	
			public void email(String[] mail) 
			{
				
				for(int i=0;i <= mail.length-1;i++) 
				{
					System.out.println(mail[i]);
				}
			}
			
			public void groceryItems(String[] items)
			{
				for(int i=0;i < items.length-1;i++ )
				{
					System.out.println(items[i]);
				}
			}
			
			public void iplTeams(String[] teams)
			{
				for(int i=0;i < teams.length-1;i++)
				{
					System.out.println(teams[i]);
				}
			}
}
