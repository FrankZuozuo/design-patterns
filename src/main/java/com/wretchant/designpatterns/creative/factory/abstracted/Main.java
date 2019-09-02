package com.wretchant.designpatterns.creative.factory.abstracted;

import com.wretchant.designpatterns.creative.factory.abstracted.factory.FactoryEnum;
import com.wretchant.designpatterns.creative.factory.abstracted.product.color.Color;
import com.wretchant.designpatterns.creative.factory.abstracted.product.color.ColorEnum;
import com.wretchant.designpatterns.creative.factory.abstracted.product.style.Style;
import com.wretchant.designpatterns.creative.factory.abstracted.product.style.StyleEnum;

/** @author Created by 谭健 on 2019/8/20. 星期二. 9:45. © All Rights Reserved. */
public class Main {

  public static void main(String[] args) {

    AbstractFactory abstractFactory = new AbstractFactory();
    Factory<Color, ColorEnum> colorFactory = abstractFactory.get(FactoryEnum.COLOR);
    Color color = colorFactory.get(ColorEnum.BLUE);
    color.execute();

    Factory<Style, StyleEnum> styleFactory = abstractFactory.get(FactoryEnum.STYLE);
    Style style = styleFactory.get(StyleEnum.CENTER);
    style.execute();
  }
}
