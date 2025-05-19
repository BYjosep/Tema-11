package com.BYjosep.Exeptions;

import java.io.IOException;

public class FileFoundExeption extends IOException {
    public FileFoundExeption(String message) {
        super(message);
    }
}
