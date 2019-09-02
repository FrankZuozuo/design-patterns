package com.wretchant.designpatterns.behavioral.strategy.simple;

/** @author Created by 谭健 on 2019/8/22. 星期四. 17:46. © All Rights Reserved. */
public class Main {

  public static void main(String[] args) {

    int i = new Context(new Add()).doOperation(1, 2);
    System.out.println(i);
  }
}
