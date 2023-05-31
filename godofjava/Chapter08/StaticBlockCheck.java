public class StaticBlockCheck {
    public static void main(String[] args) {
        StaticBlockCheck check = new StaticBlockCheck();
//        check.makeStaticBlockObject();
        check.makeStaticBlockObjectWithData();
    }

    public void makeStaticBlockObject() {
        System.out.println("Creating Block1");
        StaticBlock staticBlock = new StaticBlock();
        System.out.println("Created Block1");
        System.out.println("-------------------");
        System.out.println("Creating Block2");
        StaticBlock staticBlock2 = new StaticBlock();
        System.out.println("Created Block2");
    }

    public void makeStaticBlockObjectWithData() {
        System.out.println("data = " + StaticBlock.getData());
        StaticBlock block1 = new StaticBlock();
        block1.data = 1;
        System.out.println("-------------");
        StaticBlock block2 = new StaticBlock();
        block2.data = 2;
        System.out.println("data = " + StaticBlock.getData());
    }
}