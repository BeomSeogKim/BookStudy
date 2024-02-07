package chapter02.item01;

public class Post {
    private String author;
    private boolean prime;  // 프리미엄이 붙은 게시글
    private boolean ad; // 광고가 붙은 게시글

    /*
    * 프리미엄이 붙은 게시글 생성자 => 하지만 생성자를 사용한다면 의도가 불분명하다.
    public Post(String author) {
        this.author = author;
        this.prime = true;
    }

    광고가 붙은 게시글
    생성자의 경우 이미 존재하는 Method Signature 로 인해 재사용이 불가능하다.
    만약 Method Signature 문제를 피하기 위해 순서를 변경한다면 (파라미터가 두개 이상일 때) 더욱 혼동을 가져다 준다.
    public Post(String author) {
        this.author = author;
        this.ad = true;
    }
     */

    /*
     * 정적 팩터리 메서드를 사용할 경우 보다 명확하게 생성 의도를 파악할 수 있다.

    private Post() {
    }

    public static Post primePost(String author) {
        Post post = new Post();
        post.author = author;
        post.prime = true;

        return post;
    }

    public static Post adPost(String author) {
        Post post = new Post();
        post.author = author;
        post.ad = true;

        return post;
    }
     */
}
