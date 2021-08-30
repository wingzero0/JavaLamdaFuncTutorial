package wingzero0.personal.lamda.utils;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class LamdaFunc {
    public static <T extends LinkElement2, R> List<R> traversalElementMap(T e, Function<T, R> mapFunc) {
        List<R> listOfReturn = new ArrayList<R>();
        T checkPoint = e;
        while (true) {
            R r = mapFunc.apply(checkPoint);
            listOfReturn.add(r);
            if (checkPoint.hasNext()) {
                @SuppressWarnings("unchecked")
                T _checkPoint = (T) checkPoint.getNext();
                checkPoint = _checkPoint;
            } else {
                break;
            }
        }
        return listOfReturn;
    }

    public static Function<MyNumber2, BigDecimal> doubleIt2 = (e -> {
        return BigDecimal.valueOf(e.getNumberValue().doubleValue()).multiply(BigDecimal.valueOf(2));
    });
}
