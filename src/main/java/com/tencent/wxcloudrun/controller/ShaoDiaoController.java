package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.CounterRequest;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.service.CounterService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * 沙雕日常
 */
@RestController

public class ShaoDiaoController {

  final Logger logger;

  public ShaoDiaoController() {
    this.logger = LoggerFactory.getLogger(ShaoDiaoController.class);
  }


  /**
   * 获取一份毒鸡汤
   * @return API response json
   */
  @GetMapping(value = "/shaodiao/dujitang")
  ApiResponse get() {
    String test = "毒鸡汤来咯";
    return ApiResponse.ok(test);
  }


}