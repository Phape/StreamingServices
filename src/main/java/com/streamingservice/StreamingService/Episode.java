package com.streamingservice.StreamingService;

import lombok.Data;

@Data
public class Episode {
    public long id = (long)-1;
    public Series series;
    public int season;
    public int number;
    public String imdbId;
    public String name;
}