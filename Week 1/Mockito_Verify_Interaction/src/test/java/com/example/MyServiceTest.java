package com.example;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    void fetchData_callsExternalApi_getData_once() {
        ExternalApi externalApi = mock(ExternalApi.class);
        MyService service = new MyService(externalApi);

        service.fetchData();

        verify(externalApi, times(1)).getData();
    }
}

