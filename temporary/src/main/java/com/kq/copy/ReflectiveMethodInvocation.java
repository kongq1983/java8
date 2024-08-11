package com.kq.copy;

import java.util.Arrays;

/**
 * @author kq
 * @date 2020-10-13 10:39
 * @since 2020-0630
 */
public class ReflectiveMethodInvocation implements Cloneable {

    private int currentInterceptorIndex = -1;

    protected Object[] arguments = new Object[0];

    public int getCurrentInterceptorIndex() {
        return currentInterceptorIndex;
    }

    public void setCurrentInterceptorIndex(int currentInterceptorIndex) {
        this.currentInterceptorIndex = currentInterceptorIndex;
    }

    public Object[] getArguments() {
        return arguments;
    }

    public void setArguments(Object[] arguments) {
        this.arguments = arguments;
    }

    public void proceed(){
        currentInterceptorIndex++;
    }

    public ReflectiveMethodInvocation invocableClone() {
        // Force initialization of the user attributes Map,
        // for having a shared Map reference in the clone.

        // Create the MethodInvocation clone.
        try {
            ReflectiveMethodInvocation clone = (ReflectiveMethodInvocation) clone();
            return clone;
        }
        catch (CloneNotSupportedException ex) {
            throw new IllegalStateException(
                    "Should be able to clone object of type [" + getClass() + "]: " + ex);
        }
    }

    public ReflectiveMethodInvocation invocableClone(Object... arguments) {
        // Force initialization of the user attributes Map,
        // for having a shared Map reference in the clone.

        // Create the MethodInvocation clone.
        try {
            ReflectiveMethodInvocation clone = (ReflectiveMethodInvocation) clone();
            clone.arguments = arguments;
            return clone;
        }
        catch (CloneNotSupportedException ex) {
            throw new IllegalStateException(
                    "Should be able to clone object of type [" + getClass() + "]: " + ex);
        }
    }

    @Override
    public String toString() {
        return "ReflectiveMethodInvocation{" +
                "currentInterceptorIndex=" + currentInterceptorIndex +
                ", arguments=" + Arrays.toString(arguments)  +",arguments="+arguments+
                '}';
    }
}
