package com.lin.design_patterns.factory_pattern.abstract_factory;

import com.lin.design_patterns.factory_pattern.Sender;

public interface Provider {

    Sender produce();
}
