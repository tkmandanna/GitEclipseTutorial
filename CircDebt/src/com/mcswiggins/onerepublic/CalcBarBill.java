package com.mcswiggins.onerepublic;

class CalcBarBill
{

public Barhopper bp1;
public Barhopper bp2;
public Barhopper bp3;
public Barhopper bp4;

public CalcBarBill() {
	// TODO Auto-generated constructor stub
}

public void calcBill()
{
	bp1=new Barhopper("Upee");
	bp2=new Barhopper("ManD");
	bp3=new Barhopper("Karan");
	bp4=new Barhopper("Swaghill");
	
	int no_of_bills=5;
	//for(int i=0;i<no_of_bills;i++)
	//{
	//i=0
	bp2.net_amt=140;
	bp2.net_amt-=41;
	bp1.net_amt-=41;
	bp3.net_amt=-41;
	bp4.net_amt=-16;
	
	//i=1
	bp2.net_amt+=30;
	bp2.net_amt-=(30/4);
	bp1.net_amt-=(30/4);
	bp3.net_amt-=(30/4);
	bp4.net_amt-=(30/4);
	
	//i=2
	
	bp1.net_amt+=50;
	bp2.net_amt-=(50/4);
	bp1.net_amt-=(50/4);
	bp3.net_amt-=(50/4);
	bp4.net_amt-=(50/4);
	
	bp4.net_amt+=71;
	bp2.net_amt-=(71/4);
	bp1.net_amt-=(71/4);
	bp3.net_amt-=(71/4);
	bp4.net_amt-=(71/4);
	
	bp2.net_amt+=21;
	bp4.net_amt-=7;
	bp1.net_amt-=14;
	//}
	System.out.println(bp1.name+" "+bp1.net_amt);
	System.out.println(bp2.name+" "+bp2.net_amt);
	System.out.println(bp3.name+" "+bp3.net_amt);
	System.out.println(bp4.name+" "+bp4.net_amt);
}

}
