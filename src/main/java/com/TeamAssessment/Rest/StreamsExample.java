package com.TeamAssessment.Rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsExample {

    private static final Logger logger = LoggerFactory.getLogger(StreamsExample.class);

    public static void findDuplicates(List<Integer> integerList){
        Set<Integer> integerSet = new HashSet<>();
        List <Integer> duplicates = integerList.stream().filter(i->!integerSet.add(i))
                .collect(Collectors.toList());
        if(duplicates.isEmpty())
            logger.info("No Duplicates found");
        else
            logger.info("Duplicates : "+duplicates);
    }

    public static void removeDuplicates(List<Integer> integerList){
        List<Integer> distinctList = integerList.stream().distinct().collect(Collectors.toList());
        logger.info("Distinct List: " + distinctList);
    }

   public static void minMaxElement(List<Integer> integerList, String version){
       int maxValue=integerList.get(0);
       int minValue=integerList.get(0);
        if(version != null && version.equals("Streams")){
            minValue = integerList.stream().min(Integer::compareTo).get();
            maxValue = integerList.stream().max(Integer::compareTo).get();
        } else {
            for(int i :integerList){
                if(i < minValue) {
                    minValue = i;
                } else if (i > maxValue){
                    maxValue = i;
                }

            }
        }
       logger.info("Minimum Value ("+ version +") :" + minValue);
       logger.info("Maximum Value ("+ version +") :" + maxValue);
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        findDuplicates(list);
        List<Integer> list1 = Arrays.asList(4,5,7,8,99,100,101,33,32,4,4);
        removeDuplicates(list1);
        List<Integer> list2 = Arrays.asList(3,90,350,5);
        minMaxElement(list2,"Java8");
        List<Integer> list3 = Arrays.asList(6, 8, 3, 5, 1, 9 );
        minMaxElement(list3,"Streams");
    }

}
