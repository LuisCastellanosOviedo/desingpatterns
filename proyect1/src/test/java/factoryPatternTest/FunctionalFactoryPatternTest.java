package factoryPatternTest;

import factoryPattern.FordwardPlayer;
import factoryPattern.Player;
import factoryPattern.PlayerFactory;
import org.junit.Assert;
import org.junit.Test;

public class FunctionalFactoryPatternTest {



    @Test
    public void createFactory() {
        Assert.assertNotNull(PlayerFactory.getInstance());
    }

    @Test
    public void getForwardPlayer() {
        Assert.assertEquals("fordward",PlayerFactory.getInstance().getPlayer("fordward").getType());
    }

    @Test
    public void getGoalKeeper(){
        Assert.assertEquals("goalKeeper", PlayerFactory.getInstance().getPlayer("goalKeeper").getType());
    }

}
