package homeworks_completed;

//Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см. Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.
//В качестве подсказки - лучше всего создать метод для вычисления калорий в зависимости от диаметра пиццы, его можно использовать дважды (не забываем про переиспользование) и получим дельту, это и будет ответ. Формулу для нахождения площади пиццы (и не только) можно найти на просторах интернета.
public class HmPizza {
    private double p24, p28, p24result, p28result;

    public HmPizza(double p24, double p28) {
        this.p24 = p24;
        this.p28 = p28;
        p24sm();
        p28sm();
    }

    private void p24sm() {
        // x^2 / 4 * Pi = formula dla vicisleniya Diam.
        p24result = Math.pow(p24, 2) / 4 * Math.PI * 40;
    }

    private void p28sm() {
        p28result = Math.pow(p28, 2) / 4 * Math.PI * 40;
    }

    public void print() {
//        System.out.println("Килокалорий пиццы диаметром 24 см = " + (int)r1);
//        System.out.println("Килокалорий пиццы диаметром 28 см = " + (int)r2);
        System.out.println("Дельта --> " + (int) (p28result - p24result) + " Килокалорий ");
    }

    public static void main(String[] args) {
        double p = 24;
        double p2 = 28;

        HmPizza De = new HmPizza(p, p2);
        De.print();
    }
}


