package rxjava;

import rx.Observable;

public class Application {

    public static void main(String[] args) {
    	
        long startTime = System.currentTimeMillis();

        Observable<Integer> observable = Observable.range(1, 1_000_000);

        observable
            .doOnCompleted(() -> {
                long endTime = System.currentTimeMillis();
                long duration = endTime - startTime;
                System.out.println("Tempo total de execução: " + duration + " ms");
            })
            .doOnNext(System.out::println)
            .subscribe();
    }
}
