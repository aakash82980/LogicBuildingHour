import java.io.*;
import java.util.*;
// Read only region start

class UserMainCode
{
  public int secondLastDigitOf(int input1){
    //  Read only region end 
    if(Math.abs(input1)/10==0)
		return -1;
		return (Math.abs(input1)/10)%10;
	}
}
