package com.klaperetart.genereatepdf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author tritr
 * @since 1/11/2024
 */

@SpringBootTest
class PdfGeneratorRunnerTest {

    @Autowired
    private PdfGeneratorRunner pdfGeneratorRunner;

    @Test
    void run() throws Exception {
        pdfGeneratorRunner.run("");
    }
}