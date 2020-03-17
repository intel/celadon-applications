package com.intel.multicamera;

import java.util.ArrayList;
import java.util.HashMap;

public class IntelCamera {
    private static IntelCamera ic_instance = null;

    IntelCamera() {
        WhichCamera = 0;
        IsCameraOrSurveillance = 0;
    }
    public static IntelCamera getInstance() {
        if (ic_instance == null) {
            ic_instance = new IntelCamera();
        }

        return ic_instance;
    }

    private int WhichCamera;

    private int IsCameraOrSurveillance;

    public int getWhichCamera() {
        return WhichCamera;
    }

    public void setWhichCamera(int whichCamera) {
        WhichCamera = whichCamera;
    }

    public int getIsCameraOrSurveillance() {
        return IsCameraOrSurveillance;
    }

    public void setIsCameraOrSurveillance(int isCameraOrSurveillance) {
        IsCameraOrSurveillance = isCameraOrSurveillance;
    }
}
