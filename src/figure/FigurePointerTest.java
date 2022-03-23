package figure;

public class FigurePointerTest {

    public static void main(String[] args) {

        FigurePointer figurePointer = new FigurePointer();
        figurePointer.figureOne(5,'.');
        figurePointer.figureTwo(5,'+');
        figurePointer.figureThree(5,'-');
        figurePointer.figureFour(5,'/');
        figurePointer.figureFive(5,4,'!');
        figurePointer.figureSix(10,'^');
        figurePointer.figureSeven(10,'$');
        figurePointer.figureEight(5,4,'|');
    }
}
