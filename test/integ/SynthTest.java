/**
 * Copyright (c) 2016-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.redextest;

public class SynthTest {
  public static void main(String[] args) {
    Alpha a = new Alpha(12);
    Alpha.Beta b = a.new Beta();
    System.out.println("2b = " + b.doublex());
  }
}