package com.vivas.collection;

import com.google.common.base.Predicates;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.*;
import com.vivas.dto.User;

import java.util.List;
import java.util.Map;

/**
 * Created by duyot on 8/1/2016.
 */
public class CollectionExample {

    public void testString(){
        System.out.println(Strings.isNullOrEmpty(""));
        Splitter.on(",").trimResults().omitEmptyStrings();
        Ordering.natural();
    }
    //
    public    void testList(){
        List<User> lstUser = Lists.newArrayList();
    }

    public static   void testMap(){
        //init map
        Map<String,String> map = Maps.newHashMap();
        //table
        Table<String,String,Integer> distance = HashBasedTable.create();
        distance.put("London", "Paris", 340);
        distance.put("New York", "Los Angeles", 3940);
        distance.put("London", "New York", 5576);
        //remove null from lít
        List<String> names = Lists.newArrayList("John", null, "Adam", null, "Jane");
        Iterables.removeIf(names, Predicates.isNull());
    }


    private List<User> removeDuplicateInList(List<User> lstUser){
        return ImmutableSet.copyOf(lstUser).asList();
    }

    public static void main(String[] args) {
        testMap();

    }
}
