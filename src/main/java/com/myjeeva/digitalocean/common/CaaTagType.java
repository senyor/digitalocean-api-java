/**
 * The MIT License
 * 
 * Copyright (c) 2013-2019 Jeevanandam M. (jeeva@myjeeva.com)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.myjeeva.digitalocean.common;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.annotations.SerializedName;

/**
 * <p>
 * Enumeration of DigitalOcean CAA Tag Types. Valid values are "issue", "issuewild", or "iodef".
 * </p>
 * 
 * <p>
 * More info: https://developers.digitalocean.com/documentation/v2/#domain-records/
 * </p>
 * 
 * @author Jeevanandam M. (jeeva@myjeeva.com)
 * 
 * @since v2.15
 */
public enum CaaTagType {

  @SerializedName("issue")
  ISSUE("issue"),

  @SerializedName("issuewild")
  ISSUE_WILD("issuewild"),

  @SerializedName("iodef")
  IODEF("iodef");

  private String value;

  private CaaTagType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return this.value;
  }

  public static CaaTagType fromValue(String value) {
    if (StringUtils.isBlank(value)) {
      throw new IllegalArgumentException("Value cannot be null or empty!");
    }

    for (CaaTagType rt : CaaTagType.values()) {
      if (value.equalsIgnoreCase(rt.value)) {
        return rt;
      }
    }

    throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
  }
}
