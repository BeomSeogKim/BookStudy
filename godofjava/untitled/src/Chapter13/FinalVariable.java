package Chapter13;

public class FinalVariable {
    final int instanceVariable = 1;

    public void method(final int parameter) {
        final int localVariable;
        localVariable = 2;
//        localVariable = 3;
    }
}
