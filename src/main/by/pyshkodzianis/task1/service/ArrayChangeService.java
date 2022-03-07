package by.pyshkodzianis.task1.service;

import by.pyshkodzianis.task1.entity.CustomArray;
import by.pyshkodzianis.task1.exception.CustomArrayException;

public interface ArrayChangeService {
    void replaceAll(CustomArray array, int value, int replacement) throws CustomArrayException;

    void replaceAllGreaterThanValue(CustomArray array, int value, int replacement) throws CustomArrayException;

    void replaceAllLessThanValue(CustomArray array, int value, int replacement) throws CustomArrayException;

    void replaceAllNegative(CustomArray array, int replacement) throws CustomArrayException;

    void replaceAllStream(CustomArray array, int value, int replacement) throws CustomArrayException;

    void replaceAllGreaterThanValueStream(CustomArray array, int value, int replacement) throws CustomArrayException;

    void replaceAllLessThanValueStream(CustomArray array, int value, int replacement) throws CustomArrayException;

    void replaceAllNegativeStream(CustomArray array, int replacement) throws CustomArrayException;
}