package com.klaperetart.genereatepdf.service;

/**
 * @author tritr
 * @since 1/11/2024
 */

import java.util.Map;

public interface PdfGenerateService {
    void generatePdfFile(String templateName, Map<String, Object> data, String pdfFileName);
}