package com.weapes.ntpaprseng.crawler.extract;

import java.util.List;

public interface Extractable {
    boolean isMulti(); // 是否抽取出多个Etd,两种情况属于互斥事件。

    ExtractedObject extract(); // 抽取单个Etd

    List<? extends ExtractedObject> extractAll(); // 抽取多个Etd
}
