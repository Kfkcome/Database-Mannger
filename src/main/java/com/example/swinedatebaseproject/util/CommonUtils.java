package com.example.swinedatebaseproject.util;


import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author 刘铭康
 * @Date 2022/11/14
 */
public class CommonUtils {
    public static Map<String, String> fromStringToMap(String s) {
        return null;
    }


    public static void main(String[] args) throws InterruptedException {


        int[] ints = (int[]) Array.newInstance(int.class, 1);
        int i = (int) Array.get(ints, 0);
        System.out.println(i);
    }

}
