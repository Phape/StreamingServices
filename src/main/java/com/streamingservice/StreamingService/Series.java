package com.streamingservice.StreamingService;

import lombok.Data;

//todo: Klasse wie StreamingService gestalten (GuestBookEntry)
@Data
public class Series {
    public StreamingService streamingService;
    public String id = "";
    public String name = "";
    public String country = "";
    public int fromYear = -1;
    public int toYear = -1;
    public int maxSeasons = -1;
    public int numberOfEpisodes = -1;
    public boolean inProduction = false;
}