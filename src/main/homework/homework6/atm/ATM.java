package homework.homework6.atm;

public class ATM {
    private int numberOfTwenty;
    private int numberOfFifty;
    private int numberOfHundreds;

    public void addMoney(int numberOfTwenty, int numberOfFifty, int numberOfHundreds) {
        this.numberOfTwenty += numberOfTwenty;
        this.numberOfFifty += numberOfFifty;
        this.numberOfHundreds += numberOfHundreds;
    }

    public ATM(int numberOfTwenty, int numberOfFifty, int numberOfHundreds) {
        this.numberOfTwenty = numberOfTwenty;
        this.numberOfFifty = numberOfFifty;
        this.numberOfHundreds = numberOfHundreds;
    }

    /*
    Алгоритм на основе динамического программирования.
     */
    public boolean getMoney(int amount) {
        int numberOfBanknotes = numberOfTwenty + numberOfFifty + numberOfHundreds;

        //Создаю список имеющихся у меня купюр.
        int copyNumberOfTwenty = numberOfTwenty;
        int copyNumberOfFifty = numberOfFifty;
        int copyNumberOfHundreds = numberOfHundreds;
        int tempCounter = 0;

        int[] banknotes = new int[numberOfBanknotes];
        while(copyNumberOfHundreds > 0){
            banknotes[tempCounter++] = 100;
            copyNumberOfHundreds--;
        }
        while(copyNumberOfFifty > 0){
            banknotes[tempCounter++] = 50;
            copyNumberOfFifty--;
        }
        while(copyNumberOfTwenty > 0){
            banknotes[tempCounter++] = 20;
            copyNumberOfTwenty--;
        }

        //Определяю суммы и купюры, которыми можно выдать эти суммы.
        MapATM sums = new MapATM();
        sums.put(0, 0);

        //Рассматриваю каждую купюру
        for(int i = 0; i < numberOfBanknotes; i++){
            int banknote = banknotes[i];
            int[] keys = sums.getKeys();
            for (int key : keys) {
                int newSum = key + banknote;
                if (newSum <= amount) { //Дублирующиеся суммы и суммы, котоыре больше чем amount, меня не интересуют
                    sums.put(newSum, banknote);
                }
            }
            if(sums.containInKeys(amount)){ //Выходим из цикла если получаем необходимую нам сумму
                break;
            }
        }

        //Вывод
        if(sums.containInKeys(amount)){
            System.out.println("*******************************");
            System.out.println("Your amount is " + amount);
            getBanknotes(amount, sums);
            System.out.println("*******************************");
            return true;
        }else{
            int nearestValue = Math.max(sums.getNearestKey(amount), 20);
            System.out.println("****ERROR. Incorrect amount****");
            System.out.println("Nearest value = " + nearestValue);
            System.out.println("*******************************");
            return false;
        }
    }

    private void getBanknotes(int amount, MapATM sums){
        int banknote = sums.get(amount);
        System.out.println(banknote + "$");
        if(amount != banknote){
            getBanknotes(amount - banknote, sums);
        }
        switch (banknote) {
            case 20 -> numberOfTwenty--;
            case 50 -> numberOfFifty--;
            case 100 -> numberOfHundreds--;
        }
    }
}
