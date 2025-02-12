package datastorage;

import project.annotations.ProcessAPIPrototype;

@ProcessAPIPrototype
public class DataStorageImplement{
	
	public void prototype(DataStorage dataStorage) {
		//store user input 
		DataStoreInput userInput = dataStorage.storeData(new dataToStore());
		
		//retrieve the output 
		DataFetchResult computedData = dataStorage.retrieveData(userInput);
		
	}
	
}