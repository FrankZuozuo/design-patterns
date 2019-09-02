package com.wretchant.designpatterns.behavioral.command;

import com.google.common.collect.Lists;

import java.util.List;

/** @author Created by 谭健 on 2019/8/16. 星期五. 11:39. © All Rights Reserved. */
public class Invoker {

  private List<Command> commands;

  public Invoker(Command... commands) {
    this.commands = Lists.newArrayList(commands);
    this.commands.forEach(Command::execute);
  }
}
