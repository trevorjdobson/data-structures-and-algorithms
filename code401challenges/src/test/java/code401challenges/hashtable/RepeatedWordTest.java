package code401challenges.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void getFirstRepeatedWord() {
        String firstRepeat = RepeatedWord.getFirstRepeatedWord("test this this");
        String expected = "this";
        assertEquals(expected,firstRepeat);
    }
    @Test
    public void getFirstRepeatedWord_Again(){
        String firstRepeat = RepeatedWord.getFirstRepeatedWord("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only");
        String expected = "it";
        assertEquals(expected,firstRepeat);
    }
    @Test
    public void getFirstRepeatedWord_AgainAndAgain(){
        String firstRepeat = RepeatedWord.getFirstRepeatedWord("Once upon a time, there was a brave princess who");
        String expected = "a";
        assertEquals(expected,firstRepeat);
    }
    @Test
    public void getFirstRepeatedWord_NoRepeat() {
        String firstRepeat = RepeatedWord.getFirstRepeatedWord("test this with no repeat");

        assertEquals(null,firstRepeat);
    }

}