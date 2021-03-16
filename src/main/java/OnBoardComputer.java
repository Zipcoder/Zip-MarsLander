public class OnBoardComputer implements BurnStream {
    int burnArray[] = {0,0,200,200,200,200,200,200,200,200,200,200,200,170,100,100,130,95,104,100,100,100,100};
    int burnIdx = -1;

    @Override
    public int getNextBurn(DescentEvent status) {
        if (burnIdx < burnArray.length) {
            burnIdx++;
            System.out.println(burnArray[burnIdx]); /*hack!*/
            return burnArray[burnIdx];
        }
        return 0;
    }

}
