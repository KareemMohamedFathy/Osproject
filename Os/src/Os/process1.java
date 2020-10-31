package Os;

public class process1 extends Simulator implements Runnable{
	 public String getProcess1Id() {
		return process1Id;
	}

	final String process1Id="1"; 
	
	@Override
	public void run() {
        try{
        	print("Process 1:");
        	print("Please, Enter the filename with the extension. (i.e. 'OS.txt')");
        	PrintFile(TakeInput());
        } 
        catch (Exception e) { 
            print("File Not Found"); 
        } 
    } 


	
}
