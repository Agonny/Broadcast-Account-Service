package com.broadcast.account.service;

import com.broadcast.account.model.Account;
import com.broadcast.account.repository.EducationPeriodRepository;
import com.broadcast.account.repository.EducationPlaceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.util.Arrays;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class EducationService {

    private final EducationPlaceRepository educationPlaceRepository;

    private final EducationPeriodRepository educationPeriodRepository;

    public void updateEducationPeriods(Account account) {
//        int[] ass = new int[4];
//        ass[0].length;
//        Set<String> set = new TreeSet<>(Set.of("", "s"));
//        List<Integer> list = new ArrayList(2);
//
//
//        String d = "dsa";
//        d.contains()
//        TreeSet<Integer> skk = Set.of(4);
//        TreeMap<Integer, String> kd = new TreeMap<>();
//        Queue<String> s = new LinkedList();
//        s.poll();
//        Collections.
//        kd.lowerEntry()
//        skk.add(4);
//        skk.floor()
// Arrays.copyOfRange()
    }

}
