package pageobjects;

import pageobjects.components.BottomBarComponent;

public class MoreFramePO {
    BottomBarComponent bottomBarComponent = new BottomBarComponent();

    public MoreFramePO openMoreFrame(){
        bottomBarComponent.openNeededMenuInBar("More");

        return this;
    }
}
