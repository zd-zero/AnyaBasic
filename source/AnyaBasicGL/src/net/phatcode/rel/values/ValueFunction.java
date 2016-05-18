package net.phatcode.rel.values;

import net.phatcode.rel.expressions.Expression;
import net.phatcode.rel.parselets.Statement;

import java.util.List;

/*********************************************************************************
 * Created by relminator
 * <p>
 * Richard Eric Lope BSN RN
 * http://rel.phatcode.net
 * Started: 4/21/2016
 * Ended: Ongoing
 * <p>
 * License MIT:
 * Copyright (c) 2016 Richard Eric Lope
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software. (As clarification, there is no
 * requirement that the copyright notice and permission be included in binary
 * distributions of the Software.)
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *******************************************************************************/

public class ValueFunction implements Value
{

    private String name;
    private List<String> variables; // parameters and local variable names
    private Statement block;
    public ValueFunction( String name,
                          List<String> variables,
                          Statement block)
    {
        this.name = name;
        this.variables = variables;
        this.block = block;
    }
    @Override
    public double toNumber()
    {
        return 0;
    }

    @Override
    public int toInteger()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return name;
    }

    @Override
    public boolean toBoolean()
    {
        return false;
    }

    @Override
    public List<Expression> toArray()
    {
        return null;
    }

    @Override
    public Value evaluate()
    {
        return this;
    }

    public List<String> getVariables()
    {
        return variables;
    }
    public Statement getBlock()
    {
        return block;
    }
}
