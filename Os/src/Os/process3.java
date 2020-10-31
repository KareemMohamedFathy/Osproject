package Os;


public class process3 extends Simulator implements Runnable{
    public String getProcess3Id() {
		return process3Id;
	}

	final String process3Id="3"; 
	
	@Override
	public void run() {
        try{ 
        	print("Process 3:");
        	for (int i = 0; i <301; i++) {
        		print(i);
        	}
        	} 
        catch (Exception e) { 
            print("Memory is insufficient"); 
        } 
    } 

}
