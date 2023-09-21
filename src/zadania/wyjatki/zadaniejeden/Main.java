package zadania.wyjatki.zadaniejeden;

class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Entry entry = new Entry();
        boolean flag = true;

        do {
            try {
                System.out.println(calculator.calculate());
                flag = false;
            }catch (ArithmeticException | UnknownOperatorException e){
                System.out.println(e.getMessage());
            }finally {
                entry.closeScanner();
            }
        }while (flag);
    }
}
