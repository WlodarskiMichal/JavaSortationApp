package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

            var actualNames = new ArrayList(Arrays.asList(
                    "Johnson", "Wilson", "Wilkinson", "Abraham", "Dagobert"));
            Collections.sort(actualNames);
            Assert.assertEquals(new ArrayList<>(Arrays.asList(
                    "Abraham", "Dagobert", "Johnson", "Wilkinson", "Wilson")), actualNames);
        }
    
}