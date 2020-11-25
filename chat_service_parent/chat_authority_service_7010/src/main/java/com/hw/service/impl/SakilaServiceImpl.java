package com.hw.service.impl;

import com.hw.domain.Sakila;
import com.hw.mapper.SakilaMapper;
import com.hw.service.SakilaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SuppressWarnings("all")
public class SakilaServiceImpl implements SakilaService {

    @Autowired
    private SakilaMapper sakilaMapper;

    @Override
    public List<Sakila> selectAll() {
        List<Sakila> sakilaList = sakilaMapper.selectAll();
        return sakilaList;
    }
}
