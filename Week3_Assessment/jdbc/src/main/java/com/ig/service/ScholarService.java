package com.ig.service;

import java.util.List;

import com.ig.model.Scholar;

public interface ScholarService {
    void addScholar(Scholar scholar) throws Exception;
    List<Scholar> listAllScholars() throws Exception;
    Scholar findScholarById(int id) throws Exception;
    void deleteScholarById(int id) throws Exception;
    void updateScholarEmail(int id, String email) throws Exception;
}

