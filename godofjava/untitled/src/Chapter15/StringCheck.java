package Chapter15;

public class StringCheck {
    public static void main(String[] args) {
        StringCheck stringCheck = new StringCheck();
        String addresses[] = new String[]{
                "서울시 구로구 신도림동",
                "경기도 성남시 분당구 정자동 개발 공장",
                "서울시 구로구 개봉동"
        };
        stringCheck.checkAddress(addresses);
        stringCheck.containsAddress(addresses);
        stringCheck.checkMatch();
        stringCheck.checkIndexOf();
        stringCheck.checkLastIndexOf();
        stringCheck.checkSubstring();
    }

    public void checkAddress(String[] addresses) {
        int startCount = 0, endCount = 0;
        String startText = "서울시";
        String endText = "동";
        for (String address : addresses) {
            if (address.startsWith(startText)) {
                startCount++;
            }
            if (address.endsWith(endText)) {
                endCount++;
            }
        }
        System.out.println("Starts with " + startText +" count is " + startCount);
        System.out.println("Ends with " + endText + " count is " + endCount);
    }

    public void containsAddress(String[] addresses) {
        int containCount = 0;
        String containsText = "구로";
        for (String address : addresses) {
            if (address.contains(containsText)) {
                containCount++;
            }
        }
        System.out.println("Contains " + containsText + " count is " + containCount);
    }

    public void checkMatch() {
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "This";
        System.out.println(text.regionMatches(2, compare1, 0, 1));
        System.out.println(text.regionMatches(5, compare1, 0, 2));
        System.out.println(text.regionMatches(true, 0, compare2, 0, 4));
    }

    public void checkIndexOf() {
        String text = "Java technology is both a programming language and a platform.";
        System.out.println(text.indexOf("a"));
        System.out.println(text.indexOf("a "));
        System.out.println(text.indexOf("a", 20));
        System.out.println(text.indexOf("a ", 20));
        System.out.println(text.indexOf('z'));
    }

    public void checkLastIndexOf() {
        String text = "Java technology is both a programming language and a platform.";
        System.out.println(text.lastIndexOf("a"));
        System.out.println(text.lastIndexOf("a "));
        System.out.println(text.lastIndexOf("a", 20));
        System.out.println(text.lastIndexOf("a ", 20));
        System.out.println(text.lastIndexOf('z'));

    }

    public void checkSubstring() {
        String text = "Java technology";
        String technology = text.substring(5);
        System.out.println(technology);
        String tech = text.substring(5, 9);
        System.out.println(tech);
    }
}
