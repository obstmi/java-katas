import org.junit.Assert;
import org.junit.Test;

public class ArenaTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testFight1() throws Exception {
        Worm worm1 = new Worm("Brandon", 18, 4);
        Worm worm2 = new Worm("Peter" , 16, 5);
        Assert.assertEquals("Brandon", Arena.fight(worm1, worm2));
    }

    @Test
    public void testFight2() throws Exception {
        Worm worm1 = new Worm("John", 2, 5);
        Worm worm2 = new Worm("Michelle" , 6, 5);
        Assert.assertEquals("Michelle", Arena.fight(worm1, worm2));
    }

    @Test
    public void testFight3() throws Exception {
        Worm worm1 = new Worm("Kevin", 12, 4);
        Worm worm2 = new Worm("Gwen" , 12, 4);
        Assert.assertEquals("Kevin", Arena.fight(worm1, worm2));
    }
}
