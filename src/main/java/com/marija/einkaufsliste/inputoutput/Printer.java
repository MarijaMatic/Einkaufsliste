package com.marija.einkaufsliste.inputoutput;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
@Slf4j
public class Printer {

    public void printEinkaufsliste() {
    }

    public void sendToPhone() {
        File file = generatePdf();
    }

    public File generatePdf() {
        return new File("");
    }
}
