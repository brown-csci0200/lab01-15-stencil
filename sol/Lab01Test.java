package sol;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.FuncList;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lab01Test {

    private FuncList toFuncList(Object... args) {
        FuncList FuncListBuilder = new FuncList();
        for (int i = args.length - 1; i >= 0; i--) {
            FuncListBuilder = FuncListBuilder.link(args[i]);
        }
        return FuncListBuilder;
    }

    @Test
    public void testExample() {
        Assert.assertEquals(2, 1 + 1);
    }

}
