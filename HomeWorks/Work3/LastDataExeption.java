package HomeWorks.Work3;

public class LastDataExeption extends RuntimeException {
    public LastDataExeption(){
        super("Введено меньше данных!");
    }
}
