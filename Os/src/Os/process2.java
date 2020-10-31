package Os;

public class process2 extends Simulator implements Runnable{
	 public String getProcess2Id() {
		return process2Id;
	}

	final String process2Id="2"; 
	
	@Override
	public void run() {
        try{ print("Process 2:");
           print("Please, Enter the filename with the extension. All extensions are acceptable (i.e. 'OS.ppt')");
        	String filename=TakeInput();
        	print("Please, Enter the Data you want to write in the file above");
        	String data=TakeInput();
        	WriteFile(data, filename);
        	} 
        catch (Exception e) { 
            print ("The filename is missing or The Data entered is incompitable"); 
        } 
    }
}


 
 
