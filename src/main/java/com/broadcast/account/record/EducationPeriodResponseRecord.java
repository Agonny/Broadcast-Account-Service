package com.broadcast.account.record;

import java.time.LocalDateTime;

public record EducationPeriodResponseRecord(
        LocalDateTime from,
        LocalDateTime to,
        EducationPlaceResponseRecord educationPlace
) {}
