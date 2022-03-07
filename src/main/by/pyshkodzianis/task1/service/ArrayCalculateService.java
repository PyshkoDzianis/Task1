package by.pyshkodzianis.task1.service;

import by.pyshkodzianis.task1.entity.CustomArray;
import by.pyshkodzianis.task1.exception.CustomArrayException;

public interface ArrayCalculateService {

    long calculateSumOfArrayElements(CustomArray array) throws CustomArrayException;

    double calculateAverageOfArrayElements(CustomArray array) throws CustomArrayException;

    int calculateAmountOfPositiveArrayElements(CustomArray array);

    int calculateAmountOfNegativeArrayElements(CustomArray array);

    int findMin(CustomArray array) throws CustomArrayException;

    int findMax(CustomArray array) throws CustomArrayException;
}