package Chapter21;

public class GenericSample {
    public static void main(String[] args) {
        GenericSample genericSample = new GenericSample();
        genericSample.checkCastingDTO();
        genericSample.checkGenericDTO();
    }

    public void checkCastingDTO() {
        CastingDTO dto1 = new CastingDTO();
        dto1.setObject(new String());

        CastingDTO dto2 = new CastingDTO();
        dto2.setObject(new StringBuffer());

        CastingDTO dto3 = new CastingDTO();
        dto3.setObject(new StringBuilder());

        // instanceof 를 활용해 점검
        Object tempObject = dto1.getObject();
        if (tempObject instanceof StringBuilder) {
            System.out.println("StringBuilder");
        } else if (tempObject instanceof StringBuffer) {
            System.out.println("StringBuffer");
        }

    }

    private void checkGenericDTO() {
        CastingGenericDTO<String> dto1 = new CastingGenericDTO<>();
        dto1.setObject(new String());
        CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<>();
        dto2.setObject(new StringBuffer());
        CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<>();
        dto3.setObject(new StringBuilder());

        // 그냥 가져오면 된다.
        String object1 = dto1.getObject();
        StringBuffer object2 = dto2.getObject();
        StringBuilder object3 = dto3.getObject();

    }
}
