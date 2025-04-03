package com.broadcast.account.record;

import java.time.LocalDateTime;

public record EducationPeriodResponseRecord(
        LocalDateTime dateFrom,
        LocalDateTime dateTo,
        EducationPlaceResponseRecord educationPlace
) {}
