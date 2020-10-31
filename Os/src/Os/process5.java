package Os;

public class process5 extends Simulator implements Runnable{
	 public String getProcess5Id() {
		return process5Id;
	}

	final String process5Id="5"; 
	
	@Override
	public void run() {
        try{ 
        	print("Process 5:");
        print("Please, Enter the minimum number");
        	int a=Integer.parseInt(TakeInput());
            print("Please, Enter the maximum number");

        	int b=Integer.parseInt(TakeInput());
        	
        	String s="";
        	for (int i =a; i <=b; i++) {
        	s+=i;
        	s+="\n"; 
        	}
        	WriteFile(s,"count.txt");
        	} 
        catch (Exception e) { 
           print ("The Data entered is incompitable or Time limit exceeded"); 
        } 
    } 	

}
