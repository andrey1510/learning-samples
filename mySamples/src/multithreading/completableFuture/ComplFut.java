package multithreading.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class ComplFut {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //////// Выполнение асинхронных задач с использованием runAsync()

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("separate thread");
        });

        future.get();



        /////////Выполнение асинхронной задачи и возврат результата с использованием supplyAsync()

        CompletableFuture<String> future66 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Результат асинхронной задачи";
        });

        String result = future66.get();
        System.out.println(result);



        /////// thenApply()

        // Создаём CompletableFuture
        CompletableFuture<String> whatsYourNameFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Rajeev";
        });

        // Добавляем колбэк к Future, используя thenApply()
        CompletableFuture<String> greetingFuture = whatsYourNameFuture.thenApply(name -> {
            return "Привет," + name;
        });

        // Блокировка и получение результата Future
        System.out.println(greetingFuture.get());





        ///////////////// Комбинирование двух независимых задач, с использованием thenCombine()

        System.out.println("Получение веса.");
        CompletableFuture<Double> weightInKgFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return 65.0;
        });

        System.out.println("Получение роста.");
        CompletableFuture<Double> heightInCmFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return 177.8;
        });

        System.out.println("Расчёт индекса массы тела.");
        CompletableFuture<Double> combinedFuture = weightInKgFuture
                .thenCombine(heightInCmFuture, (weightInKg, heightInCm) -> {
                    Double heightInMeter = heightInCm / 100;
                    return weightInKg/(heightInMeter * heightInMeter);
                });

        System.out.println("Ваш индекс массы тела - " + combinedFuture.get());



        ///////////////////////  CompletableFuture.anyOf()

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Результат Future 1";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Результат Future 2";
        });

        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Результат Future 3";
        });

        CompletableFuture<Object> anyOfFuture = CompletableFuture.anyOf(future1, future2, future3);

        System.out.println(anyOfFuture.get()); // Результат Future 2



        ///////////// Обработка исключений с использованием метода exceptionally()

        Integer age = -1;

        CompletableFuture<String> maturityFuture = CompletableFuture.supplyAsync(() -> {
            if (age < 0) {
                throw new IllegalArgumentException("Возраст не может быть отрицательным");
            }
            if (age > 18) {
                return "Взрослый";
            } else {
                return "Ребёнок";
            }
        }).exceptionally(ex -> {
            System.out.println("Ой! У нас тут исключение - " + ex.getMessage());
            return "Неизвестно!";
        });

        System.out.println("Зрелость: " + maturityFuture.get());



        ///////////////// Обработка исключений с использованием метода handle()

        Integer age2 = -1;

        CompletableFuture<String> maturityFuture2 = CompletableFuture.supplyAsync(() -> {
            if (age2 < 0) {
                throw new IllegalArgumentException("Возраст не может быть отрицательным");
            }
            if (age2 > 18) {
                return "Взрослый";
            } else {
                return "Ребёнок";
            }
        }).handle((res, ex) -> {
            if (ex != null) {
                System.out.println("Ой! У нас тут исключение - " + ex.getMessage());
                return "Неизвестно!";
            }
            return res;
        });

        System.out.println("Зрелость: " + maturityFuture2.get());


    }




}
