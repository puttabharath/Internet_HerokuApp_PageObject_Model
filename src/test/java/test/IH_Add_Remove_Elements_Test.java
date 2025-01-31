package test;

import org.testng.annotations.Test;
import pages.IH_Add_Remove_Elements_Module;
import testComponents.Baseclass;

public class IH_Add_Remove_Elements_Test extends Baseclass {

    @Test (priority = 4)
    public void IHAddRemoveElementsTest(){
        IH_Add_Remove_Elements_Module Ade = new IH_Add_Remove_Elements_Module(driver);
        Ade.IHAddRemoveElements();
    }
}
