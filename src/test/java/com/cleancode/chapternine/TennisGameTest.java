package com.cleancode.chapternine;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author zen
 * @since 2017/07/31
 */
public class TennisGameTest {
    @Test
    public void test_getScore_WHEN_game_just_starts_THEN_player1Is0_and_player2Is0() throws Exception {
        // GIVEN
        TennisGame game = new TennisGame("SuperMan", "BatMan");

        // WHEN
        String result = game.getScore();

        // THEN
        assertThat(result).isEqualTo("LOVE all");

    }

    @Test
    public void test_getScore_WHEN_p1Score1_p2Score0_THEN_game_result_p1_advantage() throws Exception {
        // GIVEN
        TennisGame game = new TennisGame("SuperMan", "BatMan");
        game.score("SuperMan");
        // WHEN
        String result = game.getScore();

        // THEN
        assertThat(result).isEqualTo("SuperMan advantage");
    }


}