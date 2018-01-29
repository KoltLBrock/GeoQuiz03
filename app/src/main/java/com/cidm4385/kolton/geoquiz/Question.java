package com.cidm4385.kolton.geoquiz;

/**
 * Created by John on 1/28/2018.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private int mAnswered;

    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mAnswered = 0;
    }
    public void setAnswered(int answered) {
        mAnswered = answered;
    }
    public int isAnswered() {
        return mAnswered;
    }
    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
