package com.tmessinis.graph.command.factory;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tmessinis.graph.constraint.Type;
import com.tmessinis.graph.constraint.factory.ConstraintFactory;
import com.tmessinis.graph.constraint.factory.ConstraintFactoryImpl;
import com.tmessinis.graph.contstraint.Constraint;
import com.tmessinis.graph.contstraint.ConstraintImpl;
import com.tmessinis.graph.contstraint.Operator;


public class ConstraintFactoryTest {

    ConstraintFactory constraintFactory = new ConstraintFactoryImpl();


    @Test
    public void testConstraintFactoryDistance() {
        Constraint constraint = constraintFactory.parseConstraint("DISTANCE < 3");
        ConstraintImpl constraintManuallyCreated = new ConstraintImpl();
        constraintManuallyCreated.setType(Type.DISTANCE);
        constraintManuallyCreated.setOperator(Operator.LESS_THAN);
        constraintManuallyCreated.setcValue(3);
        assertEquals(constraintManuallyCreated.getType(), constraint.getType());
        assertEquals(constraintManuallyCreated.getOperator(), constraint.getOperator());
        assertEquals(constraintManuallyCreated.getcValue(), constraint.getcValue());
    }
}
