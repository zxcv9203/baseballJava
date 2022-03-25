package com.programmers.java.baseball.engine.io;

import com.programmers.java.baseball.engine.model.BallCount;

public interface Output {
    void inputError();

    void correct();

    void ballCount(BallCount bc);
}
