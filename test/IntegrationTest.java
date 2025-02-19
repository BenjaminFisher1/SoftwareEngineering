package api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;


public class IntegrationTest {

    @Test
    public void testIntegration() {
        // setup input and output configurations
        InMemoryInputConfig inputConfig = new InMemoryInputConfig();
        inputConfig.inputs.addAll(List.of(1, 10, 25));

        InMemoryOutputConfig outputConfig = new InMemoryOutputConfig();

        // initialize components
        DataStorage dataStorage = new DataStorageImpl();
        ComputeEngineAPI computeAPI = new ComputeEngineAPIImpl();

        // store input data
        DataStoreRequest request = new DataStoreRequest();
        DataStoreInput input = dataStorage.storeData(request);

        // perform computation
        ProcessJob result = computeAPI.computeUponThis(new ComputeUserInput());
        DataRetrieveComputed computed = dataStorage.retrieveData(input);

        // validate results
        assertNotNull(result, "ProcessJob result should not be null");
        assertNotNull(computed, "Retrieved computed data should not be null");
    }
}
