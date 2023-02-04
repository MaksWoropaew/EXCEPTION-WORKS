package HomeWorks.Work3;

public class IncorrectFIOExeption extends RuntimeException{
    public IncorrectFIOExeption(){
        super("Некоректное заполнение ФИО!");
    }
    
}
