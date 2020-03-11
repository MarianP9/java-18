package week_13_io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AthleteResultTest {

    AthleteResult athleteResult;

    @Test
    void getPenaltySeconds_noPenalties_return0() {
        athleteResult = new AthleteResult(0, "", "", "", "xxxxx", "xxxxx", "xxxxx");
        assertEquals(0, athleteResult.getPenaltySeconds());
    }

    @Test
    void getPenaltySeconds_allPenalties_return150() {
        athleteResult = new AthleteResult(0, "", "", "", "ooooo", "ooooo", "ooooo");
        assertEquals(150, athleteResult.getPenaltySeconds());
    }

    @Test
    void getPenaltySeconds_mixedPenalties_return70() {
        athleteResult = new AthleteResult(0, "", "", "", "xoxox", "ooooo", "xxxxx");
        assertEquals(70, athleteResult.getPenaltySeconds());
    }



    @Test
    void getFinalTimeResult_noTimeAllPenalties_return2min30sec() {
        athleteResult = new AthleteResult(0, "", "", "00:00", "ooooo", "ooooo", "ooooo");
        assertEquals("2:30", athleteResult.getFinalTimeResult());
    }

    @Test
    void getFinalTimeResult_noTimeNoPenalties_return0min0sec() {
        athleteResult = new AthleteResult(0, "", "", "00:00", "xxxxx", "xxxxx", "xxxxx");
        assertEquals("0:00", athleteResult.getFinalTimeResult());
    }

    @Test
    void getFinalTimeResult_mixedTimeAllPenalties_return15min4sec() {
        athleteResult = new AthleteResult(0, "", "", "12:34", "ooooo", "ooooo", "ooooo");
        assertEquals("15:04", athleteResult.getFinalTimeResult());
    }

    @Test
    void getFinalTimeResult_mixedTimeNoPenalties_return12min34sec() {
        athleteResult = new AthleteResult(0, "", "", "12:34", "xxxxx", "xxxxx", "xxxxx");
        assertEquals("12:34", athleteResult.getFinalTimeResult());
    }

    @Test
    void getFinalTimeResult_mixedTimeMixedPenalties_return30min57sec() {
        athleteResult = new AthleteResult(0, "", "", "30:27", "xxoxx", "xoxxx", "xxxox");
        assertEquals("30:57", athleteResult.getFinalTimeResult());
    }
}