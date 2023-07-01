package hello.core.singleton;

public class SingletonService {

    // 자기 자신을 선언
    // static을 사용했으므로, 클래스 내에 1개만 존재
    private static final SingletonService instance = new SingletonService();

    // 조회할 때 사용
    public static SingletonService getInstance() {
        return instance;
    }

    // 외부에서 new 키워드를 사용하지 못하도록 private 생성자 생성
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
