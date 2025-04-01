package com.broadcast.account.record;

import java.time.LocalDateTime;
import java.util.Set;

public record AccountResponseRecord(
        Long id,
        String email,
        String firstName,
        String secondName,
        String dateOfBirth,
        Short age,
        String photoId,
        Set<EducationPeriodResponseRecord> educationPeriods,
        Boolean isOnline,
        LocalDateTime lastOnlineAt) {}
