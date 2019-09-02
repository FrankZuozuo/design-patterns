package com.wretchant.designpatterns.creative.builder;

/** @author Created by 谭健 on 2019/8/19. 星期一. 9:49. © All Rights Reserved. */
public class StringBuilder extends AbstractStringBuilder {

  public StringBuilder() {
    super(16);
  }

  @Override
  public String toString() {
    // Create a copy, don't share the array
    return new String(value, 0, count);
  }
}
