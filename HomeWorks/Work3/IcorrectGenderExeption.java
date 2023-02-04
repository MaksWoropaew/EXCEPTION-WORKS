package HomeWorks.Work3;

public class IcorrectGenderExeption extends RuntimeException {
    public IcorrectGenderExeption(){
        super("Некоректный пол человека!");
    }
}
