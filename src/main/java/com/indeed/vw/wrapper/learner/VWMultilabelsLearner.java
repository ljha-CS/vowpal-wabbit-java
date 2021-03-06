package com.indeed.vw.wrapper.learner;


public final class VWMultilabelsLearner extends VWLearnerBase<Multilabels> {
    VWMultilabelsLearner(final long nativePointer) {
        super(nativePointer);
    }

    @Override
    protected native Multilabels predict(String example, boolean learn, long nativePointer);

    @Override
    protected native Multilabels predictMultiline(String[] example, boolean learn, long nativePointer);
}
