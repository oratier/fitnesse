// Copyright (C) 2003-2009 by Object Mentor, Inc. All rights reserved.
// Released under the terms of the CPL Common Public License version 1.0.
package fitnesse.slim.converters;

import fitnesse.util.StringUtils;

import fitnesse.slim.Converter;

public class IntConverter implements Converter<Integer> {
  @Override
  public String toString(Integer o) {
    return o != null ? o.toString() : NULL_VALUE;
  }

  @Override
  public Integer fromString(String arg) {
    return !StringUtils.isBlank(arg) ? Integer.valueOf(arg) : null;
  }
}
