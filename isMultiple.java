import java.io.*;
import java.util.*;
// Read only region start

class UserMainCode
{
  public int isMultiple(int input1,int input2){
    //  Read only region end 
    if(input1==0|| input2==0)
		return 3;
		if(Math.abs(input1)%input2==0)
		return 2;
		return 1;
		//throw new UnsupportedOperationException("isMultiple(int input1,int input2)");
	}
}
