package jvm.command.item.impl;

import jvm.classfile.ClassFile;
import jvm.command.CommandIterator;
import jvm.command.item.NoOperandCmd;
import jvm.engine.ExecutionResult;
import jvm.engine.JavaObject;
import jvm.engine.StackFrame;

/**
 * Created by Haochen on 2017/4/20.
 * TODO:
 */
public class ILoad1Cmd extends NoOperandCmd {
    public ILoad1Cmd(ClassFile clzFile, String opCode, CommandIterator iterator) {
        super(clzFile, opCode, iterator);
    }

    @Override
    public String toString() {
        return this.getOffset() + ": " + this.getReadableCodeText();
    }

    @Override
    public void execute(StackFrame frame, ExecutionResult result) {
        JavaObject object = frame.getLocalVariableValue(1);
        frame.getOperandStack().push(object);
    }
}
