package step5_racing_car;

import org.junit.jupiter.api.Test;
import step5_racing_car.domain.CarList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarListTest {
    @Test
    public void getNamesTest(){
        CarList carList = new CarList();
        assertThat( carList.getNames("a,b,c")).isEqualTo(new String[] {"a","b","c"});
    }
    @Test
    public void getIndexNamesTest(){
        CarList carList = new CarList();
        assertThat(carList.getIndexNames(new String[] {"a","b", "c"}, new int[] {1})).isEqualTo(new String[] {"b"});
    }


}
