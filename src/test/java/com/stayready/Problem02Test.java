package com.stayready;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Problem02Test {
    @Test
    public void findLongestConseSequTest(){
        int arr[] = {10, 12, 11};
        Problem02 problem02 = new Problem02();
        String expected = "Length of the longest contiguous subarray is 3";
        String actual = "Length of the longest contiguous subarray is " + problem02.findLongestConseSequ(arr);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findLongestConseSequ2Test(){
        int arr[] = {14, 12, 11, 20};
        Problem02 problem02 = new Problem02();
        String expected = "Length of the longest contiguous subarray is 2";
        String actual = "Length of the longest contiguous subarray is "+ problem02.findLongestConseSequ(arr);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findLongestConseSequ3Test(){
        int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};;
        Problem02 problem02 = new Problem02();
        String expected = "Length of the longest contiguous subarray is 5";
        String actual = "Length of the longest contiguous subarray is " + problem02.findLongestConseSequ(arr);
        Assert.assertEquals(expected,actual);
    }

}