/*
 * Copyright (c) 2019 Intel Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intel.multicamera;

public class MultiCamera {
    private static MultiCamera ic_instance = null;

    MultiCamera() {
        WhichCamera = 0;
        IsCameraOrSurveillance = 0;
    }
    public static MultiCamera getInstance() {
        if (ic_instance == null) {
            ic_instance = new MultiCamera();
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
