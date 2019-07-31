package rxjava.bruno.al;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;

class ComputeFunction {
    public static String computeResult;

    public static String observerResult;

    // Subject
    public Integer firstSubscriber = 0;
    public Integer secondSubscriber = 0;
    public PublishSubject<Integer> publishSubject = PublishSubject.create();

    public static void compute() {
        Observable<String> observable = Observable.just("Hello");
        observable.subscribe(s -> {
            computeResult = s;
            System.out.println(s);
        });
    }

    public static void observer() {
        String[] letters = { "a", "b", "c", "d", "e", "f", "g" };
        Observable<String> observable = Observable.fromArray(letters);
        observable.subscribe(
            i -> observerResult += i, // OnNext
            Throwable::printStackTrace, //Error
            () -> observerResult += "_Completed" // OnCompleted
        );
    }

    public Observer<Integer> getFirstObserver() {
        return new Observer<Integer>() {

            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Integer t) {
                firstSubscriber += t;
                System.out.println("First Subscriber " + t);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("error");
            }

            @Override
            public void onComplete() {
                System.out.println("First Subscriber completed");
            }
        };
    }

    public Observer<Integer> getSecondObserver() {
        return new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                
            }

            @Override
            public void onNext(Integer t) {
                secondSubscriber += t;
                System.out.println("Second Subscriber " + t);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("error");
            }

            @Override
            public void onComplete() {
                System.out.println("Second Subscriber completed");
            }
        };
    }
    
    public void subjects () {
        publishSubject.subscribe(getFirstObserver());
        publishSubject.onNext(1); 
        publishSubject.onNext(2); 
        publishSubject.onNext(3); 
        publishSubject.subscribe(getSecondObserver()); 
        publishSubject.onNext(4); 
        publishSubject.onComplete();
    }
    
}