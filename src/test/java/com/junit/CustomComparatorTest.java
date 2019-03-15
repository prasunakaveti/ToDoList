package com.junit;
/* *
 * Created by @ gnanaprasunakaveti on 2019-03-15
 *
 */

import com.trainee.ip.CustomComparator;
import com.trainee.ip.Model;
import org.junit.Test;
import java.util.ArrayList;
import static junit.framework.TestCase.assertTrue;

public class CustomComparatorTest {

    @Test
    public void compareTest(){

        CustomComparator customComparator = new CustomComparator();
        ArrayList<Model> todoList1 = new ArrayList<Model>();
        Model model1 = new Model();
        Model model2 = new Model();
        model1.setDueDate("2019-03-20");
        model2.setDueDate("2019-03-20");
        int result = customComparator.compare(model1, model2);
        assertTrue("expected to be equal", result == 0);

    }

}
