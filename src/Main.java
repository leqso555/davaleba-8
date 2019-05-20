public class Main {
    public static void main(String[] args) throws WrongNumberExeption {
    oddNumber(12);
    num(12);
    }

    private static int oddNumber(int number) throws WrongNumberExeption {
        if(number%2!=0){
            throw new WrongNumberExeption("tqven sheiyvanet araswori ricxvi");
        }
        else
            return 0;
    }
    private static void num(int number){
        if(number>5){
            try {
                throw new WrongNumberExeption("araswori ricxvi");
            } catch (WrongNumberExeption wrongNumberExeption) {
                wrongNumberExeption.printStackTrace();
            }
        }
    }
}
