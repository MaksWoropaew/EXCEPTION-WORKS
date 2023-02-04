package HomeWorks.Work3;

public class MoreDateExeption extends RuntimeException {
    public MoreDateExeption(){
        super("Введено больше данных, чем необходимо! ");
    }
}
