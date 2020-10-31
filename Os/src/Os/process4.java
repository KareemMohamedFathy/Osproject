package Os;


public class process4 extends Simulator implements Runnable{
	 public String getProcess4Id() {
		return process4Id;
	}

	final String process4Id="4"; 
	
	@Override
	public void run() {
        try{ print("Process 4:");
        	for (int i = 500; i <=1000; i++) {
        		print(i);
            	}
        	} 
        catch (Exception e) { 
            print("Memory is insufficient"); 
        } 
    } 
}
