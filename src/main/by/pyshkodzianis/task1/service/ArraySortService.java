package by.pyshkodzianis.task1.service;


import by.pyshkodzianis.task1.entity.CustomArray;

public interface ArraySortService {
    void bubbleSort(CustomArray array);

    void quickSort(CustomArray array);

    void insertionSort(CustomArray array);
}