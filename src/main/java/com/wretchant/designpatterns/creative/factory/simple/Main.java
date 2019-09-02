package com.wretchant.designpatterns.creative.factory.simple;

/** @author Created by 谭健 on 2019/8/20. 星期二. 9:33. © All Rights Reserved. */
public class Main {

  public static void main(String[] args) {
    Color color = ColorFactory.get(ColorEnum.RED);
    color.execute();
  }
}
