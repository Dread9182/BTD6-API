package com.dread9182.BTD6API.models;

import com.dread9182.BTD6API.auxiliaryclass.MapTrack;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("maps")
public class Map {
	@Id
	private String id;
	
	private String name;
	
	private String difficulty;
	
	private List<MapTrack> tracks;
}
