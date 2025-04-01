package com.broadcast.account.record;

import org.springframework.web.multipart.MultipartFile;

public record AccountCreateRecord(
        String email,
        String firstName,
        String secondName,
        String dateOfBirth,
        Short age,
        MultipartFile accountImage
) {}
