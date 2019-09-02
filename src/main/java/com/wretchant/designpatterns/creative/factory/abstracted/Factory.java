package com.wretchant.designpatterns.creative.factory.abstracted;

/** @author Created by 谭健 on 2019/8/16. 星期五. 10:19. © All Rights Reserved. */
public interface Factory<T, E> {

  T get(E e);
}
