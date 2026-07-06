package com.rudranil;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceVerificationTest {
    @Test
    public void testExternalApi()
    {
        ExternalApi mockApi=Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        String result=service.fetchData();
        verify(mockApi).getData();


    }
}
