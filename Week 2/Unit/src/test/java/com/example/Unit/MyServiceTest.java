package com.example.Unit;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Use mock in service
        MyService service = new MyService(mockApi);
        String result = service.fetchData();
        
        verify(mockApi).getData();
        
        // Assert the result
        assertEquals("Mock Data", result);
    }
}
