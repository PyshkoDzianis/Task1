package by.pyshkodzianis.task1.creator;

import by.pyshkodzianis.task1.entity.CustomArray;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomArrayCreatorImpl implements CustomArrayCreator {
    private static final Logger LOGGER = LogManager.getLogger("CustomArrayReader");

    @Override
    public CustomArray createCustomArray(int[] elements) {
        LOGGER.info("create new CustomArray");
        return elements != null ? new CustomArray(elements) : new CustomArray();
    }

    @Override
    public CustomArray createCustomArray() {
        LOGGER.info("create new CustomArray");
        return new CustomArray();
    }

    @Override
    public List< CustomArray > createCustomArrays(List< int[] > arraysElements) {
        return null;
    }

    @Override
    public List<CustomArray> createCustomArrays(List<int[]> arraysElements) {
        LOGGER.info("create new CustomArray");
        List<CustomArray> customArrays = new ArrayList<>();
        if (arraysElements == null) {
            return customArrays;
        }
        CustomArray currentArray;
        for (int[] elements : arraysElements) {
            currentArray = createCustomArray(elements);
            customArrays.add(currentArray);
        }
        return customArrays;
    }

    @Override
    public List<CustomArray> createCustomArraysStream(List<int[]> arraysElements) {
        LOGGER.info("create new CustomArray using stream");
        return arraysElements.stream()
                .map(this::createCustomArray)
                .collect(Collectors.toList());
    }

}