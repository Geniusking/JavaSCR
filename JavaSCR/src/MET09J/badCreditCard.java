// The MIT License (MIT)
// 
// Copyright (c) 2016 Robert C. Seacord
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.

package MET09J;

import java.util.HashMap;
import java.util.Map;

final class badCreditCard {
	  private final int number;
	 
	  private badCreditCard(int number) {
	    this.number = number;
	  }
	 
	  public boolean equals(Object o) {
	    if (o == this) {
	      return true;
	    }
	    if (!(o instanceof badCreditCard)) {
	      return false;
	    }
	    badCreditCard cc = (badCreditCard)o;
	    return cc.number == number;
	  }
	 
	  public static void main(String[] args) {
	    Map<badCreditCard, String> m = new HashMap<badCreditCard, String>();
	    m.put(new badCreditCard(100), "4111111111111111");
	    // The expected retrieved value is 4111111111111111; 
	    // the actual retrieved value is null.
	    System.out.println(m.get(new badCreditCard(100))); 
	  }
	}