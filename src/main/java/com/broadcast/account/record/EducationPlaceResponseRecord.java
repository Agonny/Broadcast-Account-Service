package com.broadcast.account.record;

import com.broadcast.account.enums.EducationPlaceType;

public record EducationPlaceResponseRecord(
        String name,
        String address,
        EducationPlaceType type
) {}
