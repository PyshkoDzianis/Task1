package by.pyshkodzianis.task1.creator;

import by.pyshkodzianis.task1.entity.CustomArray;

import java.util.List;

public interface CustomArrayCreator {
    CustomArray createCustomArray(int[] elements);

    CustomArray createCustomArray();

    List<CustomArray> createCustomArrays(List<int[]> arraysElements);

    List<CustomArray> createCustomArraysStream(List<int[]> arraysElements);
}