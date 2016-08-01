package com.vivas.collection;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.vivas.dto.User;

import java.util.List;

/**
 * Created by duyot on 8/1/2016.
 */
public class CollectionExample {



    private List<User> removeDuplicateInList(List<User> lstUser){
        return ImmutableSet.copyOf(lstUser).asList();
    }

    public static void main(String[] args) {
        CollectionExample exp = new CollectionExample();
        List<User> lstUser = Lists.newArrayList();
        lstUser.add(new User("duyot"));
        lstUser.add(new User("duyot"));
        System.out.println("Size: "+ exp.removeDuplicateInList(lstUser).size());
    }
}
