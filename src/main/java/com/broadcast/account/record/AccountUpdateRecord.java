package com.broadcast.account.record;

import java.util.Set;

public record AccountUpdateRecord(
        Long id,
        String email,
        String firstName,
        String secondName,
        String dateOfBirth,
        Short age,
        Set<Long> educationPlaceIds
) {}
