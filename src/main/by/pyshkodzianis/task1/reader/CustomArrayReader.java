package by.pyshkodzianis.task1.reader;

import by.pyshkodzianis.task1.exception.CustomArrayException;

public interface CustomArrayReader {
    String readCustomArrayFromFile(String path) throws CustomArrayException;
}