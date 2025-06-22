/*******************************************************************************
 * MIT License
 *
 * Copyright (c) 2019 Softblue
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *******************************************************************************/
package collections.ordered;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<Character> alfabeto = new TreeSet<>();
		alfabeto.add('F');
		alfabeto.add('E');
		alfabeto.add('A');
		alfabeto.add('C');
		alfabeto.add('B');
		alfabeto.add('D');
		
		System.out.println(alfabeto);
		
		Mes m1 = new Mes("Janeiro", 1);
		Mes m2 = new Mes("Abril", 4);
		Mes m3 = new Mes("Fevereiro", 2);
		Mes m4 = new Mes("Mar�o", 3);
		Mes m5 = new Mes("Janeiro", 1);
		
		Set<Mes> meses = new TreeSet<>();
		meses.add(m1);
		meses.add(m2);
		meses.add(m3);
		meses.add(m4);
		meses.add(m5);
		
		System.out.println(meses);
		
		Set<Character> alfabetoInv = new TreeSet<>(new InverseComparator());
		alfabetoInv.add('F');
		alfabetoInv.add('E');
		alfabetoInv.add('A');
		alfabetoInv.add('C');
		alfabetoInv.add('B');
		alfabetoInv.add('D');
		System.out.println(alfabetoInv);
	}
}
