/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2019. All rights reserved.
 */

package com.huawei.hms.location.workshop.logger;

public interface LogNode {
    void println(int priority, String tag, String msg, Throwable tr);
}
