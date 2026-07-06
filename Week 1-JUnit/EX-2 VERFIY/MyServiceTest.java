package com.example.mockito;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        // Arrange

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("VERFYING EXAMPLE");

        MyService service = new MyService(mockApi);

        // Act

        String result = service.fetchData();

        System.out.println("Returned Data : " + result);

        // Assert (Verification)

        verify(mockApi).getData();

        System.out.println("Verification Successful");

    }
}