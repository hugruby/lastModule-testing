package org.bedu.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class InterviewerServiceTest {
    @Autowired
    private InterviewerService service;

    @Test
    @DisplayName("Service should be injected")
    public void smokeTest(){
        assertNotNull(service);
    }

}