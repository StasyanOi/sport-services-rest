package org.application.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoomRequestCreateDto {
    private Long roomId;
    private Long trainerId;
    private LocalDateTime start;
    private LocalDateTime end;
}
