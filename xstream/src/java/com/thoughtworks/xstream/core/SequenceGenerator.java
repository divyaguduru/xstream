/*
 * Copyright (C) 2004 Joe Walnes.
 * Copyright (C) 2006, 2007, 2008, 2014 XStream Committers.
 * All rights reserved.
 *
 * The software in this package is published under the terms of the BSD
 * style license a copy of which has been included with this distribution in
 * the LICENSE.txt file.
 * 
 * Created on 16. March 2004 by Joe Walnes
 */
package com.thoughtworks.xstream.core;

public class SequenceGenerator implements ReferenceByIdMarshaller.IDGenerator {

    private int counter;

    public SequenceGenerator(final int startsAt) {
        counter = startsAt;
    }

    @Override
    public String next(final Object item) {
        return String.valueOf(counter++);
    }

}
