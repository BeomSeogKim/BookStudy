package Chapter21;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample wildcardSample = new WildcardSample();
        wildcardSample.callWildcardMethod();
    }

    private void callWildcardMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard("A");
        wildcardStringMethod(wildcard);
    }

    private void wildcardStringMethod(WildcardGeneric<String> c) {
        String value = c.getWildcard();
        System.out.println(value);
    }
}
