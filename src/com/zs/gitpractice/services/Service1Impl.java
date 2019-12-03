package com.zs.gitpractice.services;

public class Service1Impl implements Service1 {
    private Integer count;

    @Override
    public void Process() {
        System.out.println("Process calling!");
    }
}
