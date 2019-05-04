package com.consumeredis.consumeredis;

public interface EventProcessingService {

    void process(PostPublishedEvent event);
}
