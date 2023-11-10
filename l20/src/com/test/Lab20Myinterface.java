package com.test;

import com.interfaces.MyGenericInterface;
import com.interfaces.MyInterface;

public class Lab20Myinterface {

	public static void main(String[] args) {
		// return max value
				MyInterface ob=(x,y)->{return(x>y?x:y);};
				System.out.println("max value is "+ob.compare(22, 23));
				
				//for use Integer class 
				MyGenericInterface<Integer> ob1=(x,y)->{return(x>y?x:y);};
				System.out.println("max value is "+ob1.compare(57, 55));
				
				//for compare string 
				MyGenericInterface<String> ob2=(x,y)->
				{
					int ans=x.compareTo(y);
					if(ans>0)
					{
						return x;
					}
					return y;
				};
				System.out.println(ob2.compare("aaa", "baa"));

	}

}
