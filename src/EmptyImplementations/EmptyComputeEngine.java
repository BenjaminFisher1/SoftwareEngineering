package api;


public class EmptyComputeEngine implements ComputeEngineAPI{
		
		
	    public ProcessJob computeUponThis(ComputeUserInput generalInput) {
	    	
//	    	ProcessJob placeholderProcessJob = new ProcessJob();
	    	
	    	return new ProcessJob(){};
	    }
	    
	   
}

//hello
//gradle stop breaking please