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

package com.myjeeva.digitalocean.http.client.methods;

import java.net.URI;

import org.apache.http.client.methods.HttpPost;

import com.myjeeva.digitalocean.DigitalOcean;

/**
 * Custom delete HTTP client method with Payload support.
 * <p>
 * To begin with {@link DigitalOcean#untagResources(String, java.util.List)} method needs Payload
 * support.
 * </p>
 * 
 * @author Jeevanandam M. (jeeva@myjeeva.com)
 * 
 * @since v2.5
 */
public class CustomHttpDelete extends HttpPost {

  public CustomHttpDelete(URI uri) {
    super(uri);
  }

  public CustomHttpDelete(String url) {
    super(url);
  }

  @Override
  public String getMethod() {
    return "DELETE";
  }

}
