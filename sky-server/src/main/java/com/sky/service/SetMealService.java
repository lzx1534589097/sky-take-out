package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;

public interface SetMealService {

    PageResult page(SetmealPageQueryDTO setmealPageQueryDTO);

    void stopOrStart(int status, long id);

    void saveWithDish(SetmealDTO setmealDTO);
}
