package com.cleancode.chapternine;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author zen
 * @since 2017/07/31
 */
public class TennisGameTest {

    private final String player1Name = "SuperMan";
    private final String player2Name = "BatMan";
    private final TennisGame game = new TennisGame(player1Name, player2Name);

    @Test
    public void test_getScore_WHEN_game_just_starts_THEN_player1Is0_and_player2Is0() throws Exception {
        // WHEN
        String result = game.getScore();

        // THEN
        assertThat(result).isEqualTo("LOVE all");

    }

    @Test
    public void test_getScore_WHEN_p1Score1_p2Score0_THEN_game_result_p1_advantage() throws Exception {
        // GIVEN
        game.score(player1Name);
        // WHEN
        String result = game.getScore();
        // THEN
        assertThat(result).isEqualTo(player1Name + " advantage");
    }

    @Test
    public void test_getScore_WHEN_p1Score0_p2Score1_THEN_game_result_p2_advantage() throws Exception {
        // GIVEN
        game.score(player2Name);
        // WHEN
        String result = game.getScore();
        // THEN
        assertThat(result).isEqualTo(player2Name + " advantage");

    }

}