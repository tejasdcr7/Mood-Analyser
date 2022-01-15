import com.blz.mood.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

@Test
    public void analyseSadMood(){
    MoodAnalyser moodAnalyser = new MoodAnalyser();
    moodAnalyser.setMessage("I am in Sad Mood");
    String Result = moodAnalyser.analyseMood();
    Assert.assertEquals("SAD",Result);
    }

    @Test
    public void analyseHappyMood(){
    MoodAnalyser moodAnalyser = new MoodAnalyser();
    moodAnalyser.setMessage("I am in Happy Mood");
    String expectedResult = moodAnalyser.analyseMood();
    Assert.assertEquals("Happy",expectedResult);
    }

    @Test
    public void analyseNull(){
    MoodAnalyser moodAnalyser = new MoodAnalyser();
    moodAnalyser.setMessage(null);
    String expectedResult = moodAnalyser.analyseMood();
    Assert.assertEquals("Happy",expectedResult);
    }
}
