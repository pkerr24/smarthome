/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.library.types;

import java.util.Objects;

import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.PrimitiveType;
import org.eclipse.smarthome.core.types.State;

public class StringType implements PrimitiveType, State, Command {

    public final static StringType EMPTY = new StringType();

    private final String value;

    public StringType() {
        this("");
    }

    public StringType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return toFullString();
    }

    @Override
    public String toFullString() {
        return value;
    }

    public static StringType valueOf(String value) {
        return new StringType(value);
    }

    @Override
    public String format(String pattern) {
        return String.format(pattern, value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            return obj.equals(value);
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        StringType other = (StringType) obj;
        return Objects.equals(this.value, other.value);
    }

}
