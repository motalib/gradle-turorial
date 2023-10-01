package com.motalib;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class GradleTutorialTest {


    @Test
    public void verifyNoException() throws IOException {
        GradleTutorial.main(new String[] {"en"});
    }
}
